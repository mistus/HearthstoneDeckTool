package mistus.hearthstonedecktool.Activity;

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

        _createCards();

    }

    private void _createCards(){
        cardRecyclerView = (RecyclerView)findViewById(R.id.card_recycler);

        SQLiteOpenHelper DeckToolDatabaseHelper = new DeckToolDatabaseHelper(this);
        SQLiteDatabase DB = DeckToolDatabaseHelper.getReadableDatabase();
        //TODO change SQL
        Cursor cursor = DB.rawQuery("select * from card",null);
        int count = cursor.getCount();
        int[] ids = new int[count] ;
        String[] names = new String [count];

        for(int i=0; i < count; i++){
            cursor.moveToNext();
            ids[i] = cursor.getInt(0);
            names[i] = cursor.getString(1);
            Log.e("name", cursor.getString(1));
        }

        cursor.close();
        DB.close();

        CardRecycleViewAdapter adapter = new CardRecycleViewAdapter(ids, names);
        cardRecyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        cardRecyclerView.setLayoutManager(layoutManager);
        cardRecyclerView.setAdapter(adapter);
    }
}
