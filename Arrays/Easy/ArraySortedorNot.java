package Arrays.Easy;

public class ArraySortedorNot {

  static boolean isSorted(int arr[], int n) {
    for (int i = 1; i < n; i++) {
      if (arr[i] < arr[i - 1]) // If the current element is smaller than the previous one, it's not sorted
        return false;
    }
    return true; // If no such case occurs, the array is sorted
  }

  public static void main(String args[]) {
    int arr[] = {1, 2, 3, 4, 5}; 
    int n = arr.length; 

    System.out.println(isSorted(arr, n)); // Call the method and print the result
  }
}
