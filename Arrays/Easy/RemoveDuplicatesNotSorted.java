package Arrays.Easy;
import java.util.ArrayList;

public class RemoveDuplicatedNotSorted {
    
 
    public static ArrayList removeDup(int arr[] , int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i< n-1; i++){
            if(arr[i] != arr [i+1]){
                ans.add(arr[i]);
            }
        }
        ans.add(arr[n-1]);
        return ans;
    }
     
     public static void main(String args []){
     
         int arr [] = { 2  , 2 , 3 , 5 ,6 , 6};
         int n = arr.length;
         System.out.print(removeDup(arr ,n));
     }
 }