package mistus.hearthstonedecktool.Database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import mistus.hearthstonedecktool.Common.Common;

public class insertDefaultDataCardWarrior {

    private SQLiteDatabase DB;

    public insertDefaultDataCardWarrior(SQLiteDatabase DB) {
        this.DB = DB;
    }

    public void insertDefaultData(){
        //TODO 種族
        //ID職業星數編號, Level, Job, Description, Type, series
        //Level0
        insert(10001, "心靈之怒",         Common.levelZero, Common.warrior, "對一個手下造成一點傷害，它獲得+2攻擊力",                       "普通", "經典");
        //Level1
        insert(11001, "化血為膿",         Common.levelOne, Common.warrior, "對一個手下造成一點傷害，若其存活，召喚一個2/2軟泥怪",          "精良", "古神碎碎念");
        insert(11002, "升級",             Common.levelOne, Common.warrior, "若你裝備了武器，賦予它+1/+1。若無，則裝備一把1/3的武器",       "精良", "經典");
        insert(11003, "強韌外皮",         Common.levelOne, Common.warrior, "獲得五點護甲值",                                               "普通", "安戈洛歷險記");
        insert(11004, "恩若司的大副",     Common.levelOne, Common.warrior, "戰吼：裝備一把1/3的生鏽鐵鉤",                                  "普通", "古神碎碎念");
        insert(11005, "我認識那個誰",     Common.levelOne, Common.warrior, "發現一張嘲諷牌",                                               "普通", "加基森風雲");
        insert(11006, "戰爭機器人",       Common.levelOne, Common.warrior, "狂怒：+1攻擊力",                                               "普通", "哥哥打地地");
        insert(11007, "旋風斬",           Common.levelOne, Common.warrior, "對全部手下造成一點傷害",                                       "基本", "基本");
        insert(11008, "火羽之心",         Common.levelOne, Common.warrior, "任務：打出7個有嘲諷的手下 獎勵：薩弗拉斯",                     "傳說", "安戈洛歷險記");
        insert(11009, "熔火之刃",         Common.levelOne, Common.warrior, "在你手中的每個回合，都會變成一把隨機的武器",                   "精良", "安戈洛歷險記");
        insert(11010, "盾牌猛擊",         Common.levelOne, Common.warrior, "對一個手下造成同等你護甲的傷害",                               "史詩", "經典");
        insert(11011, "衝鋒",             Common.levelOne, Common.warrior, "賦予一個友方手下衝鋒。但是本回合無法攻擊英雄",                 "基本", "基本");
        insert(11012, "詛咒之刃",         Common.levelOne, Common.warrior, "你的英雄受到傷害提高一倍",                                     "精良", "探險者協會");
        //Level2
        insert(12001, "偷來的貨",         Common.levelTwo, Common.warrior, "賦予你手中一個有嘲諷的隨機手下+3/+3",                          "精良", "加基森風雲");
        insert(12002, "公設辯護人",       Common.levelTwo, Common.warrior, "嘲諷",                                                         "普通", "加基森風雲");
        insert(12003, "受困的哨衛",       Common.levelTwo, Common.warrior, "嘲諷，戰吼：為對手召喚三隻1/1的迅猛龍",                        "精良", "安戈洛歷險記");
        insert(12004, "命令之吼",         Common.levelTwo, Common.warrior, "你手下的生命值在本回合不會低於一點，抽一張牌",                 "精良", "經典");
        insert(12005, "復仇",             Common.levelTwo, Common.warrior, "對全部手下造成一點傷害，若你生命值在12點以下則造成三點傷害",   "精良", "勇闖黑石山");
        insert(12006, "戰鬥狂怒",         Common.levelTwo, Common.warrior, "抽牌，數量等同友方受傷角色的總數",                             "普通", "經典");
        insert(12007, "探索安戈洛",       Common.levelTwo, Common.warrior, "把你卡推中的牌全部換成發現一張牌",                             "史詩", "安戈洛歷險記");
        insert(12008, "提振士氣",         Common.levelTwo, Common.warrior, "賦予你有嘲諷的手下+2/+2",                                      "普通", "銀白聯賽");
        insert(12009, "斬殺",             Common.levelTwo, Common.warrior, "摧毀一個已經受傷的手下",                                       "基本", "基本");
        insert(12010, "暴怒",             Common.levelTwo, Common.warrior, "賦予一個受傷的手下+3/+3",                                      "普通", "經典");
        insert(12011, "殘酷的監工",       Common.levelTwo, Common.warrior, "戰吼：對一個手下造成一點傷害並賦予它+2攻擊力",                 "普通", "經典");
        insert(12012, "沉魚落堰",         Common.levelTwo, Common.warrior, "對全部受傷的手下造成3點傷害",                                  "史詩", "加基森風雲");
        insert(12013, "熾炎戰斧",         Common.levelTwo, Common.warrior, "武器",                                                         "基本", "基本");
        insert(12014, "猛擊",             Common.levelTwo, Common.warrior, "對一個手下造成兩點傷害，如果她活下來，抽一張牌",               "普通", "經典");
        insert(12015, "練習夥伴",         Common.levelTwo, Common.warrior, "嘲諷，戰吼：賦予一個手下嘲諷",                                 "精良", "銀白聯賽");
        insert(12016, "荷巴爾特‧繫錘",   Common.levelTwo, Common.warrior, "戰吼：賦予你手中和牌堆所有武器+1攻擊力",                       "傳說", "加基森風雲");
        insert(12017, "英勇打擊",         Common.levelTwo, Common.warrior, "本回合賦予你的英雄+4攻擊力",                                   "基本", "基本");
        insert(12018, "護甲鍛造師",       Common.levelTwo, Common.warrior, "每當一個友方手下受到傷害，+1護甲值",                           "精良", "經典");
        insert(12019, "雅立史卓莎的勇士", Common.levelTwo, Common.warrior, "戰吼：若你手中有龍類，獲得+1攻擊力與衝鋒",                     "精良", "銀白聯賽");
        insert(12020, "順劈斬",           Common.levelTwo, Common.warrior, "對兩個隨機敵方手下造成2點傷害",                                "基本", "基本");

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
