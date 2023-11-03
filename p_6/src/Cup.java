public class Cup extends Dish{
    private int volume;

    public Cup(String material, String color, int volume){
        super(material, color);
        this.volume=volume;
    }
    @Override
    public void use() {
        System.out.println("Using cup with volume "+volume);
    }
}
