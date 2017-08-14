package mistus.hearthstonedecktool.FragmentDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import mistus.hearthstonedecktool.CardView.DeckListDetail.DeckListDetailRecycleViewAdapter;
import mistus.hearthstonedecktool.Database.DeckToolDatabaseHelper;
import mistus.hearthstonedecktool.R;

public class deck_list_detail_fragment_dialog extends DialogFragment{

    private int[] cardList;
    private RecyclerView DeckListDetailRecycler;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cardList = getArguments().getIntArray("cardList");
    }
//            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
//            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view  = inflater.inflate(R.layout.dialogview_deck_detail, null);
        DeckListDetailRecycler = (RecyclerView)view.findViewById(R.id.deck_list_recycler);
        _createDeckListDetailDialog();

        builder.setView(view);
        return builder.create();
    }

    private void _createDeckListDetailDialog (){
        String cardIds = "(";
        for(int i : cardList){
            cardIds = cardIds + Integer.toString(i);
            cardIds = cardIds +",";
        }
        cardIds = cardIds.substring(0,cardIds.length()-1);
        cardIds = cardIds + ")";

        SQLiteOpenHelper DeckToolDatabaseHelper = new DeckToolDatabaseHelper(getActivity());
        SQLiteDatabase DB = DeckToolDatabaseHelper.getReadableDatabase();
        String SQL = "select * from card where id in " + cardIds;

        Cursor cursor = DB.rawQuery(SQL  ,null);
        int count = cursor.getCount();
        int[] levelList = new int[count] ;
        String[] nameList = new String [count];

        for(int i=0; i < count; i++){
            cursor.moveToNext();
            levelList[i] = cursor.getInt(2);
            nameList[i] = cursor.getString(1);
            Log.e("name", cursor.getString(1));
            Log.e("levelList", Integer.toString(cursor.getInt(2)));
        }
        cursor.close();
        DB.close();

        DeckListDetailRecycleViewAdapter adapter = new DeckListDetailRecycleViewAdapter(levelList, nameList);

        DeckListDetailRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        DeckListDetailRecycler.setLayoutManager(layoutManager);
        DeckListDetailRecycler.setAdapter(adapter);
    }
}
