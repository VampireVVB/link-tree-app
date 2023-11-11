import java.util.Scanner;

class CustomThread extends Thread {
    public void run() {
        System.out.println("Custom thread is running");
    }
}

class CustomRunnable implements Runnable {
    public void run() {
        System.out.println("Custom runnable is running");
    }
}

public class MenuDriven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Create thread using Runnable interface");
            System.out.println("2. Create thread by inheriting Thread class");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Create thread using Runnable interface
                    CustomRunnable customRunnable = new CustomRunnable();
                    Thread thread1 = new Thread(customRunnable);
                    thread1.start();
                    break;
                case 2:
                    // Create thread by inheriting Thread class
                    CustomThread customThread = new CustomThread();
                    customThread.start();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        } while (choice != 3);

        scanner.close();
    }
}