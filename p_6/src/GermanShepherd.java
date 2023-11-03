public class GermanShepherd extends Dog{
    public GermanShepherd(int age) {
        super("German Shepherd", age);
    }

    @Override
    public void bark() {
        System.out.println("German Shepherd is barking");
    }
}
