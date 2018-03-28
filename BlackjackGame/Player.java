import java.util.ArrayList;
import java.util.Scanner;
public class Player extends Game
{
    // instance variables
    private String playerName;
    private double money;
    private int handTotal;
    private int betMoney;
    private ArrayList<Card> hand = new ArrayList<Card>();

    Scanner scan = new Scanner(System.in);
    /**
     * Constructor for objects of class Player
     */
    public Player(String name, double mn, int hTotal)
    {
        // initialise instance variables
        this.playerName = name;
        this.money = mn;
        this.handTotal = hTotal;
    }

    public void turn(){
        System.out.println("Would you like to hit or stay? (1 = hit and 2 = stay");
        int playerTurn = scan.nextInt();
        if (playerTurn == 1){
            hit();
        }
        if (playerTurn == 2){
            stay();
        }
    }
    
    public void bet()
    {
        System.out.println("Place bet");
        int betMoney = scan.nextInt();
        money -= betMoney;
        System.out.println("You bet $" + betMoney + " and your total balance is $" + money);
    }
    
    public void hit(){
        Card c = deck.deal();
    }
    
    public void stay(){
    }
    
    public void getHandTotal(){
        for (Card c : hand){
            handTotal += c.getValue();
        }
        return handTotal;
    }
    
    public String toString(){
        return "Your hand total is: " + this.handTotal;
    }
}
