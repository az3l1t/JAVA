public class Circle {
    public double radius;
    public String color;
    public boolean filled;
    public Circle(){
        this.color="blue";
        this.filled=false;
        radius=1;
    }

    public Circle(double radius){
        this.color="blue";
        this.filled=false;
        this.radius=radius;
    }

    public Circle(double radius,String color){
        this.color=color;
        this.filled=false;
        this.radius=radius;
    }

    public Circle(double radius,String color,boolean filled){
        this.color=color;
        this.filled=filled;
        this.radius=radius;
    }

    public double getRadius() {return radius; }
    public boolean getFilled() {return filled; }
    public String getColor() {return color; }
    public void setRaduis(double radius) {this.radius=radius; }
    public void setFilled(boolean filled) {this.filled=filled; }
    public void setColor(String color) {this.color=color; }

    public String toString() {
        return "Shape: circle, radius: " + this.radius + ", color: "+ this.color;
    }
}
