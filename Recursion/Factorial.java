package Recursion;

public class Factorial {
    
    // Method to calculate the factorial of a number using an iterative approach
    static int factorial(int x) {
        // Initialize the result variable to 1
        int start = 1;

        // Loop from 1 to x to compute the factorial
        for (int i = 1; i <= x; i++) {
            // Multiply the current result with the current number
            start = start * i;
        }

        // Return the computed factorial
        return start;
    }

    public static void main(String[] args) {
        // Input number for which the factorial is to be calculated
        int x = 5;

        // Call the factorial method and store the result
        int result = factorial(x);

        // Print the calculated factorial
        System.out.println("The Factorial of " + x + " is " + result);
    }
}
