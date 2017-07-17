package mistus.hearthstonedecktool.CardView;

public class Deck {

    private int deckId;
    private String deckName;
    private int job;
    private boolean isStandardType;
    private int Quantity;

    final int warrior = 0;
    final int shaman = 1;
    final int rogue = 2;
    final int paladin = 3;
    final int hunter = 4;
    final int druid = 5;
    final int warlock = 6;
    final int mage = 7;
    final int priest = 8;

    public static final Deck[] decks ={
            new Deck( 1, "FirstDeck", '0', false, 30),
            new Deck( 2, "SecondDeck", '0', false, 30)
    };

    private Deck(int deckId, String deckName, int job, boolean isStandardType, int Quantity ){
        this.deckId = deckId;
        this.deckName = deckName;
        this.job =job;
        this.isStandardType = isStandardType;
        this.Quantity = Quantity;
    }

    public int getQuantity() {
        return Quantity;
    }

    public String getDeckName() {
        return deckName;
    }

    public int getJob() {
        return job;
    }

    public boolean isStandardType() {
        return isStandardType;
    }

    public int getDeckId() {
        return deckId;
    }
}
