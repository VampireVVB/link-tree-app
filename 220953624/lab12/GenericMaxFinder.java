public class GenericMaxFinder {

    // Generic method to find the largest of three Comparable objects
    public static <T extends Comparable<T>> T findMax(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {
        // Example with Integer objects
        Integer intMax = findMax(3, 7, 1);
        System.out.println("Max Integer: " + intMax);

        // Example with Double objects
        Double doubleMax = findMax(5.5, 2.2, 9.7);
        System.out.println("Max Double: " + doubleMax);

        // Example with String objects
        String stringMax = findMax("apple", "orange", "banana");
        System.out.println("Max String: " + stringMax);
    }
}
