package mistus.hearthstonedecktool.Database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import mistus.hearthstonedecktool.Common.Common;

public class insertDefaultDataCardRogue {

    private SQLiteDatabase DB;

    public insertDefaultDataCardRogue(SQLiteDatabase DB) {
        this.DB = DB;
    }

    public void insertDefaultData(){
        //TODO 種族
        //ID職業星數編號, Level, Job, Description, Type, series
        //Level0
        insert(30001, "背刺",             Common.levelZero, Common.rogue, "對一個 未受傷的手下造成2點傷害",                      "基本", "基本");
        insert(30002, "準備",             Common.levelZero, Common.rogue, "本回合施放的下一個法術消耗 減少(3)點",                "史詩", "經典");
        insert(30003, "暗影閃現",         Common.levelZero, Common.rogue, "使一個友方手下返回你手中。它的消耗減少(2)點",         "普通", "經典");
        insert(30004, "偽造的幸運幣",     Common.levelZero, Common.rogue, "在本回合獲得額外1顆法力水晶",                         "精良", "加基森風雲");

        //Level1
        insert(31001, "致命毒藥",         Common.levelOne, Common.rogue, "賦予你的武器+2攻擊力",                                    "基本", "基本");
        insert(31002, "邪惡攻擊",         Common.levelOne, Common.rogue, "對敵方英雄造成3點傷害",                                   "基本", "基本");
        insert(31003, "冷血",             Common.levelOne, Common.rogue, "賦予一個手下+2攻擊力。連擊：改為+4攻擊力",                "普通", "經典");
        insert(31004, "帶刀的教徒",       Common.levelOne, Common.rogue, "連擊：獲得+1/+1",                                         "普通", "古神碎碎念");
        insert(31005, "觀落陰",           Common.levelOne, Common.rogue, "發現一張 死亡之聲牌",                                     "精良", "古神碎碎念");
        insert(31006, "唬爛海賊",         Common.levelOne, Common.rogue, "海盜,戰吼：隨機將1張對手職業牌放到你的手中",              "普通", "夜夜卡拉贊");
        insert(31007, "洞穴歷險",         Common.levelOne, Common.rogue, "任務：打出 5個同名稱的手下 獎勵：水晶核心",               "傳說", "安戈洛歷險記");
        insert(31008, "幻覺",             Common.levelOne, Common.rogue, "發現一張對手的職業牌",                                    "普通", "安戈洛歷險記");
        insert(31009, "毀力鏢",           Common.levelOne, Common.rogue, "將你裝備的武器擲向一個手下，造成武器傷害後回到你的手中",  "史詩", "冰封王座");

        //Level2
        insert(32001, "悶棍",             Common.levelTwo, Common.rogue, "使一個敵方手下返回對手的手中",                         "基本", "基本");
        insert(32002, "毒襲",             Common.levelTwo, Common.rogue, "造成1點傷害。抽一張牌",                                "基本", "基本");
        insert(32003, "背叛",             Common.levelTwo, Common.rogue, "強迫一個敵方手下對兩側的手下造成等同其攻擊力的傷害",   "普通", "經典");
        insert(32004, "迪菲亞頭目",       Common.levelTwo, Common.rogue, "連擊：召喚一個2/1的迪菲亞強盜",                        "普通", "經典");
        insert(32005, "剔骨",             Common.levelTwo, Common.rogue, "造成2點傷害。連擊：改為造成4點傷害",                   "普通", "經典");
        insert(32006, "有耐心的刺客",     Common.levelTwo, Common.rogue, "潛行 致命劇毒",                                        "史詩", "經典");
        insert(32007, "幽暗城販子",       Common.levelTwo, Common.rogue, "死亡之聲：隨機將1張對手職業牌放到你的手中",            "精良", "古神碎碎念");
        insert(32008, "翠玉手裡劍",       Common.levelTwo, Common.rogue, "造成2點傷害。連擊：召喚一個 翠玉魔像",                 "普通", "加基森風雲");
        insert(32009, "玉蓮蟲兵",         Common.levelTwo, Common.rogue, "潛行 死亡之聲：召喚一個翠玉魔像",                      "普通", "加基森風雲");
        insert(32010, "加基森船夫",       Common.levelTwo, Common.rogue, "連擊：使一個友方手下返回你的手中",                     "精良", "加基森風雲");
        insert(32011, "刀花綻放",         Common.levelTwo, Common.rogue, "放兩張可造成1點傷害的剃刀花瓣到你的手中",              "普通", "安戈洛歷險記");
        insert(32012, "剃刀花鞭笞者",     Common.levelTwo, Common.rogue, "戰吼：放一張 可造成1點傷害的剃刀花瓣到你的手中",       "普通", "安戈洛歷險記");
        insert(32013, "咬人草",           Common.levelTwo, Common.rogue, "連擊：本回合 打出的每張其他卡牌使其獲得+1/+1",         "史詩", "安戈洛歷險記");
        insert(32014, "撿骨",             Common.levelTwo, Common.rogue, "抽一張牌。若抽到的牌有死亡之聲，再次施放此法術",       "精良", "冰封王座");
        insert(32015, "吸血毒藥",         Common.levelTwo, Common.rogue, "賦予你的武器生命竊取",                                 "普通", "冰封王座");

        //level3
        insert(33001, "飛舞刀刃",         Common.levelThree, Common.rogue, "對全部敵方手下造成1點傷害。抽一張牌",                         "基本", "基本");
        insert(33002, "艾德溫·范克里夫",  Common.levelThree, Common.rogue, "連擊：本回合 打出的每張其他卡牌使其獲得+2/+2",                "傳說", "經典");
        insert(33003, "碎顱",             Common.levelThree, Common.rogue, "對敵方英雄造成2點傷害 連擊：下回合這張牌將返回你手中",        "精良", "經典");
        insert(33004, "墮滅之刃",         Common.levelThree, Common.rogue, "武器,戰吼：造成1點傷害。連擊：改為造成2點傷害",               "精良", "經典");
        insert(33005, "軍情七處密探",     Common.levelThree, Common.rogue, "連擊：造成2點傷害",                                           "精良", "經典");
        insert(33006, "暗影打擊",         Common.levelThree, Common.rogue, "對一個未受傷的角色造成 5點傷害",                              "普通", "古神碎碎念");
        insert(33007, "致命的叉子",       Common.levelThree, Common.rogue, "死亡之聲：放一把3/2的武器到你的手中",                         "普通", "夜夜卡拉贊");
        insert(33008, "暗影狂怒者",       Common.levelThree, Common.rogue, "潛行",                                                        "普通", "加基森風雲");
        insert(33009, "『收藏者』夏庫",   Common.levelThree, Common.rogue, "潛行。每當它攻擊，隨機將一張對手職業牌放到你的手中",          "傳說", "加基森風雲");
        insert(33010, "擬態莢果",         Common.levelThree, Common.rogue, "抽一張牌。多放一張相同的牌到你的手中",                        "精良", "安戈洛歷險記");
        insert(33011, "毒化武器",         Common.levelThree, Common.rogue, "賦予你的武器致命劇毒",                                        "精良", "安戈洛歷險記");
        insert(33012, "瘟疫科學家",       Common.levelThree, Common.rogue, "連擊：賦予一個友方手下致命劇毒",                              "普通", "冰封王座");
        insert(33013, "暗影之刃",         Common.levelThree, Common.rogue, "武器,戰吼：本回合你的英雄免疫",                               "精良", "冰封王座");

        //level4
        insert(34001, "劍刃亂舞",               Common.levelFour, Common.rogue, "摧毀你的武器，對全部敵方手下造成等同其攻擊力的傷害",     "精良", "經典");
        insert(34002, "偽裝大師",               Common.levelFour, Common.rogue, "戰吼：賦予一個 友方手下潛行，直到你的下一回合",          "精良", "經典");
        insert(34003, "『毒化心智』薩瑞爾",     Common.levelFour, Common.rogue, "戰吼及死亡之聲：放一張隨機的毒藥牌到你的手中",           "傳說", "古神碎碎念");
        insert(34004, "南海魷魚人",             Common.levelFour, Common.rogue, "死亡之聲：賦予你的武器+2攻擊力",                         "普通", "古神碎碎念");
        insert(34005, "暗影師尊",               Common.levelFour, Common.rogue, "戰吼：賦予一個潛行的手下+2/+2",                          "精良", "加基森風雲");
        insert(34006, "黑曜石裂片",             Common.levelFour, Common.rogue, "你打出的每張 其他職業卡牌使 消耗減少(1)點",              "精良", "安戈洛歷險記");
        insert(34007, "『食屍魔花』榭拉辛",     Common.levelFour, Common.rogue, "死亡之聲：進入休眠 在本回合打出 四張牌來喚醒它",         "傳說", "安戈洛歷險記");
        insert(34008, "符文熔爐魂屍",           Common.levelFour, Common.rogue, "在你的回合時，你的武器不會損失耐久度",                   "精良", "冰封王座");
        insert(34009, "莉莉安‧佛斯",            Common.levelFour, Common.rogue, "戰吼：將你手中的 法術替換為對手職業的隨機法術",          "傳說", "冰封王座");

        //level5
        insert(35001, "暗殺",                   Common.levelFive, Common.rogue, "摧毀一個敵方手下",                                                   "基本", "基本");
        insert(35002, "刺客之刃",               Common.levelFive, Common.rogue, "武器",                                                               "基本", "基本");
        insert(35003, "暗影施法者",             Common.levelFive, Common.rogue, "戰吼：選擇一個友方手下，放一個1/1且法力消耗為(1)的分身到你的手中",   "史詩", "古神碎碎念");
        insert(35004, "以太道具商",             Common.levelFive, Common.rogue, "戰吼：使你手中 非盜賊的職業牌消耗降低(2)點",                         "精良", "夜夜卡拉贊");
        insert(35005, "玉蓮刺客",               Common.levelFive, Common.rogue, "潛行 每當它攻擊並殺死一個手下，獲得潛行",                            "史詩", "加基森風雲");
        insert(35006, "惡棘屠殺者",             Common.levelFive, Common.rogue, "連擊：摧毀一個手下",                                                 "史詩", "安戈洛歷險記");
        insert(35007, "白骨男爵",               Common.levelFive, Common.rogue, "死亡之聲：放兩張 1/1的骷髏到你的手中",                               "普通", "冰封王座");

        //level6
        insert(36001, "消失",                   Common.levelSix, Common.rogue, "使全部手下返回擁有者的手中",                               "基本", "基本");
        insert(36002, "綁匪",                   Common.levelSix, Common.rogue, "連擊：使一個手下返回擁有者手中",                           "史詩", "經典");
        insert(36003, "菊花茶",                 Common.levelSix, Common.rogue, "抽一張牌。多放2張相同的牌到你的手中",                      "精良", "古神碎碎念");
        insert(36004, "走運海賊",               Common.levelSix, Common.rogue, "海盜,戰吼：若你的武器 有3點以上的攻擊力，獲得+4/+4",       "史詩", "加基森風雲");
        insert(36005, "鬼靈掠取者",             Common.levelSix, Common.rogue, "連擊：造成等同 本回合打出卡牌數量的傷害",                  "史詩", "冰封王座");

        //level7
        insert(37001, "疾跑",                   Common.levelSevenPlus, Common.rogue, "連擊：造成等同 本回合打出卡牌數量的傷害",                  "基本", "基本");

        //level9
        insert(39001, "克蘇恩之刃",                   Common.levelSevenPlus, Common.rogue, "戰吼：摧毀一個手下，將其攻擊力和生命值加到你的克蘇恩身上，無論它位於何處",         "史詩", "古神碎碎念");
        insert(39002, "『空無者』瓦麗拉",             Common.levelSevenPlus, Common.rogue, "英雄,戰吼：獲得潛行，直到你的下一回合",                                            "傳說", "冰封王座");

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
