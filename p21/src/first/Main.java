package first;

public class Main {
    public static void main(String[] args) {
        // Пример использования класса ArrayQueueModule
        ArrayQueueModule.enqueue("A");
        ArrayQueueModule.enqueue("B");
        ArrayQueueModule.enqueue("C");

        System.out.println(ArrayQueueModule.dequeue()); // Output: A
        System.out.println(ArrayQueueModule.element()); // Output: B
        System.out.println(ArrayQueueModule.size()); // Output: 2
        System.out.println(ArrayQueueModule.isEmpty()); // Output: false

        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty()); // Output: true

        // Пример использования класса ArrayQueueADT
        ArrayQueueADT queue = new ArrayQueueADT();
        ArrayQueueADT.enqueue(queue, "X");
        ArrayQueueADT.enqueue(queue, "Y");
        ArrayQueueADT.enqueue(queue, "Z");

        System.out.println(ArrayQueueADT.dequeue(queue)); // Output: X
        System.out.println(ArrayQueueADT.element(queue)); // Output: Y
        System.out.println(ArrayQueueADT.size(queue)); // Output: 2
        System.out.println(ArrayQueueADT.isEmpty(queue)); // Output: false

        ArrayQueueADT.clear(queue);
        System.out.println(ArrayQueueADT.isEmpty(queue)); // Output: true

        // Пример использования класса ArrayQueue
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);

        System.out.println(arrayQueue.dequeue()); // Output: 1
        System.out.println(arrayQueue.element()); // Output: 2
        System.out.println(arrayQueue.size()); // Output: 2
        System.out.println(arrayQueue.isEmpty()); // Output: false

        arrayQueue.clear();
        System.out.println(arrayQueue.isEmpty()); // Output: true
    }
}