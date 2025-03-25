package Arrays.Easy;

public class MaximumConsecutiveOnes { 

    public static int consecutiveOnes(int arr[], int n) {
        int count = 0, max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                max = (count > max) ? count : max; // Using ternary instead of Math.max()
            } else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int arr[] = {2, 1, 1, 4, 5, 6, 7, 1, 1, 1};
        int n = arr.length;

        System.out.print(consecutiveOnes(arr, n));
    }
}
