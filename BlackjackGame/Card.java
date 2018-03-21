public class Card extends Deck
{
    // instance variables
    private int cardValue;
    private String cardSuit;
    private String cardRank;
    
    /**
     * Constructor for objects of class Card
     */
    public Card(int value, String suit, String rank)
    {
        // initialise instance variables
        this.cardValue = value;
        this.cardSuit = suit;
        this.cardRank = rank;
    }
    
    public String getSuit()
    {
        return null;
    }
    public int getValue(){
        return 0;
    }
    public String getRank(){
        return null;
    }
}
