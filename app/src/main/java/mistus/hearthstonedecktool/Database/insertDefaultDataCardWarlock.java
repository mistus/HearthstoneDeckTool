package mistus.hearthstonedecktool.Database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import mistus.hearthstonedecktool.Common.Common;

public class insertDefaultDataCardWarlock {

    private SQLiteDatabase DB;

    public insertDefaultDataCardWarlock(SQLiteDatabase DB) {
        this.DB = DB;
    }

    public void insertDefaultData(){

        //ID職業星數編號, Level, Job, Description, Type, series
        //Level0　
        insert(70001, "犧牲契印",      Common.levelZero, Common.warlock, "摧毀一個惡魔。使你的英雄恢復5點生命值",                  "基本", "基本");
        insert(70002, "禁咒儀式",      Common.levelZero, Common.warlock, "花費所有法力。召喚數量等同花費的1/1觸手",                "精良", "古神碎碎念");

        //Level1
        insert(71001, "腐蝕術",         Common.levelOne, Common.warlock, "選擇一個敵方手下。在你的回合開始時，摧毀它",              "基本", "基本");
        insert(71002, "死影纏繞",       Common.levelOne, Common.warlock, "對一個手下造成1點傷害。若其因此死亡，抽一張牌",           "基本", "基本");
        insert(71003, "靈魂之火",       Common.levelOne, Common.warlock, "造成4點傷害。隨機捨棄 一張牌",                           "基本", "基本");
        insert(71004, "虛無行者",       Common.levelOne, Common.warlock, "惡魔,嘲諷",                                             "基本", "基本");
        insert(71005, "血之小鬼",       Common.levelOne, Common.warlock, "惡魔,潛行。你的回合結束時，賦予另一個隨機友方手下+1生命值", "普通", "經典");
        insert(71006, "烈焰小鬼",       Common.levelOne, Common.warlock, "惡魔, 戰吼：對你的英雄造成3點傷害",                        "普通", "經典");
        insert(71007, "聖匣追尋者",     Common.levelOne, Common.warlock, "戰吼：若你場上有6個其他手下，獲得+4/+4",                   "精良", "探險者協會");
        insert(71008, "著魔的村民",     Common.levelOne, Common.warlock, "死亡之聲：召喚一個1/1暗影野獸",                            "普通", "古神碎碎念");
        insert(71009, "莫克札的小鬼",   Common.levelOne, Common.warlock, "惡魔,每當你捨棄一張牌，抽一張牌",                          "普通", "夜夜卡拉贊");
        insert(71010, "拉卡利獻祭",     Common.levelOne, Common.warlock, "任務：捨棄6張牌 獎勵：虛空傳送門",                         "傳說", "安戈洛歷險記");
        insert(71011, "血宴狂歡者",     Common.levelOne, Common.warlock, "戰吼：摧毀一個友方手下並獲得+2/+2",                        "普通", "冰封王座");
        insert(71012, "壓倒性的力量",   Common.levelOne, Common.warlock, "賦予一個友方手下+4/+4到回合結束。然後它會悲慘地死去",       "普通", "名人堂");

        //Level2
        insert(72001, "魅魔",             Common.levelTwo, Common.warlock, "惡魔, 戰吼：隨機捨棄 一張牌",                                            "基本", "基本");
        insert(72002, "惡魔火焰",         Common.levelTwo, Common.warlock, "對一個手下造成2點傷害。若目標是友方惡魔，賦予它+2/+2",                    "普通", "經典");
        insert(72003, "黑暗炸彈",         Common.levelTwo, Common.warlock, "造成3點傷害",                                                           "基本", "哥哥打地地");
        insert(72004, "苦痛仕女",         Common.levelTwo, Common.warlock, "惡魔,生命竊取",                                                         "精良", "哥哥打地地");
        insert(72005, "小小邪惡騎士",     Common.levelTwo, Common.warlock, "惡魔,每當你捨棄一張牌，獲得+1/+1",                                       "精良", "銀白聯賽");
        insert(72006, "惡魔融合",         Common.levelTwo, Common.warlock, "賦予一個惡魔+3/+3。給你的對手1顆法力水晶",                               "普通", "銀白聯賽");
        insert(72007, "憤怒守衛",         Common.levelTwo, Common.warlock, "惡魔,每當此手下受到傷害，對你的英雄也造成等量的傷害",                     "普通", "銀白聯賽");
        insert(72008, "拉法姆的詛咒",     Common.levelTwo, Common.warlock, "給你的對手一張「受到詛咒！」。若這張牌在其手中，每回合對其造成2點傷害",    "普通", "探險者協會");
        insert(72009, "黑暗道具商",       Common.levelTwo, Common.warlock, "戰吼：發現一張法力消耗為1的牌",                                          "普通", "探險者協會");
        insert(72010, "夜色鎮圖書管理員", Common.levelTwo, Common.warlock, "戰吼：隨機捨棄一張牌 死亡之聲：抽一張牌",                                 "精良", "古神碎碎念");
        insert(72011, "棄暗投明",         Common.levelTwo, Common.warlock, "將你的英雄能力與術士卡牌改為其他職業。更換後的卡牌消耗減少(1)點",          "史詩", "古神碎碎念");
        insert(72012, "腐蝕迷霧",         Common.levelTwo, Common.warlock, "腐蝕全部手下。在你下回合開始時，摧毀它們",                                "精良", "安戈洛歷險記");
        insert(72013, "鮮血綻放",         Common.levelTwo, Common.warlock, "本回合施放的下一個法術會消耗生命值而非法力",                              "史詩", "安戈洛歷險記");
        insert(72014, "薩瓦絲女王",       Common.levelTwo, Common.warlock, "野獸,每當你捨棄這張牌，賦予它+2/+2，然後返回你的手中",                    "傳說", "安戈洛歷險記");
        insert(72015, "褻瀆",             Common.levelTwo, Common.warlock, "對全部手下造成1點傷害。若有手下死亡，則再次施放",                         "精良", "冰封王座");
        insert(72016, "吸取靈魂",         Common.levelTwo, Common.warlock, "生命竊取 對一個手下造成 2點傷害",                                         "普通", "冰封王座");
        insert(72017, "吸血地精",         Common.levelTwo, Common.warlock, "戰吼：移除對手牌堆最上面的牌",                                            "史詩", "冰封王座");

        //Level3
        insert(73001, "吸取生命",             Common.levelThree, Common.warlock, "造成2點傷害。使你的英雄恢復2點生命值",                             "基本", "基本");
        insert(73002, "暗影箭",               Common.levelThree, Common.warlock, "對一個手下造成4點傷害",                                            "基本", "基本");
        insert(73003, "惡魔守衛",             Common.levelThree, Common.warlock, "惡魔,嘲諷。戰吼：摧毀1顆你的法力水晶",                             "精良", "經典");
        insert(73004, "感知惡魔",             Common.levelThree, Common.warlock, "從你的牌堆中 抽出2張惡魔牌",                                       "普通", "經典");
        insert(73005, "虛無恐獸",             Common.levelThree, Common.warlock, "惡魔,戰吼：摧毀兩側的手下，獲得他們的攻擊力和生命值",              "精良", "經典");
        insert(73006, "惡魔怒火",             Common.levelThree, Common.warlock, "對全部非惡魔 手下造成2點傷害",                                     "精良", "勇闖黑石山");
        insert(73007, "小鬼幫派老大",         Common.levelThree, Common.warlock, "惡魔,每當此手下受到傷害，召喚一個1/1小鬼",                         "普通", "勇闖黑石山");
        insert(73008, "夜色鎮議員",           Common.levelThree, Common.warlock, "在你召喚手下後， 獲得+1攻擊力",                                    "普通", "古神碎碎念");
        insert(73009, "瘋狂蔓延",             Common.levelThree, Common.warlock, "造成9點傷害，隨機分給 全部角色",                                   "精良", "古神碎碎念");
        insert(73010, "銀器魔像",             Common.levelThree, Common.warlock, "如果你捨棄了這個手下，召喚它",                                     "精良", "夜夜卡拉贊");
        insert(73011, "血怒藥水",             Common.levelThree, Common.warlock, "賦予一個手下+3攻擊力。若目標是惡魔，同時+3生命值",                 "精良", "加基森風雲");
        insert(73012, "無照藥劑師",           Common.levelThree, Common.warlock, "惡魔,每當你召喚手下，對你的英雄造成5點傷害",                       "史詩", "加基森風雲");
        insert(73013, "窸窣的掘洞蟲",         Common.levelThree, Common.warlock, "野獸,戰吼：發現一個法術。對你的英雄造成等同此法術消耗的傷害",      "史詩", "安戈洛歷險記");
        insert(73014, "不懷好意",             Common.levelThree, Common.warlock, "將一個友方手下改為敵方手下",                                       "史詩", "冰封王座");
        insert(73015, "嚎叫魔犬",             Common.levelThree, Common.warlock, "惡魔,每當此手下受到傷害，隨機捨棄一張牌",                          "普通", "冰封王座");
        insert(73016, "非自願獻祭",           Common.levelThree, Common.warlock, "選擇一個友方手下。摧毀它以及一個隨機敵方手下",                     "精良", "冰封王座");

        //Level4
        insert(74001, "地獄烈焰",             Common.levelFour, Common.warlock, "對全部角色造成3點傷害",                                             "基本", "基本");
        insert(74002, "深淵領主",             Common.levelFour, Common.warlock, "惡魔,戰吼：對你的英雄造成5點傷害",                                  "史詩", "經典");
        insert(74003, "暗影之焰",             Common.levelFour, Common.warlock, "摧毀一個友方手下，使全部敵方手下受到等同其攻擊力的傷害",            "精良", "經典");
        insert(74004, "召喚傳送門",           Common.levelFour, Common.warlock, "你的手下消耗減少(2)點，但不會低於(1)點",                            "普通", "經典");
        insert(74005, "虛無呼喚者",           Common.levelFour, Common.warlock, "惡魔,死亡之聲：將你手中的一個隨機惡魔放到戰場",                     "普通", "納克薩瑪斯");
        insert(74006, "惡魔火砲",             Common.levelFour, Common.warlock, "機械,在你的回合結束時，對一個非機械的手下造成2點傷害",              "精良", "哥哥打地地");
        insert(74007, "小鬼爆破",             Common.levelFour, Common.warlock, "對一個手下造成2到4點傷害。每造成一點傷害，便召喚一個1/1的小鬼",     "精良", "哥哥打地地");
        insert(74008, "恐懼戰馬",             Common.levelFour, Common.warlock, "惡魔,死亡之聲：在回合結束時，召喚一匹恐懼戰馬",                     "史詩", "銀白聯賽");
        insert(74009, "賈拉克瑟斯之拳",       Common.levelFour, Common.warlock, "每當你打出或捨棄這張牌，對一個隨機敵人造成4點傷害",                 "精良", "銀白聯賽");
        insert(74010, "晶爆藥水",             Common.levelFour, Common.warlock, "摧毀一個 手下和1顆你的 法力水晶",                                   "普通", "加基森風雲");
        insert(74011, "編晶師",               Common.levelFour, Common.warlock, "戰吼：賦予你的 惡魔+1/+1",                                          "普通", "加基森風雲");
        insert(74012, "海魔釘刺者",           Common.levelFour, Common.warlock, "魚人,戰吼：你在本回合打出的下一個魚人會消耗生命值而非法力",         "精良", "加基森風雲");
        insert(74013, "飢餓的翼手龍",         Common.levelFour, Common.warlock, "野獸,戰吼：摧毀一個友方手下以演化兩次",                             "普通", "安戈洛歷險記");
        insert(74014, "拉卡利惡魔犬",         Common.levelFour, Common.warlock, "惡魔,嘲諷 戰吼：隨機捨棄 兩張牌",                                   "普通", "安戈洛歷險記");

        //Level5
        insert(75001, "末日災厄",             Common.levelFive, Common.warlock, "對一個角色 造成2點傷害。若能殺死它，隨機召喚一個惡魔",              "史詩", "經典");
        insert(75002, "末日守衛",             Common.levelFive, Common.warlock, "惡魔,衝鋒。戰吼：隨機捨棄兩張牌",                                   "精良", "經典");
        insert(75003, "惡魔之心",             Common.levelFive, Common.warlock, "對一個手下造成5點傷害。若目標是友方惡魔，賦予它+5/+5",              "史詩", "哥哥打地地");
        insert(75004, "漂浮看守者",           Common.levelFive, Common.warlock, "惡魔, 每當你的英雄在你的回合中受到傷害，獲得+2/+2",                 "普通", "哥哥打地地");
        insert(75005, "靈魂接待員",           Common.levelFive, Common.warlock, "每當友方手下死亡，無論你的克蘇恩位於何處，賦予它+1/+1",             "普通", "古神碎碎念");
        insert(75006, "卡啦卡啦贊！",         Common.levelFive, Common.warlock, "召喚1/1的蠟燭、2/2的掃帚和3/3的茶壺",                               "普通", "夜夜卡拉贊");
        insert(75007, "焦油潛伏者",           Common.levelFive, Common.warlock, "元素,嘲諷 在對手的回合獲得 +3攻擊力",                               "普通", "安戈洛歷險記");
        insert(75008, "開飯時刻",             Common.levelFive, Common.warlock, "對一個手下造成3點傷害。召喚 三個1/1的翼手龍",                       "精良", "安戈洛歷險記");
        insert(75009, "卑劣的驚懼領主",       Common.levelFive, Common.warlock, "惡魔,在你的回合結束 時，對全部敵方手下 造成1點傷害",                "精良", "冰封王座");
        insert(75010, "血腥女王菈娜薩爾",     Common.levelFive, Common.warlock, "生命竊取 本賽局中你捨棄的 每張卡牌使其獲得 +1攻擊力",               "傳說", "冰封王座");

        //Level6
        insert(76001, "恐怖的煉獄火",         Common.levelSix, Common.warlock, "惡魔,戰吼：對全部其他角色造成1點傷害",                               "基本", "基本");
        insert(76002, "靈魂虹吸",             Common.levelSix, Common.warlock, "摧毀一個手下。使你的英雄恢復3點生命值",                              "精良", "經典");
        insert(76003, "憎惡魔像",             Common.levelSix, Common.warlock, "機械,每個回合結束時，若此手下是你唯一在場上的手下，摧毀它",          "史詩", "哥哥打地地");
        insert(76004, "虛無粉碎者",           Common.levelSix, Common.warlock, "惡魔,激勵：雙方玩家各隨機摧毀一個手下",                              "精良", "銀白聯賽");
        insert(76005, "黑暗交易",             Common.levelSix, Common.warlock, "隨機摧毀2個敵方手下，隨機捨棄2張牌",                                 "史詩", "銀白聯賽");
        insert(76006, "威爾弗雷德‧菲斯巴恩",  Common.levelSix, Common.warlock, "使用你英雄能力抽到的牌消耗為(0)",                                    "傳說", "銀白聯賽");
        insert(76007, "魔焰藥水",             Common.levelSix, Common.warlock, "對全部角色 造成5點傷害",                                             "精良", "加基森風雲");
        insert(76008, "黑謀會惡魔販子",       Common.levelSix, Common.warlock, "在你的回合 結束時，放一個隨機惡魔到你的手中",                        "史詩", "加基森風雲");
        insert(76009, "殘暴的恐龍術師",       Common.levelSix, Common.warlock, "死亡之聲：召喚你在本賽局中捨棄的一個隨機手下",                       "精良", "安戈洛歷險記");

        //Level7
        insert(77001, "可怕的末日守衛",       Common.levelSevenPlus, Common.warlock, "惡魔",                                                         "普通", "銀白聯賽");
        insert(77002, "丘加利",               Common.levelSevenPlus, Common.warlock, "戰吼：本回合施放 的下一個法術會消耗生命值而非法力",            "傳說", "古神碎碎念");
        insert(77003, "暴虐冥淵火",           Common.levelSevenPlus, Common.warlock, "惡魔,戰吼：對全部其他 角色造成3點傷害",                        "普通", "加基森風雲");

        //Level8
        insert(78001, "扭曲虛空",             Common.levelSevenPlus, Common.warlock, "摧毀全部手下",                                                 "史詩", "經典");

        //Level9
        insert(79001, "賈拉克瑟斯領主",       Common.levelSevenPlus, Common.warlock, "惡魔,戰吼：摧毀你的英雄並以賈拉克瑟斯領主替換之",              "傳說", "經典");
        insert(79002, "瑪爾加尼斯",           Common.levelSevenPlus, Common.warlock, "惡魔,你的其他惡魔擁有+2/+2。 你的英雄免疫",                    "傳說", "哥哥打地地");
        insert(79003, "『無縛者』庫魯爾",     Common.levelSevenPlus, Common.warlock, "惡魔,戰吼：若你牌堆中 沒有重複的卡牌，召喚 你手中的所有惡魔",  "傳說", "加基森風雲");

        //Level10
        insert(710001, "末日來臨！",           Common.levelSevenPlus, Common.warlock, "摧毀全部手下。每摧毀一個手下可讓你抽一張牌",                   "史詩", "加基森風雲");
        insert(710002, "『奪血者』古爾丹",     Common.levelSevenPlus, Common.warlock, "英雄,戰吼：召喚本賽局中死亡的所有友方惡魔",                    "傳說", "冰封王座");
    }


    public void insert(int id, String name, int level, int job, String description, String type, String series)
    {
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
