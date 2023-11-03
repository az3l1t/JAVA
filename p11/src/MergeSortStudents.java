import java.util.ArrayList;
import java.util.List;
// сортировка слиянием


public class MergeSortStudents {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Alice", 3.8));
        list1.add(new Student("Bob", 3.5));
        list1.add(new Student("Charlie", 4.0));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("David", 3.2));
        list2.add(new Student("Eve", 3.9));

        List<Student> mergedList = mergeSort(list1, list2);

        // Выводим отсортированный список студентов
        for (Student student : mergedList) {
            System.out.println("Name: " + student.getName() + ", GPA: " + student.getGpa());
        }
    }

    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getGpa() > list2.get(j).getGpa()) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}