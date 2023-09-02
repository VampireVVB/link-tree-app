import java.util.Scanner;

class Swap {
    // Call by Value
    public static void swapByValue(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    // Call by Reference
    public static void swapByReference(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Call by Value
        System.out.println("Values before swapping (Call by Value):");
        System.out.println("num1: " + num1 + ", num2: " + num2);
        swapByValue(num1, num2);
        System.out.println("Values after swapping (Call by Value):");
        System.out.println("num1: " + num1 + ", num2: " + num2);

        // Call by Reference
        int[] array = {num1, num2};
        System.out.println("Values before swapping (Call by Reference):");
        System.out.println("num1: " + array[0] + ", num2: " + array[1]);
        swapByReference(array);
        System.out.println("Values after swapping (Call by Reference):");
        System.out.println("num1: " + array[0] + ", num2: " + array[1]);

        scanner.close();
    }
}