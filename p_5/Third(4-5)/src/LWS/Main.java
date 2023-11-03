package LWS;
public class Main {
    public static void main(String[] args) {
        Interface point = new MovablePoint(0, 0, 1, 1);
        point.moveUp();
        point.moveUp();
        point.moveRight();
        System.out.println(point);

        Interface circle = new MovableCircle(0, 0, 1, 1, 5);
        circle.moveDown();
        circle.moveLeft();
        System.out.println(circle);

        Interface rect = new MovableRectangle(0, 0, 0, 0, 1, 1);
        rect.moveDown();
        rect.moveRight();
        rect.moveRight();
        System.out.println(rect);
    }
}