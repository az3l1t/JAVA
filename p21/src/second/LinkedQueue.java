package second;

public class LinkedQueue<E> implements Queue<E> {
    private static class Node<E> {
        private final E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    @Override
    public void enqueue(E element) {
        Node<E> newNode = new Node<>(element);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        E element = head.data;
        head = head.next;
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return element;
    }

    @Override
    public E element() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return head.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}