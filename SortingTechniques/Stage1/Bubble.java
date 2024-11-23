package SortingTechniques.Stage1;

public class Bubble {

    public static void bubble_sort(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array before sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Sort the array
        bubble_sort(arr, arr.length);

        System.out.println("\n\nArray after sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
