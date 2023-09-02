class SquareCalculator {
    public static double square(double num) {
        return num * num;
    }

    public static void main(String[] args) {
        double result1 = square(3);
        double result2 = square(0.2);

        System.out.println("square(3) = " + result1);
        System.out.println("square(0.2) = " + result2);
    }
}
