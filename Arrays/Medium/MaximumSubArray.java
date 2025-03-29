package Arrays.Medium; 

public class MaximumSubArray {

    public static void subArray(int arr[], int n) {  
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();  
            }
        }
    }
    
    public static void main(String args[]) {
        int arr[] = {2, 4, 5, 6, 7};
        int n = arr.length;
        subArray(arr, n); 
    }
}
