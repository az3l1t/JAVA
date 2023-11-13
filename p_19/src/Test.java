import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Тестирование метода arrayToList
        String[] stringArray = {"Hello", "World"};
        List<String> stringList = Solution.arrayToList(stringArray);
        System.out.println(stringList);

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = Solution.arrayToList(intArray);
        System.out.println(intList);

        // Тестирование класса ArrayHolder
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        ArrayHolder<Integer> arrayHolder = new ArrayHolder<>(intArray2);
        System.out.println(arrayHolder.getElement(2));

        String[] stringArray2 = {"Hello", "World"};
        ArrayHolder<String> stringArrayHolder = new ArrayHolder<>(stringArray2);
        System.out.println(stringArrayHolder.getElement(1));

        // Тестирование функции listDirectory
        String directoryPath = "C:/Users/etern/test_java";
        List<String> fileList = DirectoryLister.listDirectory(directoryPath);
        for (int i = 0; i < 5 && i < fileList.size(); i++) {
            System.out.println(fileList.get(i));
        }

        // Тестирование вспомогательных методов в классе Solution
        ArrayList<String> stringList2 = Solution2.newArrayList("Hello", "World");
        System.out.println(stringList2);

        HashSet<Integer> intSet = Solution2.newHashSet(1, 2, 3, 4, 5);
        System.out.println(intSet);

        HashMap<String, Integer> map = Solution2.newHashMap("Key", 10);
        System.out.println(map);
    }
}