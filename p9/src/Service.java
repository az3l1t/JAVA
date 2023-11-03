public class Service implements Priceable {
    private String name;
    private double hourlyRate;
    private int hours;

    public Service(String name, double hourlyRate, int hours) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double getPrice() {
        return hourlyRate * hours;
    }

    // Другие методы и поля класса Service
}
