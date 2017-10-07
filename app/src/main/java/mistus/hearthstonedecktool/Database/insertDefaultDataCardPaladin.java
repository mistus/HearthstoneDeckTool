package mistus.hearthstonedecktool.Database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import mistus.hearthstonedecktool.Common.Common;

public class insertDefaultDataCardPaladin {

    private SQLiteDatabase DB;

    public insertDefaultDataCardPaladin(SQLiteDatabase DB) {
        this.DB = DB;
    }

    public void insertDefaultData(){
        //TODO 種族
        //ID職業星數編號, Level, Job, Description, Type, series
        //Level0
        insert(40001, "禁咒治療",             Common.levelZero, Common.paladin, "花費所有法力。恢復等同花費兩倍的生命值",                      "史詩", "古神碎碎念");

        //Level1
        insert(41001, "力量祝福",             Common.levelOne, Common.paladin, "賦予一個手下 +3攻擊力",                                          "基本", "基本");
        insert(41002, "保護聖禦",             Common.levelOne, Common.paladin, "賦予一個手下聖盾術",                                             "基本", "基本");
        insert(41003, "謙恭",                 Common.levelOne, Common.paladin, "將一個手下的攻擊力改為1點",                                      "基本", "基本");
        insert(41004, "聖光正義之錘",         Common.levelOne, Common.paladin, "武器",                                                           "基本", "基本");
        insert(41005, "智慧祝福",             Common.levelOne, Common.paladin, "選擇一個手下。每當它進行攻擊，抽一張牌",                         "普通", "經典");
        insert(41006, "以眼還眼",             Common.levelOne, Common.paladin, "秘密：當你的英雄受到傷害，對敵方英雄造成等量傷害",               "普通", "經典");
        insert(41007, "光榮犧牲",             Common.levelOne, Common.paladin, "秘密：當一個敵人進攻時，召喚一個2/1防衛者成為目標",              "普通", "經典");
        insert(41008, "救贖",                 Common.levelOne, Common.paladin, "秘密：當一個友方手下死亡時，使其復活並擁有1點生命值",            "普通", "經典");
        insert(41009, "懺悔",                 Common.levelOne, Common.paladin, "秘密：在對手打出手下後，將其生命值降為1點",                      "普通", "經典");
        insert(41010, "邪鰭審判官",           Common.levelOne, Common.paladin, "魚人戰吼：你的英雄能力變成： 召喚一個1/1魚人",                   "史詩", "古神碎碎念");
        insert(41011, "無私的英雄",           Common.levelOne, Common.paladin, "死亡之聲：賦予一個隨機友方手下聖盾術",                           "精良", "古神碎碎念");
        insert(41012, "神聖力量",             Common.levelOne, Common.paladin, "賦予一個手下+1/+2",                                              "普通", "古神碎碎念");
        insert(41013, "走私闖關",             Common.levelOne, Common.paladin, "賦予你手中全部的手下+1/+1",                                      "普通", "加基森風雲");
        insert(41014, "厲鱗雜碎",             Common.levelOne, Common.paladin, "魚人戰吼：賦予你手中一個隨機魚人+1/+1",                          "普通", "加基森風雲");
        insert(41015, "黑街探長",             Common.levelOne, Common.paladin, "死亡之聲：若此手下有2點以上的攻擊力，抽一張牌",                  "史詩", "加基森風雲");
        insert(41016, "逃命關頭",             Common.levelOne, Common.paladin, "秘密：當一個友方手下死亡，該手下會返回你手中",                   "精良", "加基森風雲");
        insert(41017, "終極水晶龍",           Common.levelOne, Common.paladin, "任務：對你的手下施放6個法術 獎勵：加瓦東",                       "傳說", "安戈洛歷險記");
        insert(41018, "叢林迷蹤",             Common.levelOne, Common.paladin, "召喚兩個 1/1的白銀之手新兵",                                     "普通", "安戈洛歷險記");
        insert(41019, "演化論",               Common.levelOne, Common.paladin, "演化一個友方手下",                                               "普通", "安戈洛歷險記");
        insert(41020, "正義保衛者",           Common.levelOne, Common.paladin, "嘲諷 聖盾術",                                                    "普通", "冰封王座");

        //Level2
        insert(42001, "聖光術",               Common.levelTwo, Common.paladin, "恢復6點生命值",                                                  "基本", "基本");
        insert(42002, "銀色黎明保衛者",       Common.levelTwo, Common.paladin, "戰吼：賦予一個友方手下聖盾術",                                   "普通", "經典");
        insert(42003, "一視同仁",             Common.levelTwo, Common.paladin, "將全部手下的生命值改為1點",                                      "精良", "經典");
        insert(42004, "闇境明燈",             Common.levelTwo, Common.paladin, "發現一個手下賦予該手下+1/+1",                                    "普通", "古神碎碎念");
        insert(42005, "汙街裝備商",           Common.levelTwo, Common.paladin, "戰吼：賦予你手中全部的手下+1/+1",                                "普通", "加基森風雲");
        insert(42006, "水文學家",             Common.levelTwo, Common.paladin, "魚人,戰吼：發現一個秘密",                                        "普通", "安戈洛歷險記");
        insert(42007, "原魚勇士",             Common.levelTwo, Common.paladin, "魚人,死亡之聲：施放在這個手下身上的法術都會返回你的手中",        "史詩", "安戈洛歷險記");
        insert(42008, "黑暗感化",             Common.levelTwo, Common.paladin, "將一個手下的攻擊力與生命值 改為3",                               "普通", "冰封王座");
        insert(42009, "拚死一搏",             Common.levelTwo, Common.paladin, "賦予一個手下死亡之聲：復活至1點生命值",                          "精良", "冰封王座");

        //level3
        insert(43001, "奧多爾保安官",         Common.levelThree, Common.paladin, "戰吼：將一個敵方手下的攻擊力改為1點",                         "精良", "經典");
        insert(43002, "神恩術",               Common.levelThree, Common.paladin, "抽牌，直到你手牌的數量與對手相等",                            "精良", "經典");
        insert(43003, "正義之劍",             Common.levelThree, Common.paladin, "武器,在你召喚手下後，賦予該手下+1/+1，並使耐久度降低1點",     "史詩", "經典");
        insert(43004, "振奮之刃",             Common.levelThree, Common.paladin, "武器,戰吼：賦予你有 聖盾術的手下+1/+1",                       "精良", "古神碎碎念");
        insert(43005, "夜色鎮管理員",         Common.levelThree, Common.paladin, "每當你召喚一個1點生命值的手下，賦予該手下聖盾術",             "精良", "古神碎碎念");
        insert(43006, "夜禍騎士",             Common.levelThree, Common.paladin, "戰吼：若你手中有龍類，召喚2個1/1幼龍",                        "普通", "夜夜卡拉贊");
        insert(43007, "維克弗烈‧燃鬃",        Common.levelThree, Common.paladin, "聖盾術 嘲諷 生命竊取",                                        "傳說", "加基森風雲");
        insert(43008, "徵召小兵",             Common.levelThree, Common.paladin, "從你的牌堆中抽出三張 消耗為1的手下",                          "史詩", "加基森風雲");
        insert(43009, "咆哮的指揮官",         Common.levelThree, Common.paladin, "戰吼：從你的牌堆中抽出一個有聖盾術的手下",                    "精良", "冰封王座");

        //level4
        insert(44001, "王者祝福",             Common.levelFour, Common.paladin, "賦予一個手下+4/+4",                                            "基本", "基本");
        insert(44002, "奉獻",                 Common.levelFour, Common.paladin, "對全部敵人造成2點傷害",                                        "基本", "基本");
        insert(44003, "憤怒之錘",             Common.levelFour, Common.paladin, "造成3點傷害。抽一張牌",                                        "基本", "基本");
        insert(44004, "真銀勇士劍",           Common.levelFour, Common.paladin, "每當你的英雄進行攻擊，使其恢復2點生命值",                      "基本", "基本");
        insert(44005, "銀月城傳送門",         Common.levelFour, Common.paladin, "賦予一個手下+2/+2。召喚一個消耗為2的隨機手下",                 "普通", "夜夜卡拉贊");
        insert(44006, "熔光劍龍",             Common.levelFour, Common.paladin, "戰吼：演化你的 白銀之手新兵",                                  "精良", "安戈洛歷險記");
        insert(44007, "傲慢的十字軍",         Common.levelFour, Common.paladin, "死亡之聲：若在 對手回合死亡，召喚一個2/2食屍鬼",               "精良", "冰封王座");
        insert(44008, "聖光之憂",             Common.levelFour, Common.paladin, "每當友方手下 失去聖盾術，獲得 +1攻擊力",                       "史詩", "冰封王座");
        insert(44009, "凜刃勇士",             Common.levelFour, Common.paladin, "衝鋒 生命竊取",                                                "普通", "冰封王座");

        //level5
        insert(45001, "勇者祝福",             Common.levelFive, Common.paladin, "使一個手下的攻擊力加倍",                                       "精良", "經典");
        insert(45002, "神聖憤怒",             Common.levelFive, Common.paladin, "抽一張牌，並造成等同其法力消耗的傷害",                         "精良", "經典");
        insert(45003, "力抗黑暗",             Common.levelFive, Common.paladin, "召喚5個1/1白銀之手新兵",                                       "普通", "古神碎碎念");
        insert(45004, "汙街討債人",           Common.levelFive, Common.paladin, "在你的回合結束時，賦予你手中 全部的手下+1/+1",                 "精良", "加基森風雲");
        insert(45005, "『龍焰之血』伯瓦爾",   Common.levelFive, Common.paladin, "聖盾術 每當友方手下失去聖盾術，獲得+2攻擊力",                  "傳說", "冰封王座");

        //level6
        insert(46001, "復仇之怒",             Common.levelSix, Common.paladin, "造成8點傷害，隨機分給敵方角色",                                 "史詩", "經典");
        insert(46002, "象牙騎士",             Common.levelSix, Common.paladin, "戰吼：發現一個法術。為你的英雄恢復等同此法術消耗的生命值",      "精良", "加基森風雲");
        insert(46003, "守日者塔林姆",         Common.levelSix, Common.paladin, "嘲諷。戰吼：將全部其他手下的攻擊力與生命值改為3",               "傳說", "安戈洛歷險記");
        insert(46004, "劍龍騎術",             Common.levelSix, Common.paladin, "賦予一個手下 +2/+6及嘲諷，並在其死亡時召喚一隻劍龍",            "精良", "安戈洛歷險記");
        insert(46005, "黑衛士",               Common.levelSix, Common.paladin, "每當你的英雄受到治療，對一個隨機敵方手下造成等量傷害",          "史詩", "冰封王座");

        //level7
        insert(47001, "諸王守護者",           Common.levelSevenPlus, Common.paladin, "戰吼：使你的英雄恢復6點生命值",                          "基本", "基本");
        insert(47002, "汙街管理委員",         Common.levelSevenPlus, Common.paladin, "嘲諷 戰吼：賦予兩側的 手下聖盾術",                       "精良", "加基森風雲");
        insert(47003, "斬藤刀",               Common.levelSevenPlus, Common.paladin, "在你的英雄攻擊後，召喚兩個1/1的白銀之手新兵",            "精良", "安戈洛歷險記");

        //level8
        insert(48001, "聖療術",                  Common.levelSevenPlus, Common.paladin, "恢復8點生命值。抽3張牌",                                        "史詩", "經典");
        insert(48002, "提里奧·弗丁",             Common.levelSevenPlus, Common.paladin, "聖盾術。嘲諷。死亡之聲：裝備5/3的灰燼使者",                     "傳說", "經典");
        insert(48003, "『聖光之王』拉格納羅斯",  Common.levelSevenPlus, Common.paladin, "元素,在你的回合結束時，為一個受傷友方角色恢復8點生命值",        "傳說", "古神碎碎念");
        insert(48004, "有龍乃大",                Common.levelSevenPlus, Common.paladin, "將一個手下的攻擊力與生命值改為10",                              "史詩", "安戈洛歷險記");

        //level9
        insert(49001, "『黯刃騎士』烏瑟",        Common.levelSevenPlus, Common.paladin, "英雄,戰吼：裝備一把有生命竊取的5/3武器",         "傳說", "冰封王座");

    }

    public void insert(int id, String name, int level, int job, String description, String type, String series){

        ContentValues insertData = new ContentValues();
        insertData.put("id", id);
        insertData.put("name", name);
        insertData.put("level", level);
        insertData.put("job", job);
        insertData.put("description", description);
        insertData.put("type", type);
        insertData.put("series", series);

        DB.insert("card"  ,null, insertData);

    }

}
