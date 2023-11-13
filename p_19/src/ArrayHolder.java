public class ArrayHolder<T> { //Класс, который хранит в себе массив любых типов данных: (2)
    private T[] array;

    public ArrayHolder(T[] array) {
        this.array = array;
    }

    public T getElement(int index) {
        return array[index];
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        ArrayHolder<Integer> arrayHolder = new ArrayHolder<>(intArray);
        System.out.println(arrayHolder.getElement(2));

        String[] stringArray = {"Hello", "World"};
        ArrayHolder<String> stringArrayHolder = new ArrayHolder<>(stringArray);
        System.out.println(stringArrayHolder.getElement(1));
    }
}
