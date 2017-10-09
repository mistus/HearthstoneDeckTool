package mistus.hearthstonedecktool.Database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import mistus.hearthstonedecktool.Common.Common;

public class insertDefaultDataCardHunter {

    private SQLiteDatabase DB;

    public insertDefaultDataCardHunter(SQLiteDatabase DB) {
        this.DB = DB;
    }

    public void insertDefaultData(){
        //TODO 種族
        //ID職業星數編號, Level, Job, Description, Type, series
        //Level0　null

        //Level1
        insert(51001, "秘法射擊",             Common.levelOne, Common.hunter, "造成2點傷害",                                          "基本", "基本");
        insert(51002, "獵人印記",             Common.levelOne, Common.hunter, "將一個手下的生命值改為1點",                            "基本", "基本");
        insert(51003, "森林狼",               Common.levelOne, Common.hunter, "野獸,你的其他野獸獲得+1攻擊力",                        "基本", "基本");
        insert(51004, "追蹤",                 Common.levelOne, Common.hunter, "瀏覽你牌堆中最上面3張牌。選一張後捨棄其他兩張",        "基本", "基本");
        insert(51005, "狂野怒火",             Common.levelOne, Common.hunter, "本回合賦予一隻友方野獸+2攻擊力及免疫",                 "史詩", "經典");
        insert(51006, "狩獵開始",             Common.levelOne, Common.hunter, "造成1點傷害召喚一個1/1獒犬",                           "普通", "古神碎碎念");
        insert(51007, "熾炎蝙蝠",             Common.levelOne, Common.hunter, "野獸,死亡之聲：對一個隨機敵人造成1點傷害",             "普通", "古神碎碎念");
        insert(51008, "巷弄小貓",             Common.levelOne, Common.hunter, "野獸,戰吼：召喚一個1/1的虎斑貓",                       "普通", "加基森風雲");
        insert(51009, "走私貨物",             Common.levelOne, Common.hunter, "賦予你手中一個隨機野獸+2/+2",                          "普通", "加基森風雲");
        insert(51010, "寶光鸚鵡",             Common.levelOne, Common.hunter, "野獸,戰吼：放一張隨機野獸牌到你的手中",                "普通", "安戈洛歷險記");
        insert(51011, "小迅猛龍",             Common.levelOne, Common.hunter, "野獸,死亡之聲：將一個4/3迅猛龍洗入你的 牌堆中",        "精良", "安戈洛歷險記");
        insert(51012, "奔竄",                 Common.levelOne, Common.hunter, "本回合每次打出野獸，放一張隨機野獸牌到你的手中",       "史詩", "安戈洛歷險記");
        insert(51013, "泥沼之后",             Common.levelOne, Common.hunter, "任務：打出 7個消耗為1的手下 獎勵：卡納莎女王",         "傳說", "安戈洛歷險記");
        insert(51014, "裝死",                 Common.levelOne, Common.hunter, "觸發一個友方手下的死亡之聲",                           "普通", "冰封王座");

        //Level2
        insert(52001, "爆炸陷阱",             Common.levelTwo, Common.hunter, "秘密：當你的英雄被攻擊時，對全部敵人造成2點傷害",                       "普通", "經典");
        insert(52002, "照明彈",               Common.levelTwo, Common.hunter, "全部手下失去潛行。摧毀全部敵方的秘密。抽一張牌",                        "精良", "經典");
        insert(52003, "冰凍陷阱",             Common.levelTwo, Common.hunter, "秘密：使一個進攻的敵方手下返回手中，且消耗增加(2)點",                   "普通", "經典");
        insert(52004, "誤導",                 Common.levelTwo, Common.hunter, "秘密：敵人攻擊你的英雄時，會改為攻擊另一個隨機角色",                    "精良", "經典");
        insert(52005, "食腐土狼",             Common.levelTwo, Common.hunter, "野獸,每當一隻友方野獸死亡，獲得+2/+1",                                  "普通", "經典");
        insert(52006, "放蛇陷阱",             Common.levelTwo, Common.hunter, "秘密：當你的手下受到攻擊時，召喚三條1/1的蛇",                           "史詩", "經典");
        insert(52007, "狙擊",                 Common.levelTwo, Common.hunter, "秘密：在對手打出手下後，對它造成4點傷害",                               "普通", "經典");
        insert(52008, "豹子戲法",             Common.levelTwo, Common.hunter, "秘密：在對手施放法術後，召喚 一個有潛行的4/2獵豹",                      "精良", "夜夜卡拉贊");
        insert(52009, "慈祥的外婆",           Common.levelTwo, Common.hunter, "野獸,死亡之聲：召喚一個3/2的大野狼",                                    "普通", "夜夜卡拉贊");
        insert(52010, "軍火庫藏",             Common.levelTwo, Common.hunter, "秘密：在對手打出手下後，賦予你手中一個隨機手下+2/+2",                   "精良", "加基森風雲");
        insert(52011, "穴居怪馴獸師",         Common.levelTwo, Common.hunter, "戰吼：賦予你手中 一個隨機野獸+1/+1",                                    "精良", "加基森風雲");
        insert(52012, "重創撕咬",             Common.levelTwo, Common.hunter, "對一個手下造成2點傷害，並對其兩側的手下造成1點傷害",                    "普通", "安戈洛歷險記");
        insert(52013, "轟雷刺喉龍",           Common.levelTwo, Common.hunter, "野獸,戰吼：演化一個友方野獸",                                           "普通", "安戈洛歷險記");
        insert(52014, "恐龍學",               Common.levelTwo, Common.hunter, "你的英雄能力改為：賦予一個 野獸+2/+2",                                  "史詩", "安戈洛歷險記");
        insert(52015, "劇毒箭",               Common.levelTwo, Common.hunter, "對一個手下造成2點傷害。若其存活，賦予它致命劇毒",                       "史詩", "冰封王座");
        insert(52016, "眼鏡蛇陷阱",           Common.levelTwo, Common.hunter, "秘密：當你的手下受到攻擊時，召喚一條有致命劇毒的 2/3眼鏡蛇",            "精良", "冰封王座");

        //level3
        insert(53001, "動物夥伴",             Common.levelThree, Common.hunter, "召喚一隻隨機的野獸夥伴",                                         "基本", "基本");
        insert(53002, "擊殺命令",             Common.levelThree, Common.hunter, "造成3點傷害。若你有野獸，則造成5點傷害",                         "基本", "基本");
        insert(53003, "致命射擊",             Common.levelThree, Common.hunter, "摧毀一個隨機敵方手下",                                           "普通", "經典");
        insert(53004, "鷹角弓",               Common.levelThree, Common.hunter, "每當友方的秘密揭露，獲得+1耐久度",                               "精良", "經典");
        insert(53005, "放狗",                 Common.levelThree, Common.hunter, "召喚等同敵方手下數量並有衝鋒的1/1獵犬",                          "普通", "經典");
        insert(53006, "感染",                 Common.levelThree, Common.hunter, "賦予你的手下 死亡之聲：放一張隨機野獸牌到你的手中",              "精良", "古神碎碎念");
        insert(53007, "獨行潛獵手",           Common.levelThree, Common.hunter, "戰吼：賦予你手中有死亡之聲的手下+1/+1",                          "精良", "古神碎碎念");
        insert(53008, "腐肉蟲",               Common.levelThree, Common.hunter, "野獸",                                                           "普通", "古神碎碎念");
        insert(53009, "披風女獵手",           Common.levelThree, Common.hunter, "你的秘密消耗為(0)",                                              "普通", "加基森風雲");
        insert(53010, "鼠黨老大",             Common.levelThree, Common.hunter, "野獸死亡之聲：召喚數量等同此手下攻擊力的1/1老鼠",                "史詩", "加基森風雲");
        insert(53011, "發抖的槍手",           Common.levelThree, Common.hunter, "死亡之聲：賦予你手中一個隨機手下+2/+2",                          "普通", "加基森風雲");
        insert(53012, "懼鱗潛獵者",           Common.levelThree, Common.hunter, "戰吼：觸發一個友方手下的死亡之聲",                               "精良", "安戈洛歷險記");
        insert(53013, "縫合追蹤者",           Common.levelThree, Common.hunter, "戰吼：發現一個你 牌堆中的手下",                                  "普通", "冰封王座");
        insert(53014, "鯊魚熊",               Common.levelThree, Common.hunter, "無法被法術或英雄能力指定",                                       "普通", "冰封王座");

        //level4
        insert(54001, "馴犬者",               Common.levelFour, Common.hunter, "戰吼：賦予友方野獸+2/+2及嘲諷",                                   "基本", "基本");
        insert(54002, "多重射擊",             Common.levelFour, Common.hunter, "對敵方兩個隨機手下造成 3點傷害",                                  "基本", "基本");
        insert(54003, "感染的狼",             Common.levelFour, Common.hunter, "死亡之聲：召喚 2個1/1的蜘蛛",                                     "精良", "古神碎碎念");
        insert(54004, "巡邏科多獸",           Common.levelFour, Common.hunter, "戰吼：造成等同此手下攻擊力的傷害",                                "精良", "加基森風雲");
        insert(54005, "自爆蝙蝠",             Common.levelFour, Common.hunter, "死亡之聲：對全部敵方手下造成2點傷害",                             "精良", "冰封王座");
        insert(54006, "普崔希德教授",         Common.levelFour, Common.hunter, "在你打出秘密後，將一個隨機獵人秘密放到戰場",                      "傳說", "冰封王座");

        //level5
        insert(55001, "飢餓的禿鷲",           Common.levelFive, Common.hunter, "野獸,每當你召喚野獸，抽一張牌",                                  "基本", "基本");
        insert(55002, "凍原犀牛",             Common.levelFive, Common.hunter, "野獸,你的野獸獲得衝鋒",                                          "基本", "基本");
        insert(55003, "爆裂射擊",             Common.levelFive, Common.hunter, "對一個手下造成5點傷害，並對其兩側的手下造成2點傷害",             "精良", "經典");
        insert(55004, "哈霍蘭公主",           Common.levelFive, Common.hunter, "野獸,戰吼：觸發一個友方手下的死亡之聲",                          "傳說", "古神碎碎念");
        insert(55005, "『指虎』那寇斯",       Common.levelFive, Common.hunter, "野獸,在他攻擊手下後，也會攻擊敵方英雄",                          "傳說", "加基森風雲");
        insert(55006, "食人魚發射器",         Common.levelFive, Common.hunter, "在你的英雄 攻擊後，召喚一個 1/1食人魚",                          "史詩", "加基森風雲");
        insert(55007, "托維爾看守者",         Common.levelFive, Common.hunter, "戰吼：從你的牌堆 中抽出兩張消耗為1的手下",                       "精良", "安戈洛歷險記");
        insert(55008, "死屍寡婦蛛",           Common.levelFive, Common.hunter, "野獸,你的死亡之聲牌消耗減少(2)點",                               "精良", "冰封王座");

        //level6
        insert(56001, "長鬃草原獅",           Common.levelSix, Common.hunter, "野獸,死亡之聲：召喚兩隻2/2土狼",                                  "精良", "經典");
        insert(56001, "『死屍獸王』雷克薩",   Common.levelSix, Common.hunter, "英雄,戰吼：對全部敵方手下造成2點傷害",                            "傳說", "冰封王座");

        //level7
        insert(57001, "鬥士長弓",             Common.levelSevenPlus, Common.hunter, "你的英雄在攻擊時免疫",                                      "史詩", "經典");
        insert(57002, "沼澤之王崔德",         Common.levelSevenPlus, Common.hunter, "野獸,在對手打出手下後，攻擊該手下",                         "傳說", "安戈洛歷險記");
        insert(57003, "縫合怪弓箭手",         Common.levelSevenPlus, Common.hunter, "死亡之聲：召喚 本賽局中死亡的一個隨機友方野獸",             "史詩", "冰封王座");

        //level8
        insert(58001, "巨大沙蟲",             Common.levelSevenPlus, Common.hunter, "野獸,每當它攻擊並殺死一個手下，它就能再次攻擊",             "史詩", "古神碎碎念");

        //level9
        insert(59001, "克洛許王",             Common.levelSevenPlus, Common.hunter, "野獸,衝鋒",                                                 "傳說", "經典");
        insert(59002, "野性呼喚",             Common.levelSevenPlus, Common.hunter, "召喚所有的動物夥伴",                                        "史詩", "古神碎碎念");
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
