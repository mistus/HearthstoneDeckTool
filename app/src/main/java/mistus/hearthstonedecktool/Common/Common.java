package mistus.hearthstonedecktool.Common;

public class Common {
    public static final int general = 0;
    public static final int warrior = 1;
    public static final int shaman = 2;
    public static final int rogue = 3;
    public static final int paladin = 4;
    public static final int hunter = 5;
    public static final int druid = 6;
    public static final int warlock = 7;
    public static final int mage = 8;
    public static final int priest = 9;

    //TODO add card level
    public static final int levelZero = 0;
    public static final int levelOne = 1;
    public static final int levelTwo = 2;
    public static final int levelThree = 3;
    public static final int levelFour = 4;
    public static final int levelFive = 5;
    public static final int levelSix = 6;
    public static final int levelSeven = 7;

    //Type
    public static final String typeOpen = "開放";
    public static final String typeStandard = "標準";

    //Series
    public static final String[] openSeries =
            {"哥哥打地地","銀白聯賽","納克薩瑪斯","勇闖黑石山","探險者協會","名人堂","獎勵","促銷"};
    public static final String[] standardSeries =
            {"基本","經典","古神碎碎念","加基森風雲","安戈洛歷險記","夜夜卡拉贊"};


    public int getCareerNameId(String careerName){
        switch (careerName){
            case "戰士":
                return Common.warrior;
            case "薩滿":
                return Common.shaman;
            case "盜賊":
                return Common.rogue;
            case "聖騎士":
                return Common.paladin;
            case "獵人":
                return Common.hunter;
            case "德魯伊":
                return Common.druid;
            case "術士":
                return Common.warlock;
            case "法師":
                return Common.mage;
            case "牧師":
                return Common.priest;
            default:
                return 0;
        }
    }


    public static String getCareerNameById(int careerId){
        switch (careerId){
            case Common.warrior:
                return "戰士";
            case Common.shaman:
                return "薩滿";
            case Common.rogue:
                return "盜賊";
            case Common.paladin:
                return "聖騎士";
            case Common.hunter:
                return "獵人";
            case Common.druid:
                return "德魯伊";
            case Common.warlock:
                return "術士";
            case Common.mage:
                return "法師";
            case Common.priest:
                return "牧師";
            default:
                return "普通";
        }
    }
}
