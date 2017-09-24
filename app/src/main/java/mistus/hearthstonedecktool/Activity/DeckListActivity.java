package mistus.hearthstonedecktool.Activity;

import android.app.DialogFragment;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import mistus.hearthstonedecktool.CardView.Deck.DeckRecyclerViewAdapter;
import mistus.hearthstonedecktool.Database.DeckToolDatabaseHelper;
import mistus.hearthstonedecktool.FragmentDialog.choose_career_fragment_dialog;
import mistus.hearthstonedecktool.R;

public class DeckListActivity extends AppCompatActivity {

    private RecyclerView DeckRecycler;
    private SQLiteDatabase DB;
    private int[] deckId;
    private String[] deckName;
    private int[] job;
    private boolean[] isStandardType;
    private int[] Quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deck_list);

        DeckRecycler = (RecyclerView)findViewById(R.id.deck_recycler);
        Button Button = (Button)findViewById(R.id.add_deck_button);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _add_deck_button_event();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        _init();
    }

    private void _init(){
        SQLiteOpenHelper DeckToolDatabaseHelper = new DeckToolDatabaseHelper(this);
        this.DB = DeckToolDatabaseHelper.getReadableDatabase();
        renewDeckArray();
        setAdapter();
    }

    private void _add_deck_button_event(){
        DialogFragment dialog = new choose_career_fragment_dialog();
        dialog.show(this.getFragmentManager(), "choose_career_fragment_dialog");
   }
    private boolean isStandardType(String deckType){
        switch (deckType){
            case "標準":
                return true;
            default:
                return false;
        }
    }

    private void setAdapter(){
        DeckRecyclerViewAdapter adapter = new DeckRecyclerViewAdapter(
                deckId, deckName, job, isStandardType, Quantity, this);
        DeckRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        DeckRecycler.setLayoutManager(layoutManager);
        DeckRecycler.setAdapter(adapter);
    }

    private void renewDeckArray(){
        String SQL = "select * from player_decks order by id desc";
        Cursor cursor = DB.rawQuery(SQL, null);
        int count = cursor.getCount();

        this.deckId = new int[count] ;
        this.deckName = new String [count];
        this.job = new int[count] ;
        this.isStandardType = new boolean [count];
        this.Quantity = new int[count] ;

        for(int i=0; i < count; i++){
            cursor.moveToNext();
            deckId[i] = cursor.getInt(0);
            deckName[i] = cursor.getString(1);
            isStandardType[i] = isStandardType(cursor.getString(2));
            job[i] = cursor.getInt(3);
            Quantity[i] = cursor.getInt(4);
        }
        cursor.close();
        DB.close();
    }
}
