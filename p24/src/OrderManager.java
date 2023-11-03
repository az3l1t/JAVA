import java.util.HashMap;
import java.util.Map;


public class OrderManager { //2


    private Map<String, Order> orders;

    public OrderManager() {
        orders = new HashMap<>();
    }

    public void addOrder(String address, Order order) {
        orders.put(address, order);
    }

    public Order getOrder(String address) {
        return orders.get(address);
    }

    public void removeOrder(String address) {
        orders.remove(address);
    }

    public void addItemToOrder(String address, Item item) {
        Order order = orders.get(address);
        if (order != null) {
            order.addItem(item);
        }
    }

    public Order[] getInternetOrders() {
        return orders.values().toArray(new Order[0]);
    }

    public double getTotalPriceOfInternetOrders() {
        double totalPrice = 0;
        for (Order order : orders.values()) {
            totalPrice += order.getTotalPrice();
        }
        return totalPrice;
    }

    public int getTotalItemCountOfDish(String dishName) {
        int totalCount = 0;
        for (Order order : orders.values()) {
            totalCount += order.getCount(dishName);
        }
        return totalCount;
    }
}
