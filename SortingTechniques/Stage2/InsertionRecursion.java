package SortingTechniques.Stage2;

public class InsertionRecursion {

    // Recursive function for Insertion Sort
    static void insertion_sort(int[] arr, int i, int n) {
        // Base Case: When all elements are sorted
        if (i == n) return;

        // Insert current element in the correct position
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            // Swap arr[j-1] and arr[j]
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        // Recursive call for the next element
        insertion_sort(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        System.out.println("Before Using Insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Perform recursive insertion sort
        insertion_sort(arr, 0, n);

        System.out.println("After Insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
