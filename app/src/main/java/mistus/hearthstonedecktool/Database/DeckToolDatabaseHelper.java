package mistus.hearthstonedecktool.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DeckToolDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "DeckToolDatabase";
    private static final int DB_VERSION = 1 ;

    private String createTableCard = "create table card ("+
            "id INTEGER PRIMARY KEY,"+
            "name TEXT,"+
            "level INTEGER NOT NULL,"+
            "job INTEGER NOT NULL,"+
            "description TEXT,"+
            "type TEXT NOT NULL,"+
            "series TEXT);";

    //1   新卡組   30  標準  盜賊
    private String createTablePlayerDecks ="create table player_decks ("+
                    "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                    "deckName TEXT NOT NULL,"+
                    "deckType TEXT NOT NULL,"+
                    "job INTEGER NOT NULL,"+
                    "amount INTEGER NOT NULL);";

    //1  1  10001 2
    //2  1  10002 1
    private String createTablePlayerDeckCardLists = "create table player_deck_card_lists ("+
                    "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                    "deckId INTEGER NOT NULL,"+
                    "cardId INTEGER NOT NULL,"+
                    "amount INTEGER NOT NULL);";

    public DeckToolDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(createTableCard);
        sqLiteDatabase.execSQL(createTablePlayerDecks);
        sqLiteDatabase.execSQL(createTablePlayerDeckCardLists);
        insertDefaultDataCardWarrior insertWarrior = new insertDefaultDataCardWarrior(sqLiteDatabase);
        insertWarrior.insertDefaultData();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS card");
        onCreate(sqLiteDatabase);
    }

}
