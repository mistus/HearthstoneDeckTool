package mistus.hearthstonedecktool.Activity;

import android.app.DialogFragment;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.Menu;

import java.util.HashMap;

import mistus.hearthstonedecktool.CardView.Card.CardRecycleViewAdapter;
import mistus.hearthstonedecktool.Common.Common;
import mistus.hearthstonedecktool.Database.DeckToolDatabaseHelper;
import mistus.hearthstonedecktool.FragmentDialog.deck_list_detail_fragment_dialog;
import mistus.hearthstonedecktool.FragmentDialog.saveCardListFragmentDialog;
import mistus.hearthstonedecktool.R;


public class DeckEditActivity extends AppCompatActivity {

    private RecyclerView cardRecyclerView;
    private String deckName;
    private String careerName;
    private int careerNameId;
    private String TypeName;
    private HashMap<String, Integer> cardList;
    private ActionBar actionbar;
    private RadioGroup cardLevelRadioGroup;
    private EditText searchBar;
    private CheckBox isCareerCheckbox;
    private CheckBox isCommonCheckbox;
    private Button decideButton;

    public int getCareerNameId() {
        return careerNameId;
    }

    public String getTypeName() {
        return TypeName;
    }

    public HashMap<String, Integer> getCardList() {
        return cardList;
    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }
    private RecyclerView DeckListDetailRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deck_edit_layout);
        _init();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_deck_edit_page, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.deckDetailIcon:
                _open_deck_detail_button_event();
                return true;
            case R.id.deckSaveIcon:
                _saveDeckButtonEvent();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void _init(){
        cardLevelRadioGroup = (RadioGroup)findViewById(R.id.cardLevel);
        searchBar = (EditText)findViewById(R.id.SearchBar);
        isCareerCheckbox = (CheckBox)findViewById(R.id.isCareer);
        isCommonCheckbox = (CheckBox)findViewById(R.id.isCommon);
        decideButton = (Button)findViewById(R.id.decide);
        actionbar = getSupportActionBar();

        Intent intent = getIntent();

        cardList = (HashMap)intent.getSerializableExtra("cardList");
        if (cardList==null){
           cardList = new HashMap<String, Integer>();
        }

        deckName = intent.getStringExtra("deckName");
        actionbar.setTitle(deckName);

        careerName = intent.getStringExtra("careerName");
        TypeName = intent.getStringExtra("TypeName");
        careerNameId = _getCareerNameId(careerName);

        decideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _decideClickEvent();
            }
        });

        DeckListDetailRecycler = (RecyclerView)findViewById(R.id.deck_list_recycler);
        String SQL = getSQL();
        _createCards(SQL);
    }

    private String getSQL() {
        int checkedLevelId = cardLevelRadioGroup.getCheckedRadioButtonId();
        RadioButton levelRadioButton = (RadioButton)cardLevelRadioGroup.findViewById(checkedLevelId);

        //Searchに関するSQLConditionを取得する
        //selectConditionLevel
        String selectConditionLevel = "";
        if(levelRadioButton != null){
            String level = levelRadioButton.getText().toString();
            switch(level){
                case "7":
                    selectConditionLevel = "level >= 7 and ";
                    break;
                default:
                    selectConditionLevel = "level = "+ level + " and ";
                    break;
            }
        }

        //selectConditionSearchBar
        String Search = toString().valueOf(searchBar.getText());
        String selectConditionSearchBar = "";
        if(Search != null && Search != ""){
             selectConditionSearchBar =
                    "(name like '%"+Search+"%' " +
                    "or description like '%"+Search+"%' " +
                    "or type like '%"+Search+"%') and ";
        }

        //selectConditionDeckType
        String selectConditionCardType = "";
        if(TypeName.equals(Common.typeStandard) ){
            selectConditionCardType = selectConditionCardType+"(";
            String[] standardSeries = Common.standardSeries;
            for(String series:standardSeries){
                selectConditionCardType= selectConditionCardType +" series = '"+ series + "' or ";
            }
            int conditionLength = selectConditionCardType.length();
            selectConditionCardType = selectConditionCardType.substring(0, conditionLength-3);
            selectConditionCardType = selectConditionCardType +") and ";
        }

        //selectConditionCareer Job = "+ careerNameId
        String selectConditionCareer = "";
        if(isCareerCheckbox.isChecked() == isCommonCheckbox.isChecked()){
            selectConditionCareer = "(Job = " + careerNameId + " or Job = "+Common.general +")";
        }else if(isCareerCheckbox.isChecked()){
            selectConditionCareer = "(Job = " + careerNameId +")";
        }else{
            selectConditionCareer = "(Job = " + Common.general +")";
        }

        String SQL = "select * from card where ";
        SQL = SQL + selectConditionLevel;
        SQL = SQL + selectConditionSearchBar;
        SQL = SQL + selectConditionCardType;
        SQL = SQL + selectConditionCareer;
        return SQL;
    }

    private void _decideClickEvent(){
        searchBar.clearFocus();
        String SQL = getSQL();
        _createCards(SQL);
    }

    private void _createCards(String SQL){
        cardRecyclerView = (RecyclerView)findViewById(R.id.card_recycler);

        SQLiteOpenHelper DeckToolDatabaseHelper = new DeckToolDatabaseHelper(this);
        SQLiteDatabase DB = DeckToolDatabaseHelper.getReadableDatabase();
        //TODO change SQL
//        Cursor cursor = DB.rawQuery("select * from card",null);
        Cursor cursor = DB.rawQuery(SQL, null);
        int count = cursor.getCount();
        int[] ids = new int[count] ;
        String[] names = new String [count];

        for(int i=0; i < count; i++){
            cursor.moveToNext();
            ids[i] = cursor.getInt(0);
            names[i] = cursor.getString(1);
        }

        cursor.close();
        DB.close();

        CardRecycleViewAdapter adapter = new CardRecycleViewAdapter(ids, names, this);
        cardRecyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        cardRecyclerView.setLayoutManager(layoutManager);
        cardRecyclerView.setAdapter(adapter);
    }

    private int _getCareerNameId(String CareerName){
        switch (CareerName){
            case "戰士":
                return Common.warrior;
            case "薩滿":
                return Common.shaman;
            case "盜賊":
                return Common.rogue;
            case "聖騎士":
                return Common.paladin;
            case "獵人":
                return Common.hunter;
            case "德魯伊":
                return Common.druid;
            case "術士":
                return Common.warlock;
            case "法師":
                return Common.mage;
            case "牧師":
                return Common.priest;
            default:
                return 0;
        }
    }

    private void _open_deck_detail_button_event(){
        DialogFragment dialog = new deck_list_detail_fragment_dialog();
        Bundle bundle = new Bundle();
        bundle.putSerializable("cardList",cardList);
        dialog.setArguments(bundle);
        dialog.show(this.getFragmentManager(), "deck_list_detail_fragment_dialog");
    }

    private void _saveDeckButtonEvent(){
        DialogFragment dialog = new saveCardListFragmentDialog();
        Bundle bundle = new Bundle();
        bundle.putSerializable("cardList",cardList);
        bundle.putSerializable("deckName",deckName);
        dialog.setArguments(bundle);
        dialog.show(this.getFragmentManager(), "saveCardListFragmentDialog");
    }

    public int addCardList(String key){

        //TODO 確認是否傳說
        // >29 return
        int deckCardAmount = getCardAmount();
        if(deckCardAmount > 29){
            return -1;
        }

        //isExist -> add
        boolean exist = cardList.containsKey(key);

        if(exist){
            int cardAmount = cardList.get(key);
            if(cardAmount > 1){
                return cardAmount;
            }

            cardList.remove(key);
            cardAmount = cardAmount +1 ;
            cardList.put(key, cardAmount);
            return cardAmount;
        }

        int defaultAmount = 1 ;
        cardList.put(key, defaultAmount);
        return defaultAmount;
    }

  /***
     * 刪除卡片
     * @param  key
     */
    public int removeCardList(String key){

        boolean exist = cardList.containsKey(key);
        if(!exist){
            return -1;
        }

        int cardAmount = cardList.get(key);
        if(cardAmount > 1){
            cardAmount = cardAmount - 1;
            cardList.remove(key);
            cardList.put(key, cardAmount);
            return cardAmount;
        }else{
            cardList.remove(key);
            return 0;
        }
    }

    public int getCardAmount(){
        int cardAmount = 0;

        for(HashMap.Entry card : cardList.entrySet()){
            int amount = (int)card.getValue();

            cardAmount = cardAmount + amount;
        }
        return cardAmount;
    }
}
