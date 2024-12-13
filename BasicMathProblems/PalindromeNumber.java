package BasicMathProblems;
public class PalindromeNumber {

    
    public static boolean isPalindrome(int n) {
        int originalNumber = n;  // Store the original number
        int reversedNumber = 0;  // Initialize the variable to store the reversed number

        // Reverse the number
        while (n != 0) {
            int digit = n % 10;           // Get the last digit of the number
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            n /= 10;                      // Remove the last digit from the original number
        }

        // Check if the original number and the reversed number are the same
        return originalNumber == reversedNumber;  // Return true if they are the same
    }

    public static void main(String[] args) {
        int number = 121; 

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }
}
