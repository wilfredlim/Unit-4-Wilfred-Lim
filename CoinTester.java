/*
Creates instances of the Coin class and tesets their attributes and behaviors
*/

public class CoinTester{
  public static void main(String[] args){
    Coin myCoin = new Coin();
    Coin yourCoin = new Coin();

    System.out.println("My coin is "+myCoin.toString());
    System.out.println("Your coin is "+yourCoin.toString());

    int headCounter = 0;
    int tailCounter = 0;
    for (int i = 1; i < 6; i++){
      Coin testCoin = new Coin();
      System.out.println(i+" flip = "+ testCoin.toString());
      if (testCoin == HEADS){
        headCounter++;
      }
      if (testCoin == TAILS){
        tailCounter++;
      }
    }
    System.out.println("Number of heads flipped = "+headCounter);
    System.out.println("Number of tails flipped = "+tailCounter);
  }
}
