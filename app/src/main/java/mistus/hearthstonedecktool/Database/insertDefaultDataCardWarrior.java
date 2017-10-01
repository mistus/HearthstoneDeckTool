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
        insert(10001, "心靈之怒",         Common.levelZero, Common.warrior, "對一個手下造成一點傷害，它獲得+2攻擊力",                      "普通", "經典");

        //Level1
        insert(11001, "化血為膿",         Common.levelOne, Common.warrior, "對一個手下造成一點傷害，若其存活，召喚一個2/2軟泥怪",          "精良", "古神碎碎念");
        insert(11002, "升級",             Common.levelOne, Common.warrior, "若你裝備了武器，賦予它+1/+1。若無，則裝備一把1/3的武器",       "精良", "經典");
        insert(11003, "強韌外皮",         Common.levelOne, Common.warrior, "獲得五點護甲值",                                               "普通", "安戈洛歷險記");
        insert(11004, "恩若司的大副",     Common.levelOne, Common.warrior, "海盜,戰吼：裝備一把1/3的生鏽鐵鉤",                             "普通", "古神碎碎念");
        insert(11005, "我認識那個誰",     Common.levelOne, Common.warrior, "發現一張嘲諷牌",                                               "普通", "加基森風雲");
        insert(11006, "戰爭機器人",       Common.levelOne, Common.warrior, "機械,狂怒：+1攻擊力",                                          "普通", "哥哥打地地");
        insert(11007, "旋風斬",           Common.levelOne, Common.warrior, "對全部手下造成一點傷害",                                       "基本", "基本");
        insert(11008, "火羽之心",         Common.levelOne, Common.warrior, "任務：打出7個有嘲諷的手下 獎勵：薩弗拉斯",                     "傳說", "安戈洛歷險記");
        insert(11009, "熔火之刃",         Common.levelOne, Common.warrior, "在你手中的每個回合，都會變成一把隨機的武器",                   "精良", "安戈洛歷險記");
        insert(11010, "盾牌猛擊",         Common.levelOne, Common.warrior, "對一個手下造成同等你護甲的傷害",                               "史詩", "經典");
        insert(11011, "衝鋒",             Common.levelOne, Common.warrior, "賦予一個友方手下衝鋒。但是本回合無法攻擊英雄",                 "基本", "基本");
        insert(11012, "詛咒之刃",         Common.levelOne, Common.warrior, "你的英雄受到傷害提高一倍",                                     "精良", "探險者協會");
        insert(11013, "活化的狂戰士",     Common.levelOne, Common.warrior, "在你打出手下 後，對打出的手下 造成1點傷害",                    "普通", "冰封王座");

        //Level2 //TODO 追加種族 冰封王座
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
        //變成三費哭哭
        //insert(12013, "熾炎戰斧",         Common.levelTwo, Common.warrior, "武器",                                                         "基本", "基本");
        insert(12014, "猛擊",             Common.levelTwo, Common.warrior, "對一個手下造成兩點傷害，如果她活下來，抽一張牌",               "普通", "經典");
        insert(12015, "練習夥伴",         Common.levelTwo, Common.warrior, "嘲諷，戰吼：賦予一個手下嘲諷",                                 "精良", "銀白聯賽");
        insert(12016, "荷巴爾特‧繫錘",    Common.levelTwo, Common.warrior, "戰吼：賦予你手中和牌堆所有武器+1攻擊力",                       "傳說", "加基森風雲");
        insert(12017, "英勇打擊",         Common.levelTwo, Common.warrior, "本回合賦予你的英雄+4攻擊力",                                   "基本", "基本");
        insert(12018, "護甲鍛造師",       Common.levelTwo, Common.warrior, "每當一個友方手下受到傷害，+1護甲值",                           "精良", "經典");
        insert(12019, "雅立史卓莎的勇士", Common.levelTwo, Common.warrior, "戰吼：若你手中有龍類，獲得+1攻擊力與衝鋒",                     "精良", "銀白聯賽");
        insert(12020, "順劈斬",           Common.levelTwo, Common.warrior, "對兩個隨機敵方手下造成2點傷害",                                "基本", "基本");
        insert(12021, "亡者之手",         Common.levelTwo, Common.warrior, "複製你所有 手牌並洗入你的牌堆中",                              "史詩", "冰封王座");
        insert(12022, "靈魂熔爐",         Common.levelTwo, Common.warrior, "從你的牌堆中抽出2張武器牌",                                    "基本", "冰封王座");
        insert(12023, "放馬過來！",       Common.levelTwo, Common.warrior, "獲得10點護甲值。敵方手中的手下消耗降低(2)點",                  "史詩", "冰封王座");


        //Level3
        insert(13001, "白沫狂戰士",       Common.levelThree, Common.warrior, "每當一個手下受到傷害，獲得+1攻擊力",                         "精良", "經典");
        insert(13002, "熾炎戰斧",         Common.levelThree, Common.warrior, "武器",                                                       "基本", "基本");
        insert(13003, "盾牌格擋",         Common.levelThree, Common.warrior, "獲得5點護甲值。抽一張牌。",                                  "基本", "基本");
        insert(13004, "戰歌指揮官",       Common.levelThree, Common.warrior, "你有衝鋒的手下獲得+1攻擊力",                                 "基本", "基本");
        insert(13005, "彈跳鋒刃",         Common.levelThree, Common.warrior, "對一個隨機手下造成1點傷害。反覆彈跳直到一個手下死亡為止",    "史詩", "哥哥打地地");
        insert(13006, "巨魔戰槌",         Common.levelThree, Common.warrior, "武器,有50%機率攻擊 錯誤的敵人",                              "普通", "哥哥打地地");
        insert(13007, "重擊",             Common.levelThree, Common.warrior, "造成3點傷害 獲得3點護甲值",                                  "普通", "銀白聯賽");
        insert(13008, "王家防衛者",       Common.levelThree, Common.warrior, "戰吼：若你擁有一個嘲諷的手下，就獲得+1耐久度",               "精良", "銀白聯賽");
        insert(13009, "奧格瑪志士",       Common.levelThree, Common.warrior, "激勵：賦予你的武器+1攻擊力",                                 "普通", "銀白聯賽");
        insert(13010, "兇暴的猴子",       Common.levelThree, Common.warrior, "野獸,嘲諷",                                                  "普通", "探險者協會");
        insert(13011, "破壞狂食屍鬼",     Common.levelThree, Common.warrior, "戰吼：對全部 其他手下造成1點傷害",                           "普通", "古神碎碎念");
        insert(13012, "血之邪咒",         Common.levelThree, Common.warrior, "複製場上 每個受傷的友方手下，放到你的手中",                  "史詩", "古神碎碎念");
        insert(13013, "血帆教徒",         Common.levelThree, Common.warrior, "海盜,戰吼：若你場上有另一個海盜，賦予你的武器+1/+1",         "精良", "古神碎碎念");
        insert(13014, "汙街典當商",       Common.levelThree, Common.warrior, "戰吼：賦予你手中一個隨機武器+1/+1",                          "精良", "加基森風雲");
        insert(13015, "山火裝甲之魂",     Common.levelThree, Common.warrior, "死亡之聲：若在 對手回合死亡，獲得 6點護甲值",                "精良", "冰封王座");
        insert(13016, "華爾琪索魂者",     Common.levelThree, Common.warrior, "每當此手下 受傷後存活，召喚 一個2/2食屍鬼",                  "精良", "冰封王座");
        insert(13016, "保護國王！",       Common.levelThree, Common.warrior, "召喚等同敵方手下數量並有嘲諷的1/1士兵",                      "精良", "夜夜卡拉贊");

        //Level4
        insert(14001, "柯爾克隆精英",     Common.levelFour, Common.warrior, "戰吼：裝備一把2/2的武器",                                     "基本", "基本");
        insert(14002, "阿拉希武器鍛造師", Common.levelFour, Common.warrior, "衝鋒",                                                        "精良", "經典");
        insert(14003, "致死打擊",         Common.levelFour, Common.warrior, "造成4點傷害。若你生命值在12點以下則造成6點傷害",              "精良", "經典");
        insert(14004, "死亡之噬",         Common.levelFour, Common.warrior, "死亡之聲：對全部手下造成1點傷害",                             "普通", "納克薩瑪斯");
        insert(14005, "破舊的維修機甲",   Common.levelFour, Common.warrior, "機械,戰吼：賦予一個友方機械+2/+2",                            "精良", "哥哥打地地");
        insert(14006, "飛斧投擲者",       Common.levelFour, Common.warrior, "每當此手下受到 傷害，對敵方英雄 造成2點傷害",                 "普通", "勇闖黑石山");
        insert(14007, "猛瑪象人首領",     Common.levelFour, Common.warrior, "同時也會對他目標兩側的手下造成傷害",                          "史詩", "銀白聯賽");
        insert(14008, "血蹄勇戰者",       Common.levelFour, Common.warrior, "嘲諷 狂怒：+3攻擊力",                                         "普通", "古神碎碎念");
        insert(14009, "黃銅指虎",         Common.levelFour, Common.warrior, "在你的英雄攻擊 後，賦予你手中一個 隨機手下+1/+1",             "史詩", "加基森風雲");
        insert(14010, "汙手發明家",       Common.levelFour, Common.warrior, "在你的回合結束時，賦予你手中一個隨機手下+2/+2",               "普通", "加基森風雲");
        insert(14011, "血刃",             Common.levelFour, Common.warrior, "戰吼及死亡之聲： 對全部手下 造成1點傷害",                     "普通", "冰封王座");

        //Level5
        insert(15001, "奧金收割斧",       Common.levelFive, Common.warrior, "武器",                                                        "基本", "基本");
        insert(15002, "鬥毆",             Common.levelFive, Common.warrior, "摧毀全部手下，只留下一個。",                                  "史詩", "經典");
        insert(15003, "攻城機具",         Common.levelFive, Common.warrior, "機械,每當你獲得護甲值，賦予此手下+1攻擊力",                   "精良", "哥哥打地地");
        insert(15004, "再生觸手",         Common.levelFive, Common.warrior, "死亡之聲：使這張牌返回你的手中",                              "史詩", "古神碎碎念");
        insert(15005, "鐵爐堡傳送門",     Common.levelFive, Common.warrior, "獲得4點護甲值。召喚一個消耗為4的隨機手下",                    "普通", "夜夜卡拉贊");
        insert(15006, "蠢人災厄",         Common.levelFive, Common.warrior, "每回合攻擊次數不限。無法攻擊英雄",                            "普通", "夜夜卡拉贊");
        insert(15007, "暗巷護甲鍛造師",   Common.levelFive, Common.warrior, "嘲諷 每當此手下造成傷害 獲得等量的護甲值",                    "精良", "加基森風雲");
        insert(15008, "分裂生殖",         Common.levelFive, Common.warrior, "複製場上每個受傷的友方手下",                                  "史詩", "安戈洛歷險記");
        insert(15009, "小恐角龍",         Common.levelFive, Common.warrior, "嘲諷。死亡之聲：將一個有嘲諷的6/9恐角龍洗入你的牌堆",         "精良", "安戈洛歷險記");
        insert(15010, "死魂亡魄",         Common.levelFive, Common.warrior, "戰吼：場上每個受傷的手下使其獲得+1/+1",                       "精良", "冰封王座");

        //Level6
        insert(16001, "女盾侍",           Common.levelSix, Common.warrior, "戰吼：獲得5點護甲值",                                          "精良", "哥哥打地地");
        insert(16002, "鋼鐵破滅邪神",     Common.levelSix, Common.warrior, "機械,戰吼：將「地雷」洗入對手的牌堆中。抽中時對其造成10點傷害","傳說", "哥哥打地地");
        insert(16003, "海劫者",           Common.levelSix, Common.warrior, "當你抽到這張牌，對你 全部手下造成1點傷害",                     "史詩", "銀白聯賽");
        insert(16004, "暴躁的恐角龍",     Common.levelSix, Common.warrior, "野獸,嘲諷 戰吼：演化",                                         "普通", "安戈洛歷險記");

        //Level7+
        insert(17001, "血吼之斧",                 Common.levelSevenPlus, Common.warrior, "武器,攻擊手下會降低1點攻擊力，而非1點耐久度",                     "史詩", "經典");
        insert(17002, "葛羅瑪許·地獄吼",          Common.levelSevenPlus, Common.warrior, "衝鋒。 狂怒：+6攻擊力",                                           "傳說", "經典");
        insert(17003, "粉碎",                     Common.levelSevenPlus, Common.warrior, "摧毀一個手下。若你有受傷的手下在場上，消耗減少(4)點",             "史詩", "哥哥打地地");
        insert(17004, "瓦里安‧烏瑞恩",            Common.levelSevenPlus, Common.warrior, "戰吼：抽3張牌 你抽到的手下會直接進入戰場",                        "傳說", "銀白聯賽");
        insert(17005, "黑曜石毀滅者",             Common.levelSevenPlus, Common.warrior, "在你的回合結束時，召喚一隻有嘲諷的1/1聖甲蟲",                     "普通", "探險者協會");
        insert(17006, "馬可羅克",                 Common.levelSevenPlus, Common.warrior, "戰吼：裝備一把隨機武器",                                          "傳說", "古神碎碎念");
        insert(17007, "上古執盾兵",               Common.levelSevenPlus, Common.warrior, "戰吼：如果你的克蘇恩有10點以上的攻擊力，獲得10點護甲值",          "精良", "古神碎碎念");
        insert(17008, "焦油首領",                 Common.levelSevenPlus, Common.warrior, "元素,嘲諷 在對手的回合獲得 +4攻擊力",                             "普通", "安戈洛歷險記");
        insert(17009, "暴龍之王莫什",             Common.levelSevenPlus, Common.warrior, "野獸,戰吼：摧毀全部 受傷的手下",                                  "傳說", "安戈洛歷險記");
        insert(17010, "腐臉",                     Common.levelSevenPlus, Common.warrior, "每當此手下受傷後 存活，召喚一個隨機傳說手下",                     "傳說", "冰封王座");
        insert(17011, "『天譴領主』卡爾洛斯",     Common.levelSevenPlus, Common.warrior, "英雄,戰吼：裝備一把 4/3的影之哀傷，它可以同時傷害目標兩側的手下", "傳說", "冰封王座");


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
