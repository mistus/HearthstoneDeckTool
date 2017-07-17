package mistus.hearthstonedecktool.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import mistus.hearthstonedecktool.CardView.RecyclerViewAdapter;
import mistus.hearthstonedecktool.R;

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

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(
                new int[] {1,2},
                new String[] {"S1","S2"},
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
