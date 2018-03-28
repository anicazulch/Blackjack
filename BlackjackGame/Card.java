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
        return this.cardSuit;
    }
    
    public int getValue(){
        return this.cardValue;
    }
    
    public String getRank(){
        return this.cardRank;
    }
    
    public void setValue(Card c, int newValue){
        c.cardValue = newValue;
    }
    
    public void setSuit(Card c, String newSuit){
        c.cardSuit = newSuit;
    }
}
