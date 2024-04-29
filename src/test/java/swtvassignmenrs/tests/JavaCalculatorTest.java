package swtvassignmenrs.tests;

import org.example.Calculator;

public class JavaCalculatorTest  {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Test addition
        int sum = calculator.add(1, 1);
        System.out.println("1 + 1 = " + sum);

        // Test subtraction
        int difference = calculator.subtract(5, 2);
        System.out.println("5 - 2 = " + difference);

        // Test multiplication
        int product = calculator.multiply(3, 5);
        System.out.println("3 * 5 = " + product);

        // Test division
        int quotient = calculator.divide(10, 2);
        System.out.println("10 / 2 = " + quotient);

        // Test division by zero (should throw an exception)
        try {
            calculator.divide(5, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

