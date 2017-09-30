package mistus.hearthstonedecktool.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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

    /**
     * @param context
     */
    public savePlayerDeckList(Context context) {
        _init(context);
    }
    public savePlayerDeckList() {
    }

    /**
     * 現有デッキを削除し、も一度保存する
     */
    public void saveDeck(){
        String SQL = "select * from player_decks where deckName = '" +deckName+"'";
        Cursor cursor = DB.rawQuery(SQL, null);
        int count = cursor.getCount();
        cursor.close();

        if(count > 0){
            _deleteDeck(this.deckName);
        }
        _insertDeck(this.deckName, this.deckType, this.job, this.amount, this.cardList);
    }

    /**
     * @param DB
     */
    public void setDB(SQLiteDatabase DB) {
        this.DB = DB;
    }

    /**
     * 初期化する
     * @param context
     */
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

    /**
     * デッキ記録する(PlayerDeck、PlayerDeckCardList)
     * @param deckName
     * @param deckType
     * @param job
     * @param amount
     * @param cardList
     */
    private void _insertDeck(String deckName, String deckType, int job, int amount
            , HashMap<String, Integer> cardList){

        int deckId = _insertPlayerDeck(deckName, deckType, job, amount);
        _insertPlayerDeckCardList(deckId, cardList);
    }

    /**
     * デッキ削除(PlayerDeck、PlayerDeckCardList)
     * @param deckName
     */
    public void _deleteDeck(String deckName){
        _deletePlayerDeckCardList(getDeckIdByDeckName(deckName));
        _deleteDeckCards(deckName);
    }

    /**
     * デッキを記録する
     * @param deckName
     * @param deckType
     * @param job
     * @param amount
     * @return deckId
     */
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

    /**
     * デッキのカードリストを記録する
     * @param deckId
     * @param cardList
     */
    private void _insertPlayerDeckCardList(int deckId, HashMap<String, Integer> cardList){
        for(HashMap.Entry card : cardList.entrySet()){
            ContentValues insertData = new ContentValues();
            insertData.put("deckId", deckId);
            insertData.put("cardId", Integer.parseInt((String)card.getKey()));
            insertData.put("amount", (int)card.getValue());
            DB.insert("player_deck_card_lists"  ,null, insertData);
        }
    }

    /**
     * デッキを削除する
     * @param deckName
     * @return isSuccess
     */
    private boolean _deleteDeckCards(String deckName){
        String table = "player_decks";
        String whereClause = "deckName=?";
        String[] whereArgs = new String[] {deckName};
        return DB.delete(table, whereClause, whereArgs) > 0;
    }

    /**
     * デッキのカードリストを削除する
     * @param deckId
     * @return isSuccess
     */
    private boolean _deletePlayerDeckCardList(int deckId){
        String table = "player_deck_card_lists";
        String whereClause = "deckId=?";
        String[] whereArgs = new String[] {Integer.toString(deckId)};
        return DB.delete(table, whereClause, whereArgs) > 0;
    }

    /**
     * @param deckName
     * @return deckId
     */
    private int getDeckIdByDeckName(String deckName){
        String SQL = "select * from player_decks where deckName = '" + deckName+"'";
        Cursor cursor = DB.rawQuery(SQL, null);
        cursor.moveToNext();
        int deckId = cursor.getInt(0);
        cursor.close();

        return deckId;
    }
}
