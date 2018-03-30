import java.util.ArrayList;
import java.util.Scanner;
public class Game
{
    Player[] players;
    Player p = new Player("Player 1", 500, 0);
    Player d = new Dealer();
    
    public Game()
    {
       players = new Player[2];
       p = players[0];
       d = players[1];
    }

    public void playGame()
    
    {
        p.bet();
        while (d.getHandTotal() <= 22 && p.getHandTotal() <= 22){
            p.playerTurn();
            d.dealerTurn();
        }
        determineWinner();
        endGame();
    }
    
    public String determineWinner(){
        if (p.getHandTotal() > d.getHandTotal() && d.getHandTotal() <= 21){
            return "You won";
            p.winMoney();
            d.loseMoney();
        }
        else{
            d.winMoney();
            return "The dealer won";
        }
    }
    
    public void endGame(){
        System.exit(0);
    }
}
