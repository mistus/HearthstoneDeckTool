package mistus.hearthstonedecktool.Activity;

import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import mistus.hearthstonedecktool.CardView.Deck.DeckRecyclerViewAdapter;
import mistus.hearthstonedecktool.FragmentDialog.choose_career_fragment_dialog;
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
                _add_deck_button_event();
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

    private void _add_deck_button_event(){
        DialogFragment dialog = new choose_career_fragment_dialog();
        dialog.show(this.getFragmentManager(), "choose_career_fragment_dialog");
   }
}
