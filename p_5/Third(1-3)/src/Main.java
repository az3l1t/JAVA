public class Main {
    public static void main(String[] args) {
        System.out.printf("Start of prog. ");

        Circle circ = new Circle();
        circ.color="red";
        circ.filled=true;
        circ.radius=2;
        System.out.println(circ.getPer());

        Rectangle rect=new Rectangle();
        rect.width=3;
        rect.length=5;
        rect.filled=false;
        rect.color="red";
        System.out.println(rect.getColor());

        Square sq = new Square();
        sq.side=3;
        sq.setSide(2.6);
        System.out.println(sq.getPer());

    }
}