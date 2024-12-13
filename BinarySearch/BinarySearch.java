public class BinarySearch {
    // Binary Search function
    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is at mid
            if (array[mid] == target) {
                return mid;
            }

            // If target is smaller, search the left half
            if (array[mid] > target) {
                right = mid - 1;
            } 
            // If target is larger, search the right half
            else {
                left = mid + 1;
            }
        }

        return -1; // Element not found
    }

    // Main method
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50}; // Array must be sorted
        int target = 30;

        int result = binarySearch(array, target);
        
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}