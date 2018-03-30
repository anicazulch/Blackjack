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

    public void playerTurn(){
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
        System.out.println("Place bet (you have $500)");
        int betMoney = scan.nextInt();
        money -= betMoney;
        System.out.println("You bet $" + betMoney + " and your total balance is $" + money);
    }
    
    public void hit(){
        hand.add(deck.deal());
        System.out.println(hand);
    }
    
    public void stay(){
    }
    
    public double winMoney(){
        return money += (2* betMoney);
    }
    
    public double loseMoney(){
        return money -= betMoney;
    }
    
    
    
    public int getHandTotal(){
        for (Card c : hand){
            handTotal += c.getValue();
        }
        return handTotal;
    }
    
    public String toString(){
        return "Your hand total is: " + this.handTotal;
    }
}
