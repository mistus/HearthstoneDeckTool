package mistus.hearthstonedecktool.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import mistus.hearthstonedecktool.CardView.Deck.DeckRecyclerViewAdapter;
import mistus.hearthstonedecktool.R;

public class DeckListActivity extends AppCompatActivity {

    private RecyclerView DeckRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deck_list);

        DeckRecycler = (RecyclerView)findViewById(R.id.deck_recycler);
        Button Button = (Button)findViewById(R.id.add_deck_button);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(DeckListActivity.this,DeckEditActivity.class);
                startActivity(intent);
            }
        });

        DeckRecyclerViewAdapter adapter = new DeckRecyclerViewAdapter(
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

    }
}
