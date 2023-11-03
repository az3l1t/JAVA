import java.math.*;
public class Circle extends Shape{
    protected double radius;
    public Circle(){
        this.color = "blue";
        this.filled=false;
        radius=1;
    }
    public Circle(double radius){
        this.filled=false;
        this.color="blue";
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPer() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: " + this.radius + ", color: "+ this.color;
    }
}
