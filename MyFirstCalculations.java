public class MyFirstCalculations {
    public static void main(String[] args) {
        // Declare and initialize variables
        int n1 = 20;
        int n2 = 10;
        double n3 = 25.2;
        // Process calculations
        int sum = n1 + n2;
        int minus = n1 - n2;
        int multiply = n1 * n2;
        int divide = n1 / n2;
        int remainder = n1 % n2;
        double div1 = n3 / n2;
        double div2 = n1 / n3;
        // Display output
        System.out.println("Sum is:" + sum);
        System.out.println("Minus value is:" + minus);
        System.out.println("Multiplication: " + multiply);
        System.out.println("Divide: " + divide);
        System.out.println("Remainder: " + remainder);

        System.out.printf("Divide 1: %.3f\n", div1);
        System.out.printf("Divide 2: %.3f\n", div2);
    }

    public TestFunction name() {
        System.out.println("Test method");

    }
}