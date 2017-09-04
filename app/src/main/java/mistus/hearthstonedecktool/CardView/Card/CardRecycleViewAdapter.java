package mistus.hearthstonedecktool.CardView.Card;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import mistus.hearthstonedecktool.Activity.DeckEditActivity;
import mistus.hearthstonedecktool.R;


public class CardRecycleViewAdapter extends RecyclerView.Adapter<CardRecycleViewAdapter.ViewHolder>
{
    private ImageButton addButton;
    private ImageButton deleteButton;
    private int cardId[];
    private String deckName[];
    private Context context;

    public CardRecycleViewAdapter(int[] cardId, String[] deckName ,Context context){
        this.cardId = cardId;
        this.deckName = deckName;
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView view) {
            super(view);
            cardView = view;
        }
    }

    @Override
    public CardRecycleViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).
                inflate(R.layout.cardview_card, parent, false);
        return new CardRecycleViewAdapter.ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(CardRecycleViewAdapter.ViewHolder holder, int position){
        CardView cardView = holder.cardView;
        TextView name = (TextView)cardView.findViewById(R.id.name);
        name.setText(deckName[position]);


        ImageView cardImage =(ImageView)cardView.findViewById(R.id.cardImage);
        int src = cardImage.getResources().getIdentifier("mistus.hearthstonedecktool:drawable/card" + cardId[position] , null, null);
        cardImage.setImageResource(src);

        addButton = (ImageButton)cardView.findViewById(R.id.addButton);
        addButton.setTag(cardId[position]);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View cardAddButton) {
                ((DeckEditActivity)context).addCardList(Integer.toString((int)cardAddButton.getTag()));
            }
        });
        deleteButton = (ImageButton)cardView.findViewById(R.id.deleteButton);
        deleteButton.setTag(cardId[position]);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View cardRemoveButton) {
                ((DeckEditActivity)context).removeCardList(Integer.toString((int)cardRemoveButton.getTag()));
            }
        });
    }

    @Override
    public int getItemCount(){
        return deckName.length;
    }
}
