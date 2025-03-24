package Arrays.Easy;

public class LeftRotateByKSpaces {

    public static void leftRotateByK(int arr [] , int n , int k ){
    
        for(int i = 0 ; i <k ; i++){
             int temp = arr[0];
            for(int j = 0; j< n-1; j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = arr[0];
        }
     
     for (int i = 0; i < n; i++) {
             System.out.print(arr[i] + " ");
         }
     }
     
     public static void main(String args []){
         
         int arr [] = {2 ,4  , 5  , 6 , 7};
         int n = arr.length;
    
         int k = 3;
                 leftRotateByK(arr, n, k);
     }  
     
 
 }