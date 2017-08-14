package mistus.hearthstonedecktool.Activity;

import android.app.DialogFragment;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
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
import mistus.hearthstonedecktool.R;


public class DeckEditActivity extends AppCompatActivity {

    private RecyclerView cardRecyclerView;
    private String deckName;
    private String careerName;
    private int careerNameId;
    private String TypeName;
    private HashMap<String, Integer> cardList;

    private RadioGroup cardLevelRadioGroup;
    private EditText searchBar;
    private CheckBox isCareerCheckbox;
    private CheckBox isCommonCheckbox;
    private Button decideButton;

    private RecyclerView DeckListDetailRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deck_edit_layout);
        _init();

        //TestUI
//        cardList = new int[]{11011,11010,11009};
        cardList = new HashMap<>();
        cardList.put("11011",2);
        cardList.put("11010",1);
        cardList.put("12010",1);
        cardList.put("12009",2);
        cardList.put("11002",1);
        cardList.put("10001",2);
        cardList.put("11006",1);
        cardList.put("11004",1);

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
                Log.e("deckDetailIcon","-----------------");
                _open_deck_detail_button_event();
                return true;
            case R.id.deckSaveIcon:
                Log.e("deckSaveIcon","-----------------");
                return true;
            default:
                Log.e("default","-----------------");
                return super.onOptionsItemSelected(item);
        }
    }

    private void _init(){
        cardLevelRadioGroup = (RadioGroup)findViewById(R.id.cardLevel);
        searchBar = (EditText)findViewById(R.id.SearchBar);
        isCareerCheckbox = (CheckBox)findViewById(R.id.isCareer);
        isCommonCheckbox = (CheckBox)findViewById(R.id.isCommon);
        decideButton = (Button)findViewById(R.id.decide);

        Intent intent = getIntent();
        deckName = intent.getStringExtra("deckName");
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
        Log.e("-------SQL------", SQL);
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

        CardRecycleViewAdapter adapter = new CardRecycleViewAdapter(ids, names);
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
//        bundle.putIntArray("cardList",cardList);
        dialog.setArguments(bundle);
        dialog.show(this.getFragmentManager(), "deck_list_detail_fragment_dialog");
    }

}
