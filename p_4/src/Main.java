// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setColor("Red");
        c1.setFilled(true);
        c1.setRaduis(2);
        System.out.println(c1.getRadius());
        System.out.println(c1.getFilled());
        System.out.println(c1.getColor());
        System.out.println(c1.toString());

        System.out.println("--------------------------");

        Head head = new Head();
        Leg leftLeg = new Leg();
        Leg rightLeg = new Leg();
        Hand leftHand = new Hand();
        Hand rightHand = new Hand();

        Human human = new Human(head, leftLeg, rightLeg, leftHand, rightHand);
        human.performAction("Walking");

        System.out.println("--------------------------");
        Book b1=new Book();
        b1.setTheme("Romance");
        b1.setWriter("Dost-vksy");
        System.out.println(b1.getTheme());
        System.out.println(b1.getWriter());
    }
}