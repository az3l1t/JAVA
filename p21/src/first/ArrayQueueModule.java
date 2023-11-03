package first;

public class ArrayQueueModule {
    private static Object[] elements = new Object[10];
    private static int size;
    private static int head;
    private static int tail;

    // Предусловие: element != null
    public static void enqueue(Object element) {
        assert element != null : "Element cannot be null";
        ensureCapacity(size + 1);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    // Предусловие: очередь не пуста
    // Постусловие: возвращается первый элемент очереди
    public static Object element() {
        assert size > 0 : "Queue is empty";
        return elements[head];
    }

    // Предусловие: очередь не пуста
    // Постусловие: из очереди удален и возвращен первый элемент
    public static Object dequeue() {
        assert size > 0 : "Queue is empty";
        Object element = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return element;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        for (int i = 0; i < size; i++) {
            elements[(head + i) % elements.length] = null;
        }
        head = 0;
        tail = 0;
        size = 0;
    }

    private static void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            Object[] newElements = new Object[2 * capacity];
            System.arraycopy(elements, head, newElements, 0, elements.length - head);
            System.arraycopy(elements, 0, newElements, elements.length - head, tail);
            elements = newElements;
            head = 0;
            tail = size;
        }
    }
}