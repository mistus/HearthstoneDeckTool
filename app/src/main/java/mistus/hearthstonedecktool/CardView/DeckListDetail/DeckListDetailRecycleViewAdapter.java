package mistus.hearthstonedecktool.CardView.DeckListDetail;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import mistus.hearthstonedecktool.R;

public class DeckListDetailRecycleViewAdapter extends RecyclerView.Adapter<DeckListDetailRecycleViewAdapter.ViewHolder>
{
    private int cardLevel[];
    private String cardName[];

    public DeckListDetailRecycleViewAdapter(int[] cardLevel, String[] cardName){
        this.cardLevel = cardLevel;
        this.cardName = cardName;
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
        CardView cardView = holder.cardView;
        TextView name = (TextView)cardView.findViewById(R.id.cardName);
        name.setText(cardName[position]);

        TextView level = (TextView)cardView.findViewById(R.id.cardLevel);
        level.setText(Integer.toString(cardLevel[position]));
    }

    @Override
    public int getItemCount(){
        return cardName.length;
    }
}
