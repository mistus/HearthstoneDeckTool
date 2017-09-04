package mistus.hearthstonedecktool.FragmentDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.HashMap;

import mistus.hearthstonedecktool.Activity.DeckEditActivity;
import mistus.hearthstonedecktool.CardView.DeckListDetail.DeckListDetailRecycleViewAdapter;
import mistus.hearthstonedecktool.Database.DeckToolDatabaseHelper;
import mistus.hearthstonedecktool.R;

public class deck_list_detail_fragment_dialog extends DialogFragment{

    private HashMap<String, Integer> cardList;
    private RecyclerView DeckListDetailRecycler;
    private String[] nameList;
    private int[] levelList;
    private int[] amountList;
    private int[] cardIdList;
    private View view;

    private TextView cardAmountTextview;
    private TextView levelZeroGraph;
    private TextView levelZeroBlank;
    private TextView levelOneGraph;
    private TextView levelOneBlank;
    private TextView levelTwoGraph;
    private TextView levelTwoBlank;
    private TextView levelThreeGraph;
    private TextView levelThreeBlank;
    private TextView levelFourGraph;
    private TextView levelFourBlank;
    private TextView levelFiveGraph;
    private TextView levelFiveBlank;
    private TextView levelSixGraph;
    private TextView levelSixBlank;
    private TextView levelSevenPlusGraph;
    private TextView levelSevenPlusBlank;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cardList = (HashMap)getArguments().getSerializable("cardList");
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        _init();
        builder.setView(view);
        return builder.create();
    }

    private void _init(){
        LayoutInflater inflater = getActivity().getLayoutInflater();
        view  = inflater.inflate(R.layout.dialogview_deck_detail, null);
        DeckListDetailRecycler = (RecyclerView)view.findViewById(R.id.deck_list_recycler);

        cardAmountTextview = (TextView)view.findViewById(R.id.cardAmount);
        renewCardAmount();

        levelZeroGraph = (TextView)view.findViewById(R.id.levelZeroGraph);
        levelZeroBlank = (TextView)view.findViewById(R.id.levelZeroBlank);
        levelOneGraph = (TextView)view.findViewById(R.id.levelOneGraph);
        levelOneBlank = (TextView)view.findViewById(R.id.levelOneBlank);
        levelTwoGraph = (TextView)view.findViewById(R.id.levelTwoGraph);
        levelTwoBlank = (TextView)view.findViewById(R.id.levelTwoBlank);
        levelThreeGraph = (TextView)view.findViewById(R.id.levelThreeGraph);
        levelThreeBlank = (TextView)view.findViewById(R.id.levelThreeBlank);
        levelFourGraph = (TextView)view.findViewById(R.id.levelFourGraph);
        levelFourBlank = (TextView)view.findViewById(R.id.levelFourBlank);
        levelFiveGraph = (TextView)view.findViewById(R.id.levelFiveGraph);
        levelFiveBlank = (TextView)view.findViewById(R.id.levelFiveBlank);
        levelSixGraph = (TextView)view.findViewById(R.id.levelSixGraph);
        levelSixBlank = (TextView)view.findViewById(R.id.levelSixBlank);
        levelSevenPlusGraph = (TextView)view.findViewById(R.id.levelSevenPlusGraph);
        levelSevenPlusBlank = (TextView)view.findViewById(R.id.levelSevenPlusBlank);

        _createDeckListDetailCardview();
        _createGraph();
    }

    public void renewGraph(){
        _createDeckListDetailCardview();
        _createGraph();
    }

    private void _createGraph(){
        int[] levelCounter = _getLevelCounter(levelList);
        int largestLevelAmount= _getLargestLevelAmount(levelCounter);

        LinearLayout.LayoutParams params ;
        //Level0   width, height, Weight
        params = new TableRow.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, levelCounter[0]);
        levelZeroGraph.setLayoutParams(params);
        params = new TableRow.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, largestLevelAmount - levelCounter[0]);
        levelZeroBlank.setLayoutParams(params);
        //Level1
        params = new TableRow.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, levelCounter[1]);
        levelOneGraph.setLayoutParams(params);
        params = new TableRow.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, largestLevelAmount - levelCounter[1]);
        levelOneBlank.setLayoutParams(params);
        //Level2
        params = new TableRow.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, levelCounter[2]);
        levelTwoGraph.setLayoutParams(params);
        params = new TableRow.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, largestLevelAmount - levelCounter[2]);
        levelTwoBlank.setLayoutParams(params);
        //Level3
        params = new TableRow.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, levelCounter[3]);
        levelThreeGraph.setLayoutParams(params);
        params = new TableRow.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, largestLevelAmount - levelCounter[3]);
        levelThreeBlank.setLayoutParams(params);
        //Level4
        params = new TableRow.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, levelCounter[4]);
        levelFourGraph.setLayoutParams(params);
        params = new TableRow.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, largestLevelAmount - levelCounter[4]);
        levelFourBlank.setLayoutParams(params);
        //Level5
        params = new TableRow.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, levelCounter[5]);
        levelFiveGraph.setLayoutParams(params);
        params = new TableRow.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, largestLevelAmount - levelCounter[5]);
        levelFiveBlank.setLayoutParams(params);
        //Level6
        params = new TableRow.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, levelCounter[6]);
        levelSixGraph.setLayoutParams(params);
        params = new TableRow.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, largestLevelAmount - levelCounter[6]);
        levelSixBlank.setLayoutParams(params);
        //Level7+
        params = new TableRow.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, levelCounter[7]);
        levelSevenPlusGraph.setLayoutParams(params);
        params = new TableRow.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, largestLevelAmount - levelCounter[7]);
        levelSevenPlusBlank.setLayoutParams(params);

    }
    private int[] _getLevelCounter(int[] levelList){
        int[] levelCounter = new int[]{0,0,0,0,0,0,0,0};

        if(levelList == null){
            return levelCounter;
        }

        for (int i = 0;i < levelList.length;i++){
            if(levelList[i] >= 7){
                levelCounter[7] = levelCounter[7] + amountList[i];
                continue;
            }
            int level = levelList[i];
            levelCounter[level] = levelCounter[level] + amountList[i];
        }

        return levelCounter;
    }
    private int _getLargestLevelAmount(int[] levelList){
        int largestLevelAmount = 0;

        if(levelList ==null){
            return 0;
        }

        for(int counter : levelList){
            if(largestLevelAmount < counter){
                largestLevelAmount = counter;
            }
        }
        return largestLevelAmount;
    }

    private void _createDeckListDetailCardview (){

        if(cardList.isEmpty()){
            levelList = null;
            return;
        }

        String cardIds = "(";
        for(HashMap.Entry cardMap : cardList.entrySet()){
            cardIds = cardIds + cardMap.getKey();
            cardIds = cardIds +",";
        }

        cardIds = cardIds.substring(0,cardIds.length()-1);
        cardIds = cardIds + ")";

        SQLiteOpenHelper DeckToolDatabaseHelper = new DeckToolDatabaseHelper(getActivity());
        SQLiteDatabase DB = DeckToolDatabaseHelper.getReadableDatabase();
        String SQL = "select * from card where id in " + cardIds;
        Cursor cursor = DB.rawQuery(SQL  ,null);
        int count = cursor.getCount();
        nameList = new String [count];
        levelList = new int[count] ;
        amountList = new int[count] ;
        cardIdList = new int[count] ;

        for(int i=0; i < count; i++){
            cursor.moveToNext();
            cardIdList[i] = cursor.getInt(0);
            levelList[i] = cursor.getInt(2);
            nameList[i] = cursor.getString(1);
            amountList[i] = cardList.get(Integer.toString(cursor.getInt(0)));
        }
        cursor.close();
        DB.close();

        DeckListDetailRecycleViewAdapter adapter = new DeckListDetailRecycleViewAdapter(cardIdList, levelList, amountList, nameList, getActivity(),this);
        adapter.notifyItemRemoved(3);
        DeckListDetailRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        DeckListDetailRecycler.setLayoutManager(layoutManager);
        DeckListDetailRecycler.setAdapter(adapter);
    }

    public void renewCardAmount(){
        Context context = getActivity();
        int cardAmount = ((DeckEditActivity)context).getCardAmount();
        cardAmountTextview.setText("("+ cardAmount +"/30)");
    }

}
