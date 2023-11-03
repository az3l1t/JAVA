package LWS;
public class MovablePoint implements Interface {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public MovablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString(){
        return "x - "+this.x+", y - "+this.y+" xSpped - "+this.xSpeed+" ySpeed - "+this.ySpeed;
    }

    @Override
    public void moveUp() {
        this.y=y+1;
    }

    @Override
    public void moveDown() {
        this.x=x-1;
    }

    @Override
    public void moveLeft() {
        this.y=y-1;
    }

    @Override
    public void moveRight() {
        this.x=x+1;
    }
}
