public class OrderTest { //test1
    public static void main(String[] args) {
        Order order = new RestaurantOrder();
        Item item1 = new MenuItem("Item 1", 10.5);
        Item item2 = new MenuItem("Item 2", 15.75);
        Item item3 = new MenuItem("Item 3", 20.0);

        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);

        System.out.println("Total count: " + order.getTotalCount());
        System.out.println("Total price: " + order.getTotalPrice());

        System.out.println("Items:");
        Item[] items = order.getItems();
        for (Item item : items) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }

        System.out.println("Count of Item 2: " + order.getCount("Item 2"));

        System.out.println("Ordered items:");
        String[] orderedItems = order.getOrderedItems();
        for (String item : orderedItems) {
            System.out.println(item);
        }

        System.out.println("Sorted items:");
        Item[] sortedItems = order.getSortedItems();
        for (Item item : sortedItems) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }

        order.removeItem("Item 1");
        System.out.println("Total count after removing Item 1: " + order.getTotalCount());

        int removedCount = order.removeAll("Item 2");
        System.out.println("Total count after removing all Item 2: " + order.getTotalCount());
        System.out.println("Number of removed items: " + removedCount);
    }
}
