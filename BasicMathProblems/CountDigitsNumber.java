package BasicMathProblems;

public class CountDigitsNumber {

    public static int CountDigits(int n) {
        int count = 0; // Initialize digit counter

        while (n > 0) {
            count++;  
            n = n / 10;  // Remove the last digit
        }
        return count;  
    }

    public static void main(String[] args) {
        int N = 4567879;  // The number to count digits for
        
        System.out.println("N: " + N);  // Print the original number
        
        int Digits = CountDigits(N);  // Get the digit count
        
        System.out.println("Number of Digits in N: " + Digits);  // Print the result
    }
}
