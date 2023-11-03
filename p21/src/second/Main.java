package second;

public class Main {
    public static void main(String[] args) {
        // Пример использования класса LinkedQueue
        Queue<String> queue = new LinkedQueue<>();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        System.out.println(queue.dequeue()); // Output: A
        System.out.println(queue.element()); // Output: B
        System.out.println(queue.size()); // Output: 2
        System.out.println(queue.isEmpty()); // Output: false

        queue.clear();
        System.out.println(queue.isEmpty()); // Output: true
    }
}