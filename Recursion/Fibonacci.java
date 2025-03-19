package Recursion;

public class Fibonacci {

    static int calculateFibonacci(int n) {
        if (n <= 1) { // Base case
            return n;
        }

        int previous = calculateFibonacci(n - 1);
        int secondPrevious = calculateFibonacci(n - 2);

        return previous + secondPrevious;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println(calculateFibonacci(number));
    }
}


// class Main {
    
    
//     public static void main(String args[]){
//          int first = 0;
//         int second = 1;
//         int n = 10;
//         for(int i = 0; i<n; i++){
//             int third = first + second;
//             System.out.print(first + " " );
//             first = second ;
//             second = third;
//         }
//     }
// }
