public class Driver{
  public static void main(String[] args){
    Car car1 = new Car("Toyota","Previa",16.0,20.0);
    Car car2 = new Car("Mercedes","C230",20.0,15.0);
    Car car3 = new Car("Honda","Odyssey",22.0,25.0);

    System.out.println(car1+"\n");
    System.out.println(car2+"\n");
    System.out.println(car3+"\n");

    car1.drive(100.0);
    car2.drive(75.0);
    car3.drive(66.0);

    car1.addFuel(1.2);
    car2.addFuel(0.5);
    car3.addFuel(2.0);

    System.out.println("Car status after car is driven:");
    System.out.println("\n"+car1+"\n");
    System.out.println(car2+"\n");
    System.out.println(car3+"\n");
  }
}
