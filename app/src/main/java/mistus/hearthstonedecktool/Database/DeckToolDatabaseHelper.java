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

    public DeckToolDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(createTableCard);
        insertDefaultDataCardWarrior insertWarrior = new insertDefaultDataCardWarrior(sqLiteDatabase);
        insertWarrior.insertDefaultData();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS card");
        onCreate(sqLiteDatabase);
    }





}
