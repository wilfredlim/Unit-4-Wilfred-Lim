/*
Implement a class called Car with the following properties and behaviors.

A Car has a make (Toyota, Ford, BMW, etc.) and a model (Highlander, Fiesta, M3, etc.)
A Car has a certain fuel efficiency (measured in miles/gallon)
A Car has a certain amount of fuel in the gas tank (in gallons)
A Car can drive and fuel to the tank (driving a car changes the amount of fuel in the tank)

You must also include appropriate accessor and mutator methods for the Car class and a toString method that prints out a report on the current state of the car.

Create a client class with 3 instances of the car class. The client class should test all of the methods from the Car class and print out relevant information to prove the proper functionality of your Car class.

  This is the Car class
  It is the blueprint for how to make a car object
*/
public class Car{
  //These are the declarations for the attributes (instance variables) of a car.

  private String make;
  private String model;
  private double mpg; //miles per gallon
  private double tank; //in gallons
  private double fuel; //in gallons

  /*
    The Car constructor that defines what happens when a Car object is made.
    When a new caris made it gets .
  */
  public Car(String carMake, String carModel, Double carMpg, Double carTank){
    make = carMake;
    model = carModel;
    mpg = carMpg;
    tank = carTank;
    fuel = carTank;
  }

  /*
   The accessor method for the car characteristics (a getter)
  */
  public String getMake(){
    return make;
  }
  public String getModel(){
    return model;
  }
  public Double getMpg(){
    return mpg;
  }
  public Double getTank(){
    return tank;
  }
  public Double getFuel(){
    return fuel;
  }

  /*
  The mutator method for the filling up fuel (a setter)
  */

  public void setFuel(double newFuel){
    fuel = newFuel;
}

  /*
    Prints out information about the current state of the coin.
  */
    public String toString(){
    String result = "";
    result += make +" "+ model +"\n";
    result += "Gas Milage: "+mpg+" mpg " + "Tank Size: "+tank+" g\n";
    result += "Current Fuel: "+ fuel+ "g";
    return result;

  }
}
