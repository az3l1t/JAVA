
// Вывод айди в порядке возрастания/сортировка вставками
public class InsertionSort {
    public static void main(String[] args) {
        Student[] students = {
                new Student(3),
                new Student(1),
                new Student(2),
                new Student(5),
                new Student(4)
        };

        // Вызываем метод сортировки вставками
        insertionSort(students);

        // Выводим отсортированный массив
        for (Student student : students) {
            System.out.println("ID: " + student.getiDNumber());
        }
    }

    public static void insertionSort(Student[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Student key = arr[i];
            int j = i - 1;

            // Сдвигаем элементы массива, которые больше key.iDNumber
            while (j >= 0 && arr[j].getiDNumber() > key.getiDNumber()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}