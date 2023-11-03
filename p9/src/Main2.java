public class Main2 {
    public static void main(String[] args) {
        Product product = new Product("Телефон", 999.99);
        System.out.println("Цена продукта: " + product.getPrice());

        Service service = new Service("Услуга", 50.0, 3);
        System.out.println("Цена услуги: " + service.getPrice());
    }
}
