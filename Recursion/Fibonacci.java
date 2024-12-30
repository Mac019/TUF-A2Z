package Recursion;

public class Fibonacci {

    static int calculateFibonacci(int n) {
        if (n <= 1) { // Base case
            return n;
        }

        int previous = calculateFibonacci(n - 1);
        int secondPrevious = calculateFibonacci(n - 2);

        return previous + secondPrevious;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println(calculateFibonacci(number));
    }
}
