package mistus.hearthstonedecktool.Database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import mistus.hearthstonedecktool.Common.Common;

public class insertDefaultDataCardShaman {

    private SQLiteDatabase DB;

    public insertDefaultDataCardShaman(SQLiteDatabase DB) {
        this.DB = DB;
    }

    public void insertDefaultData(){
        //TODO 種族
        //ID職業星數編號, Level, Job, Description, Type, series
        //Level0
        insert(20001, "先祖治療",         Common.levelZero, Common.Shaman, "使一個手下的生命值恢復到全滿並賦予嘲諷",                       "普通", "基本");
	insert(20002, "圖騰之力",         Common.levelZero, Common.Shaman, "賦予你的圖騰+2生命值", 			                   "普通", "基本");
        //Level1
        insert(21001, "先搶先贏",         Common.levelOne, Common.Shaman, "發現 一張有超載的牌 超載：(1)				  "史詩", "加基森風雲");
        insert(21002, "塵魔",             Common.levelOne, Common.Shaman, "風怒。超載：(2)",       					  "普通", "經典");
        insert(21003, "大地震擊",         Common.levelOne, Common.Shaman, "沉默一個手下，然後對它造成1點傷害",                            "普通", "經典");
        insert(21004, "叉狀閃電",	  Common.levelOne, Common.Shaman, "對2個隨機敵方手下造成2點傷害。超載：(2)",                      "普通", "經典");
        insert(21005, "冰霜震擊",	  Common.levelOne, Common.Shaman, "對一個敵方角色造成1點傷害並使其凍結",                          "基本", "基本");
        insert(21006, "閃電箭", 	  Common.levelOne, Common.Shaman, "造成3點傷害。超載：(1)",                                       "普通", "經典");
        insert(21007, "原始融合",         Common.levelOne, Common.Shaman, "你的每個圖騰可以賦予一個手下+1/+1",                            "普通", "古神碎碎念");
        insert(21008, "進化",             Common.levelOne, Common.Shaman, "將你的手下變形為消耗增加(1)點的 隨機手下",                     "精良", "古神碎碎念");
        insert(21009, "風元素",           Common.levelOne, Common.Shaman, "無法被法術或英雄能力指定",                   		  "普通", "安戈洛歷險記");
        insert(21010, "魚人總動員",       Common.levelOne, Common.Shaman, "任務：召喚 10個魚人 獎勵：大大鰭",                             "傳說", "安戈洛歷險記");
        insert(21011, "礦道穴居怪",       Common.levelOne, Common.Shaman, "每當你超載，每顆鎖定的法力水晶可使其+1攻擊力",                 "普通", "探險者協會");
        //Level2
        insert(22001, "偷來的貨",         Common.levelTwo, Common.Shaman, "賦予你手中一個有嘲諷的隨機手下+3/+3",                          "精良", "加基森風雲");
        insert(22002, "公設辯護人",       Common.levelTwo, Common.Shaman, "嘲諷",                                                         "普通", "加基森風雲");
        insert(22003, "受困的哨衛",       Common.levelTwo, Common.Shaman, "嘲諷，戰吼：為對手召喚三隻1/1的迅猛龍",                        "精良", "安戈洛歷險記");
        insert(22004, "命令之吼",         Common.levelTwo, Common.Shaman, "你手下的生命值在本回合不會低於一點，抽一張牌",                 "精良", "經典");
        insert(22005, "復仇",             Common.levelTwo, Common.Shaman, "對全部手下造成一點傷害，若你生命值在12點以下則造成三點傷害",   "精良", "勇闖黑石山");
        insert(22006, "戰鬥狂怒",         Common.levelTwo, Common.Shaman, "抽牌，數量等同友方受傷角色的總數",                             "普通", "經典");
        insert(22007, "探索安戈洛",       Common.levelTwo, Common.Shaman, "把你卡推中的牌全部換成發現一張牌",                             "史詩", "安戈洛歷險記");
        insert(22008, "提振士氣",         Common.levelTwo, Common.Shaman, "賦予你有嘲諷的手下+2/+2",                                      "普通", "銀白聯賽");
        insert(22009, "斬殺",             Common.levelTwo, Common.Shaman, "摧毀一個已經受傷的手下",                                       "基本", "基本");
        insert(22010, "暴怒",             Common.levelTwo, Common.Shaman, "賦予一個受傷的手下+3/+3",                                      "普通", "經典");
        insert(22011, "殘酷的監工",       Common.levelTwo, Common.Shaman, "戰吼：對一個手下造成一點傷害並賦予它+2攻擊力",                 "普通", "經典");
        insert(22012, "沉魚落堰",         Common.levelTwo, Common.Shaman, "對全部受傷的手下造成3點傷害",                                  "史詩", "加基森風雲");
        insert(22013, "熾炎戰斧",         Common.levelTwo, Common.Shaman, "武器",                                                         "基本", "基本");
        insert(22014, "猛擊",             Common.levelTwo, Common.Shaman, "對一個手下造成兩點傷害，如果她活下來，抽一張牌",               "普通", "經典");
        insert(22015, "練習夥伴",         Common.levelTwo, Common.Shaman, "嘲諷，戰吼：賦予一個手下嘲諷",                                 "精良", "銀白聯賽");
        insert(22016, "荷巴爾特‧繫錘",   Common.levelTwo, Common.Shaman, "戰吼：賦予你手中和牌堆所有武器+1攻擊力",                       "傳說", "加基森風雲");
        insert(22017, "英勇打擊",         Common.levelTwo, Common.Shaman, "本回合賦予你的英雄+4攻擊力",                                   "基本", "基本");
        insert(22018, "護甲鍛造師",       Common.levelTwo, Common.Shaman, "每當一個友方手下受到傷害，+1護甲值",                           "精良", "經典");
        insert(22019, "雅立史卓莎的勇士", Common.levelTwo, Common.Shaman, "戰吼：若你手中有龍類，獲得+1攻擊力與衝鋒",                     "精良", "銀白聯賽");
        insert(22020, "順劈斬",           Common.levelTwo, Common.Shaman, "對兩個隨機敵方手下造成2點傷害",                                "基本", "基本");

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