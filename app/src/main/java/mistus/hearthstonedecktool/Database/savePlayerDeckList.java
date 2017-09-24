package mistus.hearthstonedecktool.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.HashMap;

import mistus.hearthstonedecktool.Activity.DeckEditActivity;

public class savePlayerDeckList {
    private SQLiteDatabase DB;
    private DeckEditActivity DeckEditActivity;

    private String deckName;
    private String deckType;
    private int job;
    private int amount;
    private HashMap<String, Integer> cardList;

    public savePlayerDeckList(Context context) {
        _init(context);
    }

    public void saveDeck(){
        String SQL = "select * from player_decks where deckName = '" +deckName+"'";
        Cursor cursor = DB.rawQuery(SQL, null);
        int count = cursor.getCount();
        cursor.close();

        if(count > 0){
            _deletePlayerDeckCardList(getDeckIdByDeckName(this.deckName));
            _deleteDeckCards(this.deckName);
        }
        _insertDeckCards(this.deckName, this.deckType, this.job, this.amount, this.cardList);
    }

    private void _init(Context context){
        this.DeckEditActivity = (DeckEditActivity)context;
        SQLiteOpenHelper DeckToolDatabaseHelper = new DeckToolDatabaseHelper(this.DeckEditActivity);
        DB = DeckToolDatabaseHelper.getReadableDatabase();

        this.deckName = DeckEditActivity.getDeckName();
        this.deckType = DeckEditActivity.getTypeName();
        this.job = DeckEditActivity.getCareerNameId();
        this.amount = DeckEditActivity.getCardAmount();
        this.cardList = DeckEditActivity.getCardList();

    }
    private void _insertDeckCards(String deckName, String deckType, int job, int amount
            ,HashMap<String, Integer> cardList){

        int deckId = _insertPlayerDeck(deckName, deckType, job, amount);
        _insertPlayerDeckCardList(deckId, cardList);
    }

    private int  _insertPlayerDeck(String deckName, String deckType, int job, int amount){
        ContentValues insertData = new ContentValues();
        insertData.put("deckName", deckName);
        insertData.put("deckType", deckType);
        insertData.put("job", job);
        insertData.put("amount", amount);
        DB.insert("player_decks"  ,null, insertData);

        int deckId = getDeckIdByDeckName(deckName);

        return deckId;
    }

    private void _insertPlayerDeckCardList(int deckId, HashMap<String, Integer> cardList){
        for(HashMap.Entry card : cardList.entrySet()){
            ContentValues insertData = new ContentValues();
            insertData.put("deckId", deckId);
            insertData.put("cardId", Integer.parseInt((String)card.getKey()));
            insertData.put("amount", (int)card.getValue());
            DB.insert("player_deck_card_lists"  ,null, insertData);
        }
    }
    private boolean _deleteDeckCards(String deckName){
        String table = "player_decks";
        String whereClause = "deckName=?";
        String[] whereArgs = new String[] {deckName};
        return DB.delete(table, whereClause, whereArgs) > 0;
    }

    private boolean _deletePlayerDeckCardList(int deckId){
        String table = "player_deck_card_lists";
        String whereClause = "deckId=?";
        String[] whereArgs = new String[] {Integer.toString(deckId)};
        return DB.delete(table, whereClause, whereArgs) > 0;
    }

    private int getDeckIdByDeckName(String deckName){
        String SQL = "select * from player_decks where deckName = '" + deckName+"'";
        Cursor cursor = DB.rawQuery(SQL, null);
        cursor.moveToNext();
        int deckId = cursor.getInt(0);
        cursor.close();

        return deckId;
    }
}
