package mistus.hearthstonedecktool.Activity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import mistus.hearthstonedecktool.CardView.Card.CardRecycleViewAdapter;
import mistus.hearthstonedecktool.Common.Common;
import mistus.hearthstonedecktool.Database.DeckToolDatabaseHelper;
import mistus.hearthstonedecktool.R;

public class DeckEditActivity extends AppCompatActivity {

    private RecyclerView cardRecyclerView;
    private String deckName;
    private ArrayList cardList;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deck_edit_layout);

        Intent intent = getIntent();
        String deckName = intent.getStringExtra("deckName");
        String careerName = intent.getStringExtra("careerName");
        String TypeName = intent.getStringExtra("TypeName");

        int careerNameId = _getCareerNameId(careerName);

        String SQL = "select * from card where Job = "+ careerNameId;
         Log.e("deckName List = ",deckName);
         Log.e("careerName = ",careerName);
         Log.e("TypeName = ",TypeName);

        Log.e("SQL = ",SQL);
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
//            Log.e("name", cursor.getString(1));
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
}
