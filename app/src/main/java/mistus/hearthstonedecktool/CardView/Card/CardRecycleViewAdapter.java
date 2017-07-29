package mistus.hearthstonedecktool.CardView.Card;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import mistus.hearthstonedecktool.R;


public class CardRecycleViewAdapter extends RecyclerView.Adapter<CardRecycleViewAdapter.ViewHolder>
{
    private int cardId[];
    private String deckName[];

    public CardRecycleViewAdapter(int[] cardId, String[] deckName){
        this.cardId = cardId;
        this.deckName = deckName;
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
        int id = cardImage.getResources().getIdentifier("mistus.hearthstonedecktool:drawable/card" + cardId[position] , null, null);
        cardImage.setImageResource(id);
    }

    @Override
    public int getItemCount(){
        return deckName.length;
    }
}
