import java.io.Serializable;

interface Animal {

}
//обобщенный класс с тремя параметрами (T, V, K)
class MyClass<T extends Comparable, V extends Serializable & Animal, K> { //класс с параметрами. // T реализует интерфейс comparable
    private T t;
    private V v;
    private K k;

    public MyClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClassNames() {
        System.out.println("Class of T: " + t.getClass().getName());
        System.out.println("Class of V: " + v.getClass().getName());
        System.out.println("Class of K: " + k.getClass().getName());
    }
}

class MinMax<T extends Comparable<T>> { //минимальный и макс знач массива
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T findMin() {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public T findMax() {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}

class Calculator {
    public static <T, U> double sum(T num1, U num2) {
        double n1 = Double.parseDouble(num1.toString());
        double n2 = Double.parseDouble(num2.toString());
        return n1 + n2;
    }

    public static <T, U> double multiply(T num1, U num2) {
        double n1 = Double.parseDouble(num1.toString());
        double n2 = Double.parseDouble(num2.toString());
        return n1 * n2;
    }

    public static <T, U> double divide(T num1, U num2) {
        double n1 = Double.parseDouble(num1.toString());
        double n2 = Double.parseDouble(num2.toString());
        return n1 / n2;
    }

    public static <T, U> double subtraction(T num1, U num2) {
        double n1 = Double.parseDouble(num1.toString());
        double n2 = Double.parseDouble(num2.toString());
        return n1 - n2;
    }
}

class Matrix<T> {
    private T[][] matrix;

    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public T getElement(int row, int col) {
        return matrix[row][col];
    }

    public void setElement(int row, int col, T value) {
        matrix[row][col] = value;
    }

    public void printMatrix() {
        for (T[] row : matrix) {
            for (T element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Test MyClass
        MyClass<Integer, Cat, String> myClass = new MyClass<>(5, new Cat(), "test");
        myClass.printClassNames();
        System.out.println("T: " + myClass.getT());
        System.out.println("V: " + myClass.getV());
        System.out.println("K: " + myClass.getK());

        // Test MinMax
        Integer[] integers = {5, 2, 9, 1, 7};
        MinMax<Integer> minMax = new MinMax<>(integers);
        System.out.println("Min: " + minMax.findMin());
        System.out.println("Max: " + minMax.findMax());

        // Test Calculator
        System.out.println("Sum: " + Calculator.sum(5, 3.5));
        System.out.println("Multiply: " + Calculator.multiply(2, 4.5));
        System.out.println("Divide: " + Calculator.divide(10, 2.5));
        System.out.println("Subtraction: " + Calculator.subtraction(8.7, 3));

        // Test Matrix
        Integer[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix<Integer> integerMatrix = new Matrix<>(matrix);
        integerMatrix.printMatrix();
        System.out.println("Element at row 1, column 2: " + integerMatrix.getElement(1, 2));
        integerMatrix.setElement(0, 0, 10);
        integerMatrix.printMatrix();
    }
}

class Cat implements Animal, Serializable {
    // Cat class implementation
}