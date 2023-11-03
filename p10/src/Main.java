public class Main {
    public static void main(String[] args) {
        //Задание 1 - число k - k раз
        int n1=5;
        printSequence(n1);
        System.out.println('\n');
        //Задание 2 - число от k до n2
        int n2 = 10;
        printNumbers(n2);
        System.out.println('\n');
        //Задание 3 - от а до b
        int n3=8;
        int n4=2;
        printNumbers(n3, n4);
        //Задание 4 - сумма цифр числа
        System.out.println('\n');
        int n = 12345;
        int sum = findDigitSum(n);
        System.out.println("Сумма цифр числа " + n + " равна " + sum);

    }

    public static void printSequence(int n) { // 1
        if (n < 1) {
            return;
        }

        printSequence(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(n + " ");
        }
    }

    public static void printNumbers(int n) { //2
        if (n > 1) {
            printNumbers(n - 1);
        }

        System.out.print(n + " ");
    }

    public static void printNumbers(int a, int b) { //3
        if (a == b) {
            System.out.println(a); // базовый случай: a и b равны, выводим число и завершаем рекурсию
            return;
        }

        if (a < b) {
            System.out.println(a); // выводим число A
            printNumbers(a + 1, b); // вызываем рекурсивно с увеличенным значением A
        } else {
            System.out.println(a); // выводим число A
            printNumbers(a - 1, b); // вызываем рекурсивно с уменьшенным значением A
        }
    }

    public static int findDigitSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + findDigitSum(n / 10);
        }
    }


}
