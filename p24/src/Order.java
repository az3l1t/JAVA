import java.util.Arrays;

public interface Order {
    boolean addItem(Item item);
    boolean removeItem(String itemName);
    int removeAll(String itemName);
    int getTotalCount();
    Item[] getItems();
    double getTotalPrice();
    int getCount(String itemName);
    String[] getOrderedItems();
    Item[] getSortedItems();
}

class RestaurantOrder implements Order {
    private Item[] items;
    private int size;
    private final int MAX_SIZE = 100;

    public RestaurantOrder() {
        items = new Item[MAX_SIZE];
        size = 0;
    }

    @Override
    public boolean addItem(Item item) {
        if (size < MAX_SIZE) {
            items[size] = item;
            size++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean removeItem(String itemName) {
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[size - 1] = null;
                size--;
                count++;
            }
        }
        return count;
    }

    @Override
    public int getTotalCount() {
        return size;
    }

    @Override
    public Item[] getItems() {
        return Arrays.copyOf(items, size);
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < size; i++) {
            totalPrice += items[i].getPrice();
        }
        return totalPrice;
    }

    @Override
    public int getCount(String itemName) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String[] getOrderedItems() {
        String[] orderedItems = new String[size];
        for (int i = 0; i < size; i++) {
            orderedItems[i] = items[i].getName();
        }
        return orderedItems;
    }

    @Override
    public Item[] getSortedItems() {
        Item[] sortedItems = Arrays.copyOf(items, size);
        Arrays.sort(sortedItems, (item1, item2) -> Double.compare(item2.getPrice(), item1.getPrice()));
        return sortedItems;
    }
}

interface Item {
    String getName();
    double getPrice();
}

class MenuItem implements Item {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
