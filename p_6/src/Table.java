public class Table extends Furniture{
    private int numberOfSeats;

    public Table(String material, String color, int numberOfSeats) {
        super(material, color);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void ToString() {
        System.out.println("This is a table made of " + getMaterial() + " with " + getColor() + " color and " + numberOfSeats + " seats.");
    }
}
