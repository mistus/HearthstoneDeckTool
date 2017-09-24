package mistus.hearthstonedecktool.CardView.Deck;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;

import mistus.hearthstonedecktool.Activity.DeckEditActivity;
import mistus.hearthstonedecktool.Activity.DeckListActivity;
import mistus.hearthstonedecktool.Common.Common;
import mistus.hearthstonedecktool.Database.DeckToolDatabaseHelper;
import mistus.hearthstonedecktool.Database.savePlayerDeckList;
import mistus.hearthstonedecktool.R;

public class DeckRecyclerViewAdapter extends RecyclerView.Adapter<DeckRecyclerViewAdapter.ViewHolder>{

    private static Context context;

    private static int deckId[];
    private String deckName[];
    private int job[];
    private boolean isStandardType[];
    private int Quantity[];

    public DeckRecyclerViewAdapter(int[] deckId, String[] deckName, int[] job, boolean[] isStandardType, int[] Quantity, Context context){
        this.context = context;
        this.deckId = deckId;
        this.deckName = deckName;
        this.job = job;
        this.isStandardType = isStandardType;
        this.Quantity = Quantity;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private CardView cardView;
        private TextView deckNameView;
        private TextView deckTypeView;
        private TextView deckAmountView;
        private ImageView CareerImageView;
        private ImageButton deleteImageButton;

        public ViewHolder(CardView view) {
            super(view);
            cardView = view;
            cardView.setOnClickListener(this);
            deckNameView = (TextView)cardView.findViewById(R.id.deckName);
            deckTypeView = (TextView)cardView.findViewById(R.id.deckType);
            deckAmountView = (TextView)cardView.findViewById(R.id.deckAmount);
            CareerImageView = (ImageView)cardView.findViewById(R.id.careerImageView);

            deleteImageButton = (ImageButton)cardView.findViewById(R.id.deleteImageButton);
            deleteImageButton.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if(view.equals(deleteImageButton)){
                Dialog DeleteDialog = _createDeleteDialog();
                DeleteDialog.show();
            }else{
                _createEditPage();
            }
        }

        private Dialog _createDeleteDialog(){
            Builder builder = new android.app.AlertDialog.Builder(context);
            builder.setMessage("要刪除卡組嗎?");
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {
                    _deleteDeck();
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {

                }
            });
            return builder.create();
        }

        private void _deleteDeck(){
            savePlayerDeckList savePlayerDeckList = new savePlayerDeckList();
            DeckListActivity DeckListActivity = (DeckListActivity)context;
            savePlayerDeckList.setDB(DeckListActivity.getDB());
            savePlayerDeckList._deleteDeck(deckNameView.getText().toString());
            DeckListActivity.renewDeckArray();
        }

        private void _createEditPage(){
            Intent intent = new Intent();
            intent.setClass(context, DeckEditActivity.class);

            Bundle bundle = new Bundle();
            bundle.putString("careerName", Common.getCareerNameById((int)CareerImageView.getTag()));
            bundle.putString("deckName",deckNameView.getText().toString());
            bundle.putString("TypeName",_getTypeName(deckTypeView.getText().toString()));

            HashMap<String, Integer> cardList = new HashMap<String, Integer>();
            cardList = _getCardList(deckTypeView.getText().toString());
            bundle.putSerializable("cardList",cardList);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }

        private HashMap<String, Integer> _getCardList(String TypeName){
            HashMap<String, Integer> cardList = new HashMap<String, Integer>();

            SQLiteOpenHelper DeckToolDatabaseHelper = new DeckToolDatabaseHelper(context);
            SQLiteDatabase DB = DeckToolDatabaseHelper.getReadableDatabase();

            String SQL = "select * from player_deck_card_lists where deckId = '"+deckId[getAdapterPosition()]+"'";
            Cursor cursor = DB.rawQuery(SQL, null);
            int count = cursor.getCount();

            for(int i=0; i < count; i++){
                cursor.moveToNext();
                cardList.put(Integer.toString(cursor.getInt(2)),cursor.getInt(3));
            }

            return cardList;
        }

        private String _getTypeName(String TypeName){
            if(TypeName == "Standard"){
                return "標準";
            }
            return "開放";
        }
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

        ImageView careerImageView = (ImageView)cardView.findViewById(R.id.careerImageView);
        careerImageView.setTag(job[position]);
        String engilshName = Common.getCareerEnglishName(job[position]);
        int src = careerImageView.getResources().getIdentifier("mistus.hearthstonedecktool:drawable/"+engilshName , null, null);
        careerImageView.setImageResource(src);
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
