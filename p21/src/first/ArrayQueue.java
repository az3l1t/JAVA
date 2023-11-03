package first;

public class ArrayQueue {
    private Object[] elements;
    private int size;
    private int head;
    private int tail;

    public ArrayQueue() {
        elements = new Object[10];
        size = 0;
        head = 0;
        tail = 0;
    }

    // Предусловие: element != null
    public void enqueue(Object element) {
        assert element != null : "Element cannot be null";
        ensureCapacity(size + 1);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    // Предусловие: очередь не пуста
    // Постусловие: возвращается первый элемент очереди
    public Object element() {
        assert size > 0 : "Queue is empty";
        return elements[head];
    }

    // Предусловие: очередь не пуста
    // Постусловие: из очереди удален и возвращен первый элемент
    public Object dequeue() {
        assert size > 0 : "Queue is empty";
        Object element = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[(head + i) % elements.length] = null;
        }
        head = 0;
        tail = 0;
        size = 0;
    }

    private void ensureCapacity(int capacity) {
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