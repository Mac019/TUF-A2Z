package Arrays.Easy;

public class FindNumberAppearOnce {
    
    public static int occurOnce(int arr[], int n) {
        int xor = 0; // Initialize XOR result
        for (int num : arr) {
            xor ^= num; // XOR all numbers
        }
        return xor; // The unique number remains
    }

    public static void main(String args[]) {
        int arr[] = {2, 2, 5, 4, 5, 7, 7}; // Example array
        int n = arr.length;
        int result = occurOnce(arr, n);
        System.out.println("The unique number is: " + result); // Output: 4
    }
}
