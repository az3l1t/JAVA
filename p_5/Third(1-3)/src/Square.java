import java.math.*;
public class Square extends Rectangle{
    protected double side;
    public Square(){
        this.color="blue";
        this.filled=false;
        side=1;
    }
    public Square(double side){
        this.color="blue";
        this.filled=false;
        this.side=side;
    }
    public Square(double side, String color, boolean filled){
        this.color=color;
        this.filled=filled;
        this.side=side;
        this.side=side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side=side;
    }
    @Override
    public void setWidth(double side) {
        this.width=side;
    }

    @Override
    public void setLength(double side) {
        this.length=side;
    }

    @Override
    public String toString() {
        return "Shape: Square, Length: " + this.side + ", width: "+ this.side;
    }
}
