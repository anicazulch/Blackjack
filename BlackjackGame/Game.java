import java.util.ArrayList;
public class Game
{
    // instance variables
    private int x;
    private ArrayList<Player> players;
    Player p = new Player("Player", 0);
    Dealer d = new Dealer();
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        players = new ArrayList<Player>();
        
    }

    public void playGame()
    {
        while (d.getValue() <= 22 && p.getValue() <= 22){
            d.dealerTurn();
            p.playerTurn();
        }
        determineWinner();
        endGame();
    }
    
    public String determineWinner(){
        if (p.getHandTotal() > d.getHandTotal() && p.getHandTotal() <= 21){
            return "You won";
            p.money += 2 * betMoney;
            d.money -= betMoney;
        }
        else{
            d.money += betMoney;
            return "The dealer won";
        }
    }
    
    public void endGame(){
        
    }
}
