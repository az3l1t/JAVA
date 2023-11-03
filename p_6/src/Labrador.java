public class Labrador extends Dog{
    public Labrador(int age) {
        super("Labrador", age);
    }

    @Override
    public void bark() {
        System.out.println("Labrador is barking");
    }
}
