package Recursion;

public class PrintNTo1 {

    static void func(int i, int n) {
        // Base Condition: Stop recursion when i exceeds n
        if (i < 1) return;
        
        System.out.println(" " + i);
        
        // Function call to print i till i increments to n.
        func(i-1, n);
    }

    public static void main(String[] args) {
        // Specify the value of n
        int n = 4;

        func(n, n);
    }
}