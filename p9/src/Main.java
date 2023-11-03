public class Main {
    public static void main(String[] args) {
        Nameable planet = new Planet("Earth");
        Nameable car = new Car("Toyota");
        Nameable animal = new Animal("Dog");

        System.out.println(planet.getName()); // Выводит "Earth"
        System.out.println(car.getName()); // Выводит "Toyota"
        System.out.println(animal.getName()); // Выводит "Dog"
    }
}