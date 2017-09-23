package mistus.hearthstonedecktool.FragmentDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashMap;

import mistus.hearthstonedecktool.Activity.DeckEditActivity;
import mistus.hearthstonedecktool.Database.savePlayerDeckList;
import mistus.hearthstonedecktool.R;

public class saveCardListFragmentDialog extends DialogFragment{

    private TextView deckNameTextView;

    private String deckName;
    private HashMap<String, Integer> cardList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        deckName = (String)getArguments().getSerializable("deckName");
        cardList = (HashMap)getArguments().getSerializable("cardList");
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view  = inflater.inflate(R.layout.dialogview_save_card_list, null);

        deckNameTextView = (TextView) view.findViewById(R.id.deckName);
        deckNameTextView.setText(deckName);

        builder.setView(view)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        //TODO Insert
                        DeckEditActivity DeckEditActivity = (DeckEditActivity)getActivity();
                        DeckEditActivity.setDeckName(deckNameTextView.getText().toString());
                        savePlayerDeckList savePlayerDeckList  = new savePlayerDeckList(DeckEditActivity);
                        savePlayerDeckList.saveDeck();
                        getActivity().finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });
        return builder.create();
    }
}
