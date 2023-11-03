import java.util.Comparator;
class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Сравниваем студентов по убыванию итоговых баллов
        return Double.compare(student2.getGpa(), student1.getGpa());
    }

    // Метод для быстрой сортировки списка студентов
    public static void quickSort(Student[] students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);

            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    private static int partition(Student[] students, int low, int high) {
        double pivot = students[high].getGpa();
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (students[j].getGpa() >= pivot) {
                i++;

                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 3.8),
                new Student("Bob", 3.5),
                new Student("Charlie", 4.0),
                new Student("David", 3.2),
                new Student("Eve", 3.9)
        };

        // Сортируем список студентов по убыванию GPA с использованием быстрой сортировки
        quickSort(students, 0, students.length - 1);

        // Выводим отсортированный список
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", GPA: " + student.getGpa());
        }
    }
}