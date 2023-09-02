import java.util.Scanner;

class Box {
    private double width;
    private double height;
    private double depth;

    // Parameterized constructor to initialize the dimensions
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate and return the volume
    public double calculateVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter dimensions
        System.out.print("Enter the width of the box: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the box: ");
        double height = scanner.nextDouble();

        System.out.print("Enter the depth of the box: ");
        double depth = scanner.nextDouble();

        // Create a Box object with user-defined dimensions
        Box myBox = new Box(width, height, depth);

        // Calculate the volume of the box using the calculateVolume method
        double volume = myBox.calculateVolume();

        // Print the volume
        System.out.println("The volume of the box is: " + volume + " cubic units");

        // Close the scanner
        scanner.close();
    }
}
