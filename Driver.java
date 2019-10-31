public class Driver{
  public static void main(String[] args){
    Car car = new Car("Toyota","Previa",16.0,19.8);

    System.out.println(car.toString());
    

    car.setFuel(18.2);
  }
}
