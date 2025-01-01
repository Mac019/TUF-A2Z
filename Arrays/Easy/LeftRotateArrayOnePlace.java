package Arrays.Easy;

public class LeftRotateArrayOnePlace {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 35, 34, 56};
        int n = arr.length;

        // Rotate the array
        rotatearr(arr, n);

        // Print the rotated array
        System.out.print("The Rotated Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void rotatearr(int arr[], int n) {
        // Store the first element
        int temp = arr[0];

        // Shift all elements one position to the left
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Move the first element to the last position
        arr[n - 1] = temp;
    }
}
