package Arrays.Medium;


public class StockBuySell {
    public static int stockProfit(int arr[] , int n){
        
        int minPrice = arr[0];
        int maxProfit = 0;
        for( int i = 1; i < n ; i++){
            if(arr[i] < minPrice){
                arr[i] = minPrice;
            }
            if(arr[i] - minPrice > maxProfit){
                maxProfit = arr[i] - minPrice;
            }
        }
        return maxProfit;
    }
    
    
    public static void main(String [] args){
        
        int arr [] = { 1,3,5,6,7};
        int n = arr.length;
        System.out.print(stockProfit(arr ,n));
    }
}