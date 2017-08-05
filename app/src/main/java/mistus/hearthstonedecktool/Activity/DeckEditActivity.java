package mistus.hearthstonedecktool.Activity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

import mistus.hearthstonedecktool.CardView.Card.CardRecycleViewAdapter;
import mistus.hearthstonedecktool.Common.Common;
import mistus.hearthstonedecktool.Database.DeckToolDatabaseHelper;
import mistus.hearthstonedecktool.R;

public class DeckEditActivity extends AppCompatActivity {

    private RecyclerView cardRecyclerView;
    private String deckName;
    private String careerName;
    private int careerNameId;
    private String TypeName;
    private ArrayList cardList;

    private RadioGroup cardLevelRadioGroup;
    private EditText searchBar;
    private CheckBox isCareerCheckbox;
    private CheckBox isCommonCheckbox;
    private Button decideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deck_edit_layout);

        _init();
    }

    private void _init(){
        cardLevelRadioGroup = (RadioGroup)findViewById(R.id.cardLevel);
        searchBar = (EditText)findViewById(R.id.SearchBar);
        isCareerCheckbox = (CheckBox)findViewById(R.id.isCareer);
        isCommonCheckbox = (CheckBox)findViewById(R.id.isCommon);
        decideButton = (Button)findViewById(R.id.decide);

        Intent intent = getIntent();
        deckName = intent.getStringExtra("deckName");
        careerName = intent.getStringExtra("careerName");
        TypeName = intent.getStringExtra("TypeName");
        careerNameId = _getCareerNameId(careerName);

        decideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _decideClickevent();
            }
        });

        //TODO
        //開放/標準
        //"select * from card where Job = "+ careerNameId + and type = xxx <<private;
        String SQL = "select * from card where Job = "+ careerNameId +" or Job = " + Common.general;

        _createCards(SQL);
    }

    private String getSQL(){

        int checkedLevelId = cardLevelRadioGroup.getCheckedRadioButtonId();
        RadioButton levelRadioButton = (RadioButton)cardLevelRadioGroup.findViewById(checkedLevelId);

        //Levelに関するＳＱＬを取得する
        String selectConditionLevel = "";
        if(levelRadioButton != null){
            String level = levelRadioButton.getText().toString();
            switch(level){
                case "7":
                    selectConditionLevel = "level > = 7 and ";
                    break;
                default:
                    selectConditionLevel = "level = "+ level + " and ";
                    break;
            }
        }

        //Searchに関するSQLConditionを取得する
        //selectConditionSearchBar
        String Search = toString().valueOf(searchBar.getText());
        String selectConditionSearchBar = "";
        if(Search != null && Search != ""){
             selectConditionSearchBar =
                    "(name like '%"+Search+"%' " +
                    "or description like '%"+Search+"%' " +
                    "or type like '%"+Search+"%') and ";
        }

        //selectConditionDeckType
        String selectConditionCardType = "";
        selectConditionCardType = _getSelectConditionCardType();
        if(TypeName != Common.typeOpen){
            selectConditionCardType = selectConditionCardType+"(";
            Stri
            for(

            }
            int
            sele
            sele
        }

        //select
        String s

        String S
        SQL = SQ
        SQL = SQ
        SQL = SQ
        SQL = SQ
        return S
    }

    private Stri
        String s
        if(TypeN
            sele
            Stri
            for(

            }
            int
            sele
            sele
        }
        return s
    }

    private void
        String S
//        Log.e(
        _createC
    }

    private void
        cardRecy

        SQLiteOp
        SQLiteDa
        //TODO c
//        Cursor
        Cursor c
        int coun
        int[] id
        String[]

        for(int
            curs
            ids[
            name
//            Lo
        }

        cursor.c
        DB.close

        CardRecy
        cardRecy
        LinearLa
        cardRecy
        cardRecy
    }

    private int
        switch (
            case

            case

            case

            case

            case

            case

            case

            case

            case

            defa

        }

    }
}
