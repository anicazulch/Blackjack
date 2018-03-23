import java.util.Random;
import java.util.ArrayList;
public class Deck extends Game
{
    private ArrayList<Card> deck;
    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        // initialise instance variables
        deck = new ArrayList<Card>();
        initializeDeck();
        shuffleDeck();
    }
    
    public void initializeDeck(){
        String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
        String [] ranks = {"Ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        
        for (String s : suits){
            int value = 1;
            for(String r : ranks) {
                Card temp = new Card(value, s, r);
                value++;
                deck.add(temp);
            }
        }
    }
    
    public void printDeck(){
        for (Card c : deck){
            System.out.println(c);
        }
    }
    
    public void shuffleDeck()
    {
        
    }
    
    public Card deal(){
        return null;
    }
}
