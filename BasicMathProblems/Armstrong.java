package BasicMathProblems;

public class Armstrong {

    public static boolean checkArmstrong(int n) {
        if (n < 0) return false; // Armstrong numbers are not defined for negative numbers
        
        int k = String.valueOf(n).length(); // Get the number of digits
        int sum = 0;
        int num = n; // Store original number for comparison

        while (n > 0) {
            int ld = n % 10; // Extract last digit
            sum += Math.pow(ld, k); // Add digit raised to the power of k
            n = n / 10; // Remove last digit
        }
        
        return sum == num; // Return true if the number is an Armstrong number
    }

    public static void main(String[] args) {
        int n = 153;
        boolean armstrong = checkArmstrong(n);
        if (armstrong) {
            System.out.println("Number is an Armstrong Number");
        } else {
            System.out.println("Number is not an Armstrong Number");
        }
    }
}
