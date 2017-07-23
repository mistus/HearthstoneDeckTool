package mistus.hearthstonedecktool.Activity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import mistus.hearthstonedecktool.CardView.RecyclerViewAdapter;
import mistus.hearthstonedecktool.R;
import mistus.hearthstonedecktool.Ｄatabase.DeckToolDatabaseHelper;

public class DeckListActivity extends AppCompatActivity {

    //RecyclerView
    private RecyclerView DeckRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //auto
        Log.e("System", "CreateStart");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deck_list);

        DeckRecycler = (RecyclerView)findViewById(R.id.deck_recycler);
        //START
        SQLiteOpenHelper DeckToolDatabaseHelper = new DeckToolDatabaseHelper(this);
        SQLiteDatabase DB = DeckToolDatabaseHelper.getReadableDatabase();
        Cursor cursor = DB.rawQuery("select * from card",null);
        cursor.moveToFirst();
        String name1 = cursor.getString(1);
        cursor.moveToNext();
        String name2 = cursor.getString(1);
        cursor.close();
        DB.close();
        //END
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(
                new int[] {1,2},
//                new String[] {"S1","S2"},
                new String[] {name1,name2},
                new int[] {10,20},
                new boolean[] {true,false},
                new int[] {30,27}
                );
        DeckRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        DeckRecycler.setLayoutManager(layoutManager);
        DeckRecycler.setAdapter(adapter);

        Log.e("System", "CreateEnd");
    }
}
