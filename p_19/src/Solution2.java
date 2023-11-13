import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
//Реализуйте вспомогательные методы в классе Solution, которые
//должны создавать соответствующую коллекцию и помещать туда переданные
//объекты
public class Solution2<T, V, K> {
    private T variableT;
    private V variableV;
    private K variableK;

    public Solution2(T variableT, V variableV, K variableK) {
        this.variableT = variableT;
        this.variableV = variableV;
        this.variableK = variableK;
    }

    public static <T> ArrayList<T> newArrayList(T... elements) {
        ArrayList<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        HashSet<T> set = new HashSet<>();
        for (T element : elements) {
            set.add(element);
        }
        return set;
    }

    public static <K, V> HashMap<K, V> newHashMap(K key, V value) {
        HashMap<K, V> map = new HashMap<>();
        map.put(key, value);
        return map;
    }

    public static void main(String[] args) {
        ArrayList<String> stringList = newArrayList("Hello", "World");
        System.out.println(stringList);

        HashSet<Integer> intSet = newHashSet(1, 2, 3, 4, 5);
        System.out.println(intSet);

        HashMap<String, Integer> map = newHashMap("Key", 10);
        System.out.println(map);
    }
}
