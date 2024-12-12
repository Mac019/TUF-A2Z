package Recursion;

public class SumNNumbers {
    static void func(int i, int sum) {
        // Base Condition.
        if (i < 1) {
            System.out.println(sum);
            return;
        }

        // Function call to increment sum by i till i decrements to 1.
        func(i - 1, sum + i);
    }

    public static void main(String[] args) {
        int n = 10;
        func(n, 0);
    }
}
