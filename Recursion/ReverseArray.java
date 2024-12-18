package Recursion;

public class ReverseArray {
    
    // Method to print the elements of an array
    static void printArray(int arr[], int n) {
        System.out.print("Array elements are:\n");
        for (int i = 0; i < n; i++) {  
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // Recursive method to reverse the array
    static void reverseArray(int start, int end, int arr[]) {
        if (start < end) {
            // Swap the elements at indices start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Recursive call for the next pair
            reverseArray(start + 1, end - 1, arr);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {34, 24, 21, 89, 23}; 
        int n = arr.length;  
        
        System.out.println("Original array:");
        printArray(arr, n); // Print original array
        
        reverseArray(0, n - 1, arr); // Reverse the array
        
        System.out.println("Reversed array:");
        printArray(arr, n); // Print reversed array
    }
}
