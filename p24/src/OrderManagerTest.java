public class OrderManagerTest { //test2
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();
        Order order1 = new RestaurantOrder();
        Order order2 = new RestaurantOrder();

        Item item1 = new MenuItem("Item 1", 10.5);
        Item item2 = new MenuItem("Item 2", 15.75);
        Item item3 = new MenuItem("Item 3", 20.0);

        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item2);
        order2.addItem(item3);

        orderManager.addOrder("Address 1", order1);
        orderManager.addOrder("Address 2", order2);

        Order retrievedOrder = orderManager.getOrder("Address 1");
        if (retrievedOrder != null) {
            System.out.println("Total count of Order 1: " + retrievedOrder.getTotalCount());
        }

        orderManager.addItemToOrder("Address 1", item3);
        retrievedOrder = orderManager.getOrder("Address 1");
        if (retrievedOrder != null) {
            System.out.println("Total count of Order 1 after adding item 3: " + retrievedOrder.getTotalCount());
        }

        Order[] internetOrders = orderManager.getInternetOrders();
        System.out.println("Total internet orders: " + internetOrders.length);

        double totalPrice = orderManager.getTotalPriceOfInternetOrders();
        System.out.println("Total price of internet orders: " + totalPrice);

        int totalItemCount = orderManager.getTotalItemCountOfDish("Item 2");
        System.out.println("Total count of Item 2 in all orders: " + totalItemCount);

        orderManager.removeOrder("Address 1");
        retrievedOrder = orderManager.getOrder("Address 1");
        if (retrievedOrder == null) {
            System.out.println("Order 1 removed successfully");
        }
    }
}
