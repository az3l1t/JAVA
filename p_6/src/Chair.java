public class Chair extends Furniture{
    private int numberOfLegs;

    public Chair(String material, String color, int numberOfLegs) {
        super(material, color);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public void ToString() {
        System.out.println("This is a chair made of " + getMaterial() + " with " + getColor() + " color and " + numberOfLegs + " legs.");
    }
}
