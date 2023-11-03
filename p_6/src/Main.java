// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate("Ceramic", "White", 10);
        plate.use();

        Cup cup = new Cup("Glass", "Blue", 250);
        cup.use();
        System.out.println("----------------------");

        Labrador labrador = new Labrador(5);
        labrador.bark();
        GermanShepherd germanShepherd = new GermanShepherd(3);
        germanShepherd.bark();

        System.out.println("----------------------");
        Chair chair = new Chair("Wood", "Brown", 4);
        chair.ToString();
        System.out.println("Number of legs: " + chair.getNumberOfLegs());

        Table table = new Table("Glass", "White", 6);
        table.ToString();
        System.out.println("Number of seats: " + table.getNumberOfSeats());

        Sofa sofa = new Sofa("Leather", "Black", 3);
        sofa.ToString();
        System.out.println("Number of cushions: " + sofa.getNumberOfCushions());
    }
}