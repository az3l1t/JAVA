package practice_14;

public class Main {
    public static void main(String[] args) {
        // Пример использования созданных классов и интерфейсов
        IWaitList<Integer> waitList = new WaitList<>();
        waitList.add(1);
        waitList.add(2);
        waitList.add(3);

        System.out.println(waitList);
        // Вывод: [1, 2, 3]

        waitList.remove();
        System.out.println(waitList);
        // Вывод: [2, 3]

        System.out.println(waitList.contains(2));
        // Вывод: true

        System.out.println(waitList.isEmpty());
        // Вывод: false

        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<>(5);
        for (int i = 0; i < 10; i++) {
            boundedWaitList.add(i);
        }

        System.out.println(boundedWaitList);
        // Вывод: [0, 1, 2, 3, 4], capacity=5

        UnfairWaitList<String> unfairWaitList = new UnfairWaitList<>();
        unfairWaitList.add("A");
        unfairWaitList.add("B");
        unfairWaitList.add("C");

        System.out.println(unfairWaitList);
        // Вывод: [A, B, C]

        unfairWaitList.moveToBack("A");
        System.out.println(unfairWaitList);
        // Вывод: [B, C, A]

        unfairWaitList.remove("C");
        System.out.println(unfairWaitList);
        // Вывод: [B, A]
    }
}