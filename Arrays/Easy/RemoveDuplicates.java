package Arrays.Easy;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 3};
        
        int k = removedup(arr); // Calling the function to remove duplicates
        System.out.println("The array after removing duplicate elements is:");
        
        // Print only the first k elements, as they are the unique ones
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removedup(int arr[]) {
        int i = 0; // Pointer for the last unique element

        for (int j = 1; j < arr.length; j++) { // Traverse the array starting from the second element
            if (arr[i] != arr[j]) { // If a new unique element is found
                i++; // Move the pointer for unique elements
                arr[i] = arr[j]; // Update the position with the new unique element
            }
        }
        return i + 1; // The count of unique elements
    }
}
