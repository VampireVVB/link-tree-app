public class GenericArrayPrinter {

    // Generic method to print an array of any type
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Integer Array: ");
        printArray(intArray);

        // Example with Double array
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.print("Double Array: ");
        printArray(doubleArray);

        // Example with String array
        String[] stringArray = {"one", "two", "three", "four", "five"};
        System.out.print("String Array: ");
        printArray(stringArray);
    }
}
