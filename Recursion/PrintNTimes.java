package Recursion;

public class PrintNTimes {

    static void func(int i, int n) {
        // Base Condition: Stop recursion when i exceeds n
        if (i > n) return;
        
        // Print "Raj" for the current iteration
        System.out.println("Mac");
        
        // Recursive call with incremented value of i
        func(i + 1, n);
    }

    public static void main(String[] args) {
        // Specify the value of n
        int n = 4;

        // Call the function to print "Mac" n times
        func(1, n);
    }
}
