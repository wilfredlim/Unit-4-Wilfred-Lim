/*
  This is the Coin class
  It is the blueprint for how to make a coin object
*/
public class Coin{
  //These are the declarations for the attributes (instance variables) of a coin.
  private int face;

  private final int HEADS = 0; //Constants defining heads and tails
  private final int TAILS = 1;

  /*
    The Coin constructor that defines what happens when a Coin object is made.
    When a new coin is made it gets flipped.
  */
  public Coin(){
    flip();
  }

  /*
  This is the section of the class containing the methods (behaviors) of a Coin.
  */

  /*
   The accessor method for the face vairable (a getter)
  */
  public int getFace(){
    return face;
  }

  /*
  The mutator method for the face vairable (a setter)
  */
  public void setFace(int newFace){
    face = newFace
  }

  /*
  The flip method assigns a randomly chosen value to the face of the Coin.
  */
  public void flip(){
    face = (int)(Math.random() * 2);
  }

  /*
    The isHeads method tellsus if the coin's face is heads or not.
  */
  public boolean isHeads(){
    return (face == HEADS);
  }

  /*
    Prints out information about the current state of the coin.
  */
  public String toString(){
    String result = "";
    if (face == HEADS){
      result = "HEADS";
    }
    else {
      result = "TAILS";
    }
    return result;
  }
}
