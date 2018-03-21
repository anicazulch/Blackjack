import java.util.ArrayList;
import java.util.Scanner;
public class Player extends Game
{
    // instance variables
    private String playerName;
    private int amountOfMoney;
    private int handTotal;
    private ArrayList<Card> hand = new ArrayList<Card>();

    /**
     * Constructor for objects of class Player
     */
    public Player(String play, int money, int total)
    {
        // initialise instance variables
        this.playerName = play;
        this.amountOfMoney = money;
        this.handTotal = total;;
    }

    
    public void bet()
    {

    }
    public void hit(){
    }
    public void stay(){
    }
    public void getHandTotal(){
    }
    public String toString(){
        return "Your hand total is: " + this.handTotal;
    }
}
