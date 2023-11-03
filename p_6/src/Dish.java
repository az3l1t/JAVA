public abstract class Dish {
    private String material;
    private String color;

    public Dish(String material,String color){
        this.material=material;
        this.color=color;
    }

    public abstract void use();
}
