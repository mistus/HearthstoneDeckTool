package mistus.hearthstonedecktool.FragmentDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import mistus.hearthstonedecktool.Activity.DeckEditActivity;
import mistus.hearthstonedecktool.R;

public class choose_career_fragment_dialog extends DialogFragment{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view  = inflater.inflate(R.layout.dialogview_choose_career, null);

        builder.setView(view)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        LayoutInflater inflater = getActivity().getLayoutInflater();
                        View view  = inflater.inflate(R.layout.dialogview_choose_career, null);
                        TextView deckNameTextView = (TextView) view.findViewById(R.id.deckName);
                        String deckName = deckNameTextView.getText().toString();
                        Spinner careerNameSpinner = (Spinner)view.findViewById(R.id.careerName);
                        String careerName = toString().valueOf(careerNameSpinner.getSelectedItem());
                        RadioGroup deckTypeRadioGroup = (RadioGroup)view.findViewById(R.id.deckTypeRadioGroup);
                        int radioButtonID = deckTypeRadioGroup.getCheckedRadioButtonId();
                        RadioButton radioButton = (RadioButton)deckTypeRadioGroup.findViewById(radioButtonID);
                        String TypeName = radioButton.getText().toString();

//                        Log.e("deckName = ",deckName);
//                        Log.e("careerName = ",careerName);
//                        Log.e("TypeName = ",TypeName);

                        Intent intent = new Intent();
                        intent.setClass(getActivity(), DeckEditActivity.class);

                        Bundle bundle = new Bundle();
                        bundle.putString("careerName",careerName);
                        bundle.putString("deckName",deckName);
                        bundle.putString("TypeName",TypeName);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });
        return builder.create();
    }
}
