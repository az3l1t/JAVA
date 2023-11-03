public abstract class Furniture {
    private String material;
    private String color;

    public Furniture(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public abstract void ToString();
}
