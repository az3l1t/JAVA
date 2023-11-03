public class Plate extends Dish {
    private int diameter;

    public Plate(String material,String color,int diameter){
        super(material, color);
        this.diameter=diameter;
    }

    @Override
    public void use() {
        System.out.println("Using plate with diameter " + diameter);
    }
}
