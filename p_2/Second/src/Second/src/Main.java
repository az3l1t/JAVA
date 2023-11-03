package Second.src;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Первое задание (1.1)
        int[]num = {1,3,5,7,9,11};
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("Сумма элементов массива циклом for: " + sum);

        sum = 0;
        int i = 0;
        do {
            sum += num[i];
            i++;
        } while (i < num.length);

        System.out.println("Сумма элементов массива циклом do/while: " + sum);
        sum = 0;
        i = 0;

        while (i < num.length) {
            sum += num[i];
            i++;
        }

        System.out.println("Сумма элементов массива циклом while равна " + sum);
        System.out.println("-----------------------");
        // Второе задание (1.2)
        System.out.println("Аргументы командной строки: ");
        for (int j = 0; j < args.length; j++) {
            System.out.println(args[j]);
        }
        System.out.println("-----------------------");
        // Третье задание (1.3)
        for (int k = 1; k <= 10; k++) {
            System.out.println(k + " число гар-ого ряда: " + (1.0 / k));
        }

        System.out.println("-----------------------");
        // Четвертое задание (1.4)
        Random random = new Random();
        int[] arr = new int[7];

        for (int k = 0; k < arr.length; k++) {
            arr[k] = random.nextInt(100);
        }


        System.out.println("Неотсортированный массив: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
        // Пятое задание (1.5)
        System.out.println("-----------------------");
        System.out.println("Факториал пяти: "+factorial(5));
    }
    // функция, которая считает факториал
    public static long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}