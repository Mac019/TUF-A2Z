package BasicMathProblems;

public class PrintDivisors {

    public static int[] printDivisors(int n, int[] size) {
        // Allocate memory for the array of divisors
        int[] divisors = new int[n];
        // Initialize the count of divisors
        int count = 0;

        // Find all divisors of n
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                // Add the divisor to the array
                divisors[count++] = i;
            }
        }
        // Update the size parameter with the count of divisors
        size[0] = count;
        // Return the array of divisors
        return divisors;
    }

    public static void main(String[] args) {
        int number = 12; // The number whose divisors are to be found
        int[] size = new int[1]; // Array to hold the size of divisors
        int[] divisors = printDivisors(number, size); // Call the printDivisors method

        // Print the divisors
        System.out.print("Divisors of " + number + " are: ");
        for (int i = 0; i < size[0]; i++) {
            System.out.print(divisors[i] + " ");
        }
        System.out.println();

        // Free dynamically allocated memory
        divisors = null;
    }
}
