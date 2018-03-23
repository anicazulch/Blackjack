import java.util.ArrayList;
import java.util.Scanner;
public class Player extends Game
{
    // instance variables
    private String playerName;
    private double amountOfMoney;
    private int handTotal;
    private ArrayList<Card> hand = new ArrayList<Card>();

    Scanner scan = new Scanner(System.in);
    /**
     * Constructor for objects of class Player
     */
    public Player(String name, double money)
    {
        // initialise instance variables
        this.playerName = name;
        this.amountOfMoney = money;
   
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
        System.out.println("You bet $" + betMoney + " and your total balance is $" + (double)(amountOfMoney - betMoney));
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
