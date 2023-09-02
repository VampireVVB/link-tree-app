import java.util.Scanner;
import java.util.Arrays;

class ArrayOperations {
    private int[] array;

    public ArrayOperations() {
        array = new int[10];
    }

    public void inputValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integer values:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public void displayValues() {
        System.out.println("Array values:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public int findLargestValue() {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }

    public void sortArrayAscending() {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        ArrayOperations arrayObj = new ArrayOperations();

        arrayObj.inputValues();
        arrayObj.displayValues();

        int largestValue = arrayObj.findLargestValue();
        System.out.println("Largest value: " + largestValue);

        double average = arrayObj.calculateAverage();
        System.out.println("Average: " + average);

        arrayObj.sortArrayAscending();
        System.out.println("Array after sorting:");
        arrayObj.displayValues();
    }
}

