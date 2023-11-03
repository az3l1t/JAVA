import java.math.*;
public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        this.color = "blue";
        this.filled=false;
        width=1;
        length=1;
    }
    public Rectangle(double width, double length){
        this.color = "blue";
        this.filled=false;
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.color = color;
        this.filled=filled;
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }


    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPer() {
        return 2*width+2*length;
    }

    @Override
    public String toString() {
        return "Shape: Rectangle, Length: " + this.length + ", width: "+ this.width;
    }
}
