public class Sofa extends Furniture{
    private int numberOfCushions;

    public Sofa(String material, String color, int numberOfCushions) {
        super(material, color);
        this.numberOfCushions = numberOfCushions;
    }

    public int getNumberOfCushions() {
        return numberOfCushions;
    }

    @Override
    public void ToString() {
        System.out.println("This is a sofa made of " + getMaterial() + " with " + getColor() + " color and " + numberOfCushions + " cushions.");
    }
}
