package first;

public class ArrayQueueADT {
    private Object[] elements = new Object[10];
    private int size;
    private int head;
    private int tail;

    // Предусловие: element != null
    public static void enqueue(ArrayQueueADT queue, Object element) {
        assert element != null : "Element cannot be null";
        ensureCapacity(queue, queue.size + 1);
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.elements.length;
        queue.size++;
    }

    // Предусловие: очередь не пуста
    // Постусловие: возвращается первый элемент очереди
    public static Object element(ArrayQueueADT queue) {
        assert queue.size > 0 : "Queue is empty";
        return queue.elements[queue.head];
    }

    // Предусловие: очередь не пуста
    // Постусловие: из очереди удален и возвращен первый элемент
    public static Object dequeue(ArrayQueueADT queue) {
        assert queue.size > 0 : "Queue is empty";
        Object element = queue.elements[queue.head];
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return element;
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueADT queue) {
        for (int i = 0; i < queue.size; i++) {
            queue.elements[(queue.head + i) % queue.elements.length] = null;
        }
        queue.head = 0;
        queue.tail = 0;
        queue.size = 0;
    }

    private static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if (capacity > queue.elements.length) {
            Object[] newElements = new Object[2 * capacity];
            System.arraycopy(queue.elements, queue.head, newElements, 0, queue.elements.length - queue.head);
            System.arraycopy(queue.elements, 0, newElements, queue.elements.length - queue.head, queue.tail);
            queue.elements = newElements;
            queue.head = 0;
            queue.tail = queue.size;
        }
    }
}