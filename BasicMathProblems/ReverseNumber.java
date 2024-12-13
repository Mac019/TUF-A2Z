package BasicMathProblems;

public class ReverseNumber {

    // Function to reverse the digits of an integer 'n'.
    public static int reverseNumber(int n) {
        int reversed = 0;  // Variable to store the reversed number.

        // Loop until 'n' becomes 0
        while (n != 0) {
            int digit = n % 10;  // Get the last digit of 'n'
            reversed = reversed * 10 + digit;  // Append the digit to the reversed number
            n = n / 10;  // Remove the last digit from 'n'
        }
        return reversed;  // Return the reversed number
    }

    public static void main(String[] args) {
        int N = 12345;  
        
        System.out.println("Original Number: " + N);  
        
        int reversed = reverseNumber(N);  
        
        System.out.println("Reversed Number: " + reversed);  
    }
}
