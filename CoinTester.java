/*
Creates instances of the Coin class and tesets their attributes and behaviors
*/

public class CoinTester{
  public static void main(String[] args){
    Coin myCoin = new Coin();
    Coin yourCoin = new Coin();

    System.out.println("My coin is "+myCoin);
    System.out.println("Your coin is "+yourCoin.toString());

    double headCounter = 0;
    double tailCounter = 0;
    for (int i = 1; i < 11; i++){
      Coin testCoin = new Coin();
      System.out.println(i+" flip = "+ testCoin.toString());
      if (testCoin.isHeads()){
        headCounter++;
      }
      else {
        tailCounter++;
      }
    }
    System.out.println("Number of heads flipped = "+(headCounter/10)*100+"%");
    System.out.println("Number of tails flipped = "+(tailCounter/10)*100+"%");
  }
}
