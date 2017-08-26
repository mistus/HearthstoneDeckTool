package mistus.hearthstonedecktool.CardView.DeckListDetail;

import android.app.DialogFragment;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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
    private static Context context;
    private static DialogFragment contextDialogFragment;


    public DeckListDetailRecycleViewAdapter(int[] cardIdList, int[] cardLevel, int[] cardAmount, String[] cardName, Context context, DialogFragment contextDialogFragment){
        this.cardIdList = cardIdList;
        this.cardLevel = cardLevel;
        this.cardName = cardName;
        this.cardAmount = cardAmount;
        this.context = context;
        this.contextDialogFragment = contextDialogFragment;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private CardView cardView;
        private TextView amountTextView;
        private ImageButton addButton;
        private ImageButton deleteButton;
        private DeckListDetailRecycleViewAdapter adapterContext;
//        cardAmount
        public ViewHolder(CardView view, DeckListDetailRecycleViewAdapter adapterContext) {
            super(view);
            cardView = view;
            this.adapterContext = adapterContext;
            addButton = (ImageButton) view.findViewById(R.id.addButton);
            addButton.setOnClickListener(this);
            deleteButton = (ImageButton) view.findViewById(R.id.deleteButton);
            deleteButton.setOnClickListener(this);
            amountTextView = (TextView) view.findViewById(R.id.cardAmount);

        }

        @Override
        public void onClick(View view) {
            if(view.equals(addButton)){
                addButtonEvent();
            }else if (view.equals(deleteButton)) {
                removeButtonEvent();
            }
        }

        private void addButtonEvent(){
            int newAmount  = ((DeckEditActivity)context).addCardList(Integer.toString((int)addButton.getTag()));
            ((deck_list_detail_fragment_dialog)contextDialogFragment).renewCardAmount();

//            String amountText = amountTextView.getText().toString();
            switch(newAmount){
                case 1:
                    amountTextView.setText("");
                    adapterContext.setCardAmount(getAdapterPosition(), newAmount);
//                    Log.e("---add case 1---",Integer.toString(newAmount));
//                    adapterContext.checkCardAmount();
                    break;
                case 2:
                    amountTextView.setText("x2");
                    adapterContext.setCardAmount(getAdapterPosition(), newAmount);
//                    Log.e("---add case 2---",Integer.toString(newAmount));
//                    adapterContext.checkCardAmount();
                    break;
                default:
                    break;
            }
        }
        private void removeButtonEvent(){
            int newAmount  = ((DeckEditActivity)context).removeCardList(Integer.toString((int)deleteButton.getTag()));
            ((deck_list_detail_fragment_dialog)contextDialogFragment).renewCardAmount();

//            String amountText = amountTextView.getText().toString();
            switch(newAmount){
                case 1:
                    amountTextView.setText("");
                    adapterContext.setCardAmount(getAdapterPosition(), 1);
//                    Log.e("---remove case 1---",Integer.toString(newAmount));
//                    adapterContext.checkCardAmount();
                    break;
                case 0:
                    adapterContext.removeAt(getAdapterPosition());
//                    Log.e("---remove case 0---",Integer.toString(newAmount));
//                    adapterContext.checkCardAmount();
                    break;
                default:
                    Log.e("---removeButtonEvent---",Integer.toString(newAmount));
                    break;
            }
        }
    }

    @Override
    public DeckListDetailRecycleViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).
                inflate(R.layout.cardview_deck_list_detail, parent, false);
        return new DeckListDetailRecycleViewAdapter.ViewHolder(cardView, this);
    }

    @Override
    public void onBindViewHolder(DeckListDetailRecycleViewAdapter.ViewHolder holder, int position){
//        checkCardAmount();
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
            amountTextView.setText("xxxx" + Integer.toString(cardAmount[position]));}

        //addButton
        addButton = (ImageButton)cardView.findViewById(R.id.addButton);
        addButton.setTag(cardIdList[position]);

        //deleteButton
        deleteButton = (ImageButton)cardView.findViewById(R.id.deleteButton);
        deleteButton.setTag(cardIdList[position]);
    }

    @Override
    public int getItemCount(){
        return cardName.length;
    }

    public void removeAt(int position) {
        int length = getItemCount () - 1 ;
        String newCardName[] = new String[length];
        int newCardIdList[] = new int[length];
        int newCardLevel[] = new int[length];
        int newCardAmount[] = new int[length];
        Log.e("removeAt","---123---");
        int jumpCounter = 0;
        for(int i=0; i<length; i++){
            if(i == position){
                jumpCounter++;
            }
            newCardName[i] = cardName[i +  jumpCounter];
            newCardIdList[i] = cardIdList[i + jumpCounter];
            newCardLevel[i] = cardLevel[i + jumpCounter];
            newCardAmount[i] = cardAmount[i + jumpCounter];
            Log.e("removeAt","---321---");
        Log.e("cardName",newCardName[i]);
        Log.e("cardIdList",Integer.toString(newCardIdList[i]));
        Log.e("cardLevel", Integer.toString(newCardLevel[i]));
        Log.e("cardAmount",Integer.toString(newCardAmount[i]));
        }

        cardName = newCardName;
        cardIdList = newCardIdList;
        cardLevel = newCardLevel;
        cardAmount = newCardAmount;
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, length);
    }
    public void setCardAmount(int position, int amount){
        cardAmount[position] = amount;
    }

    public void checkCardAmount(){
        int leg = getItemCount();
        for(int i = 0; i<leg ; i++){
            Log.e("cardName",cardName[i]);
            Log.e("cardAmount",Integer.toString(cardAmount[i]));
        }

    }
}
