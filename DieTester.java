public class DieTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the dice simulator.");

        Die d1 = new Die();
        Die d2 = new Die();

        System.out.println("1st " + d1.toString());
        System.out.println("2nd " + d2.toString());

        d1.roll();
        d2.roll();

        System.out.println("1st " + d1.toString());
        System.out.println("2nd " + d2.toString());
    }
}
