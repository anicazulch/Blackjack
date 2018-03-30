public class Dealer extends Player
{
    
    /**
     * Constructor for objects of class Dealer
     */
    public Dealer()
    {
        // initialise instance variables
        super("Dealer", 500, -1);
    }

    public void dealerTurn(){
       if(handTotal < 17){
          hit();
       }
       if (handTotal > 17){
          stay();
        }
    }
    
    public double winMoney(){
        money += betMoney;
    }
    
    public void hit(){
    }
    
    public void stay(){
    }
}
