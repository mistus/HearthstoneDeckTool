package mistus.hearthstonedecktool.CardView.Deck;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import mistus.hearthstonedecktool.R;

public class DeckRecyclerViewAdapter extends RecyclerView.Adapter<DeckRecyclerViewAdapter.ViewHolder>{

    private int deckId[];
    private String deckName[];
    private int job[];
    private boolean isStandardType[];
    private int Quantity[];

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        public ViewHolder(CardView view) {
            super(view);
            cardView = view;
        }
    }

    public DeckRecyclerViewAdapter(int[] deckId, String[] deckName, int[] job, boolean[] isStandardType, int[] Quantity){
        this.deckId = deckId;
        this.deckName = deckName;
        this.job = job;
        this.isStandardType = isStandardType;
        this.Quantity = Quantity;
    }

    @Override
    public DeckRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).
                inflate(R.layout.cardview_deck, parent, false);
        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        TextView deckNameView = (TextView)cardView.findViewById(R.id.deckName);
        deckNameView.setText(deckName[position]);

        TextView deckTypeView = (TextView)cardView.findViewById(R.id.deckType);
        deckTypeView.setText(getDeckTypeName(isStandardType[position]));

        TextView deckAmountView = (TextView)cardView.findViewById(R.id.deckAmount);
        deckAmountView.setText(Integer.toString(Quantity[position]));
    }

    @Override
    public int getItemCount() {
        return deckName.length;
    }

    private String getDeckTypeName(boolean isStandardType){
        if(isStandardType){
            return "Standard";
        }
        return "Open";
    }

}
