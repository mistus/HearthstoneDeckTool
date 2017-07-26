package mistus.hearthstonedecktool.CardView.Deck;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import mistus.hearthstonedecktool.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private int deckId[];
    private String deckName[];
    private int job[];
    private boolean isStandardType[];
    private int Quantity[];

    //always as Example
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        public ViewHolder(CardView view) {
            super(view);
            cardView = view;
        }
    }
    public RecyclerViewAdapter(int[] deckId, String[] deckName, int[] job, boolean[] isStandardType, int[] Quantity){
        this.deckId = deckId;
        this.deckName = deckName;
        this.job = job;
        this.isStandardType = isStandardType;
        this.Quantity = Quantity;
//        Log.e("System", "CheckStart");
//        for (int i: deckId) {
//            Log.e("i=", Integer.toString(i));
//        }
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).
                inflate(R.layout.cardview_deck, parent, false);
        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        TextView textView = (TextView)cardView.findViewById(R.id.deckName);
        textView.setText(deckName[position]);
        // TextView textView = (TextView)cardView.findViewById(R.id.act52);
        // textView.setText("666666666");
    }

    @Override
    public int getItemCount() {
        return deckName.length;
    }

}
