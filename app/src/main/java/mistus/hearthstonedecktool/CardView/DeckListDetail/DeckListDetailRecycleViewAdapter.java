package mistus.hearthstonedecktool.CardView.DeckListDetail;

import android.app.DialogFragment;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import mistus.hearthstonedecktool.Activity.DeckEditActivity;
import mistus.hearthstonedecktool.FragmentDialog.deck_list_detail_fragment_dialog;
import mistus.hearthstonedecktool.R;

public class DeckListDetailRecycleViewAdapter extends RecyclerView.Adapter<DeckListDetailRecycleViewAdapter.ViewHolder>
{

    private String cardName[];
    private int cardIdList[];
    private int cardLevel[];
    private int cardAmount[];
    private ImageButton addButton;
    private ImageButton deleteButton;
    private TextView amountTextView;
    private Context context;
    private DialogFragment contextDialogFragment;


    public DeckListDetailRecycleViewAdapter(int[] cardIdList, int[] cardLevel, int[] cardAmount, String[] cardName, Context context, DialogFragment contextDialogFragment){
        this.cardIdList = cardIdList;
        this.cardLevel = cardLevel;
        this.cardName = cardName;
        this.cardAmount = cardAmount;
        this.context = context;
        this.contextDialogFragment = contextDialogFragment;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView view) {
            super(view);
            cardView = view;
        }
    }

    @Override
    public DeckListDetailRecycleViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).
                inflate(R.layout.cardview_deck_list_detail, parent, false);
        return new DeckListDetailRecycleViewAdapter.ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(DeckListDetailRecycleViewAdapter.ViewHolder holder, int position){
        //Name
        CardView cardView = holder.cardView;
        TextView name = (TextView)cardView.findViewById(R.id.cardName);
        name.setText(cardName[position]);

        //level
        TextView level = (TextView)cardView.findViewById(R.id.cardLevel);
        level.setText(Integer.toString(cardLevel[position]));

        //amount
        amountTextView = (TextView)cardView.findViewById(R.id.cardAmount);
        if(cardAmount[position] == 2){
            amountTextView.setText("x" + Integer.toString(cardAmount[position]));}

        //addButton
        addButton = (ImageButton)cardView.findViewById(R.id.addButton);
        addButton.setTag(cardIdList[position]);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View cardAddButton) {
                ((DeckEditActivity)context).addCardList(Integer.toString((int)cardAddButton.getTag()));
                ((deck_list_detail_fragment_dialog)contextDialogFragment).renewCardAmount();

                String amountText = amountTextView.getText().toString();
                switch(amountText){
                    case "":
                        amountTextView.setText("x2");
                        break;
                    default:
                        break;
                }
            }
        });

        //deleteButton
        deleteButton = (ImageButton)cardView.findViewById(R.id.deleteButton);
        deleteButton.setTag(cardIdList[position]);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View cardRemoveButton) {
                ((DeckEditActivity)context).removeCardList(Integer.toString((int)cardRemoveButton.getTag()));
                ((deck_list_detail_fragment_dialog)contextDialogFragment).renewCardAmount();

                String amountText = amountTextView.getText().toString();
                switch(amountText){
                    case "x2":
                        amountTextView.setText("");
                        break;
                    case "":
                        break;
                    default:
                        break;
                }
            }
        });

    }

    @Override
    public int getItemCount(){
        return cardName.length;
    }

}
