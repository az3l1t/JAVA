import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Задание 1
final class Drink implements Item {
    private static final double DEFAULT_COST = 0.0;
    private static final String DEFAULT_NAME = "";
    private static final String DEFAULT_DESCRIPTION = "";

    private final double cost;
    private final String name;
    private final String description;

    Drink(String name, String description) {
        this(DEFAULT_COST, name, description);
    }

    Drink(double cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

// Задание 2
final class Dish implements Item {
    private static final double DEFAULT_COST = 0.0;
    private static final String DEFAULT_NAME = "";
    private static final String DEFAULT_DESCRIPTION = "";

    private final double cost;
    private final String name;
    private final String description;

    Dish(String name, String description) {
        this(DEFAULT_COST, name, description);
    }

    Dish(double cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

// Задание 3
class InternetOrder {
    private static class ListNode {
        Item item;
        ListNode next;
        ListNode prev;

        ListNode(Item item) {
            this.item = item;
        }
    }

    private ListNode head;
    private int size;

    InternetOrder() {
        head = new ListNode(null); // Создаем только голову списка
        head.next = head;
        head.prev = head;
        size = 0;
    }

    InternetOrder(Item[] items) {
        this();
        addItems(items);
    }

    private void addItems(Item[] items) {
        for (Item item : items) {
            addItem(item);
        }
    }

    public boolean addItem(Item item) {
        if (item == null) {
            return false;
        }

        ListNode newNode = new ListNode(item);
        newNode.next = head;
        newNode.prev = head.prev;
        head.prev.next = newNode;
        head.prev = newNode;
        size++;

        return true;
    }

    public boolean removeItem(String itemName) {
        if (itemName == null) {
            return false;
        }

        ListNode current = head.prev;
        while (current != head) {
            if (current.item.getName().equals(itemName)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                size--;
                return true;
            }
            current = current.prev;
        }

        return false;
    }

    public int removeAll(String itemName) {
        if (itemName == null) {
            return 0;
        }

        int count = 0;
        ListNode current = head.prev;
        while (current != head) {
            if (current.item.getName().equals(itemName)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                count++;
                size--;
            }
            current = current.prev;
        }

        return count;
    }

    public int getTotalItemCount() {
        return size;
    }

    public Item[] getItems() {
        Item[] items = new Item[size];
        ListNode current = head.next;
        int index = 0;
        while (current != head) {
            items[index] = current.item;
            index++;
            current = current.next;
        }
        return items;
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        ListNode current = head.next;
        while (current != head) {
            totalCost += current.item.getCost();
            current = current.next;
        }
        return totalCost;
    }

    public int getItemCount(String itemName) {
        if (itemName == null) {
            return 0;
        }

        int count = 0;
        ListNode current = head.prev;
        while (current != head) {
            if (current.item.getName().equals(itemName)) {
                count++;
            }
            current = current.prev;
        }

        return count;
    }

    public String[] getItemNames() {
        List<String> uniqueNames = new ArrayList<>();
        ListNode current = head.next;
        while (current != head) {
            String itemName = current.item.getName();
            if (!uniqueNames.contains(itemName)) {
                uniqueNames.add(itemName);
            }
            current = current.next;
        }
        return uniqueNames.toArray(new String[0]);
    }

    public Item[] getSortedItemsByPrice() {
        Item[] items = getItems();
        Arrays.sort(items, (item1, item2) -> Double.compare(item2.getCost(), item1.getCost()));
        return items;
    }
}

interface Item {
    double getCost();
    String getName();
    String getDescription();
}

public class Main {
    public static void main(String[] args) {
        Drink coffee = new Drink(2.0, "Coffee", "Hot beverage made from roasted coffee beans");
        Drink tea = new Drink(1.5, "Tea", "Hot or cold infused beverage made from the Camellia sinensis leaves");
        Dish pizza = new Dish(8.5, "Pizza", "Flatbread topped with various ingredients");
        Dish salad = new Dish(6.0, "Salad", "Mixture of vegetables, often with added toppings and dressings");

        InternetOrder order = new InternetOrder(new Item[] {coffee, tea, pizza, salad});

        System.out.println("Total items in order: " + order.getTotalItemCount());
        System.out.println("Total cost of order: $" + order.getTotalCost());

        System.out.println("Item count of Coffee: " + order.getItemCount("Coffee"));
        System.out.println("Item count of Tea: " + order.getItemCount("Tea"));

        System.out.println("Item names in order:");
        String[] itemNames = order.getItemNames();
        for (String itemName : itemNames) {
            System.out.println(itemName);
        }

        System.out.println("Sorted items by price:");
        Item[] sortedItems = order.getSortedItemsByPrice();
        for (Item item : sortedItems) {
            System.out.println(item.getName() + " - $" + item.getCost());
        }
    }
}
