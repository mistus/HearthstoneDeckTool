package mistus.hearthstonedecktool.Database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import mistus.hearthstonedecktool.Common.Common;

public class insertDefaultDataCardDruid {

    private SQLiteDatabase DB;

    public insertDefaultDataCardDruid(SQLiteDatabase DB) {
        this.DB = DB;
    }

    public void insertDefaultData(){
        //TODO 種族
        //ID職業星數編號, Level, Job, Description, Type, series
        //Level0　null
        insert(60001, "啟動",               Common.levelOne, Common.druid, "在本回合獲得額外1顆法力水晶",                                      "基本", "基本");
        insert(60002, "月火術",             Common.levelOne, Common.druid, "造成1點傷害",                                                      "基本", "基本");

        //Level1
        insert(61001, "爪擊",               Common.levelOne, Common.druid, "賦予你的英雄2點護甲值及本回合內+2攻擊力",                          "基本", "基本");
        insert(61002, "自然化",             Common.levelOne, Common.druid, "摧毀一個手下。你的對手抽2張牌",                                    "普通", "經典");
        insert(61003, "兇蠻",               Common.levelOne, Common.druid, "對一個敵方手下造成等同你英雄攻擊力的傷害",                         "精良", "經典");
        insert(61004, "禁咒古樹",           Common.levelOne, Common.druid, "戰吼：花費所有法力。每點法力可使其獲得+1/+1",                      "史詩", "古神碎碎念");
        insert(61005, "魔法烏鴉",           Common.levelOne, Common.druid, "野獸",                                                             "普通", "夜夜卡拉贊");
        insert(61006, "翠玉塑像",           Common.levelOne, Common.druid, "二選一：召喚 一個翠玉魔像，或將三張翠玉塑像洗入你的牌堆中",        "精良", "加基森風雲");
        insert(61007, "玉蓮印記",           Common.levelOne, Common.druid, "賦予你全部的手下+1/+1",                                            "普通", "加基森風雲");
        insert(61008, "地化鱗片",           Common.levelOne, Common.druid, "賦予一個友方手下+1/+1，並獲得等同其攻擊力的護甲值",                "精良", "安戈洛歷險記");
        insert(61009, "叢林大怪獸",         Common.levelOne, Common.druid, "任務：召喚5個攻擊力5點以上的手下 獎勵：巴納伯斯",                  "傳說", "安戈洛歷險記");

        //Level2
        insert(62001, "野性印記",           Common.levelTwo, Common.druid, "賦予一個手下嘲諷及+2/+2",                                          "基本", "基本");
        insert(62002, "野性成長",           Common.levelTwo, Common.druid, "獲得1顆空的法力水晶",                                              "基本", "基本");
        insert(62003, "野性之力",           Common.levelTwo, Common.druid, "二選一：使你的全部手下+1/+1，或召喚一隻3/2獵豹",                   "普通", "經典");
        insert(62004, "憤怒",               Common.levelTwo, Common.druid, "二選一：對一手下造成3點傷害，或造成1點傷害並抽一張牌",             "普通", "經典");
        insert(62005, "亞煞拉懼印記",       Common.levelTwo, Common.druid, "賦予一個手下+2/+2。如果該手下是野獸，抽一張牌",                    "普通", "古神碎碎念");
        insert(62006, "托爾托採獵者",       Common.levelTwo, Common.druid, "戰吼：放一張 攻擊力5點以上的隨機手下到你的手中",                   "普通", "安戈洛歷險記");
        insert(62007, "化蟲德魯伊",         Common.levelTwo, Common.druid, "二選一：變形為有致命劇毒的1/2手下，或是有嘲諷的1/5手下",           "精良", "冰封王座");

        //level3
        insert(63001, "治療之觸",             Common.levelThree, Common.druid, "恢復8點生命值",                                                "基本", "基本");
        insert(63002, "兇蠻咆哮",             Common.levelThree, Common.druid, "本回合 賦予你全部的角色+2攻擊力",                              "基本", "基本");
        insert(63003, "自然印記",             Common.levelThree, Common.druid, "二選一：給一個手下+4攻擊力，或+4生命值及嘲諷",                 "普通", "經典");
        insert(63004, "狂野怒氣",             Common.levelThree, Common.druid, "二選一：本回合賦予你的英雄+4攻擊力，或是8點護甲值",            "普通", "古神碎碎念");
        insert(63005, "混亂灰熊",             Common.levelThree, Common.druid, "野獸,在你召喚手下後，賦予召喚出的手下+1/+1",                   "精良", "古神碎碎念");
        insert(63006, "偷取力量",             Common.levelThree, Common.druid, "每個友方手下使你獲得1顆空的法力水晶",                          "史詩", "加基森風雲");
        insert(63007, "天尊睡夢者",           Common.levelThree, Common.druid, "戰吼：若你場上有攻擊力5點以上的手下，獲得+2/+2",               "精良", "加基森風雲");
        insert(63008, "翠玉之花",             Common.levelThree, Common.druid, "召喚一個 翠玉魔像。獲得 1顆空的法力水晶",                      "普通", "加基森風雲");
        insert(63009, "老邁長頸龍",           Common.levelThree, Common.druid, "野獸,戰吼：若你手中有攻擊力5點以上的手下，演化",               "普通", "安戈洛歷險記");
        insert(63010, "囓咬",                 Common.levelThree, Common.druid, "賦予你的 英雄3點護甲值及本回合內+3攻擊力",                     "普通", "冰封王座");
        insert(63011, "地穴領主",             Common.levelThree, Common.druid, "嘲諷 在你召喚手下後，獲得+1生命值",                            "普通", "冰封王座");

        //level4
        insert(64001, "揮擊",                 Common.levelFour, Common.druid, "對一個敵人造成4點傷害，並對其他敵人造成1點傷害",                "基本", "基本");
        insert(64002, "撕咬",                 Common.levelFour, Common.druid, "賦予你的 英雄4點護甲值及本回合內+4攻擊力",                      "精良", "經典");
        insert(64003, "森林看守者",           Common.levelFour, Common.druid, "二選一：造成2點傷害，或沉默一個手下",                           "精良", "經典");
        insert(64004, "森林之魂",             Common.levelFour, Common.druid, "賦予你的手下「死亡之聲：召喚一個2/2樹人」",                     "普通", "經典");
        insert(64005, "范達爾‧鹿盔",          Common.levelFour, Common.druid, "你的二選一卡牌和 英雄能力可以同時擁有兩種效果",                 "傳說", "古神碎碎念");
        insert(64006, "卡拉西編珀者",         Common.levelFour, Common.druid, "戰吼：如果你的克蘇恩有10點以上的攻擊力，獲得+5生命值",          "精良", "古神碎碎念");
        insert(64007, "沼地看守者",           Common.levelFour, Common.druid, "二選一：召喚一個 2/2軟泥怪，或是獲得 1顆空的法力水晶",          "精良", "古神碎碎念");
        insert(64008, "龜殼變形者",           Common.levelFour, Common.druid, "二選一：變形為有 潛行的5/3手下，或是 有嘲諷的3/5手下",          "精良", "安戈洛歷險記");
        insert(64009, "演化孢子",             Common.levelFour, Common.druid, "演化你的手下",                                                  "精良", "安戈洛歷險記");
        insert(64010, "硬殼拾荒者",           Common.levelFour, Common.druid, "戰吼：賦予你場上有嘲諷的手下+2/+2",                             "精良", "冰封王座");

        //level5
        insert(65001, "利爪德魯伊",           Common.levelFive, Common.druid, "二選一：變形為有 衝鋒的4/4手下，或是 有嘲諷的4/6手下",          "普通", "經典");
        insert(65002, "自然之力",             Common.levelFive, Common.druid, "召喚三個2/2樹人",                                               "史詩", "經典");
        insert(65003, "滋補術",               Common.levelFive, Common.druid, "二選一：獲得2顆法力水晶，或抽3張牌",                            "精良", "經典");
        insert(65004, "星殞術",               Common.levelFive, Common.druid, "二選一：造成一個手下5點傷害，或全部敵方手下2點傷害",            "精良", "經典");
        insert(65005, "月之洞察",             Common.levelFive, Common.druid, "抽2張牌 抽出的手下消耗 減少(2)點",                              "史詩", "加基森風雲");
        insert(65006, "兔妖師尊",             Common.levelFive, Common.druid, "戰吼：賦予一個友方野獸+2/+2",                                   "精良", "加基森風雲");
        insert(65007, "蒼綠長頸龍",           Common.levelFive, Common.druid, "野獸,戰吼：演化",                                               "普通", "安戈洛歷險記");
        insert(65008, "活體法力",             Common.levelFive, Common.druid, "將你的法力水晶變成2/2的手下，其死亡時可還原為法力",             "史詩", "安戈洛歷險記");
        insert(65009, "命運編織者",           Common.levelFive, Common.druid, "隱密死聲：對全部手下造成3點傷害，或賦予全部手下+2/+2",          "史詩", "冰封王座");
        insert(65010, "織網",                 Common.levelFive, Common.druid, "召喚2個有 致命劇毒的1/2蜘蛛",                                   "普通", "冰封王座");

        //level6
        insert(66001, "星火術",               Common.levelSix, Common.druid, "造成5點傷害。抽一張牌",                                          "基本", "基本");
        insert(66002, "黑暗阿拉卡",           Common.levelSix, Common.druid, "嘲諷。戰吼：無論你的克蘇恩位於何處，賦予它+3/+3",                "普通", "古神碎碎念");
        insert(66003, "展覽廳看守者",         Common.levelSix, Common.druid, "戰吼：選擇一個友方野獸，召喚一個牠的複製體",                     "普通", "夜夜卡拉贊");
        insert(66004, "月光林地傳送門",       Common.levelSix, Common.druid, "恢復6點生命值。召喚一個消耗為6的隨機手下",                       "精良", "夜夜卡拉贊");
        insert(66005, "翠玉巨獸",             Common.levelSix, Common.druid, "嘲諷 戰吼：召喚一個翠玉魔像",                                    "普通", "加基森風雲");
        insert(66006, "散播瘟疫",             Common.levelSix, Common.druid, "召喚一個有嘲諷的1/5甲蟲。若敵方的手下較多，再次施放此法術",      "精良", "冰封王座");

        //level7
        insert(67001, "知識古樹",             Common.levelSevenPlus, Common.druid, "二選一：抽1張牌，或恢復5點生命值",                         "史詩", "經典");
        insert(67002, "戰爭古樹",             Common.levelSevenPlus, Common.druid, "二選一： +5攻擊力，或+5生命值及嘲諷",                      "史詩", "經典");
        insert(67003, "古神幽光",             Common.levelSevenPlus, Common.druid, "二選一：召喚7個1/1幽光，或賦予你全部的手下+2/+2",          "史詩", "古神碎碎念");
        insert(67004, "大巨蟒",               Common.levelSevenPlus, Common.druid, "野獸,死亡之聲：從你手中召喚一個攻擊力5點以上的手下",       "史詩", "安戈洛歷險記");
        insert(67005, "『疫病蟲王』瑪法里恩", Common.levelSevenPlus, Common.druid, "二選一：召喚2個 有致命劇毒的蜘蛛或有嘲諷的甲蟲",           "傳說", "冰封王座");

        //level8
        insert(68001, "鐵桉保衛者",             Common.levelSevenPlus, Common.druid, "嘲諷",             "基本", "基本");

        //level9
        insert(69001, "塞納留斯",               Common.levelSevenPlus, Common.druid, "二選一：使你其他的手下+2/+2，或召喚兩個有嘲諷的2/2樹人",    "傳說", "經典");
        insert(69002, "哈卓諾克斯",             Common.levelSevenPlus, Common.druid, "野獸,死亡之聲：召喚 本賽局中死亡的友方嘲諷手下",            "傳說", "冰封王座");

        //level10
        insert(610001, "『遺忘君王』坤恩",      Common.levelSevenPlus, Common.druid, "二選一：獲得10點護甲值，或是回滿你的法力水晶",                "傳說", "加基森風雲");
        insert(610002, "泰藍塔斯",              Common.levelSevenPlus, Common.druid, "無法被法術或英雄能力指定",                                    "傳說", "安戈洛歷險記");
        insert(610003, "終極瘟疫",              Common.levelSevenPlus, Common.druid, "造成5點傷害，抽5張牌，獲得5點護甲值，並召喚一個5/5的食屍鬼",  "史詩", "冰封王座");

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
