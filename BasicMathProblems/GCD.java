package BasicMathProblems; // Best Approach

public class GCD {

    // This method finds the GCD using the Euclidean algorithm (efficient approach)
    public static int findGcd(int a, int b) {
        // Continue loop as long as both a and b are greater than 0
        while (a > 0 && b > 0) {
            // If a is greater than b, subtract b from a and update a
            if (a > b) {
                // Update a to the remainder of a divided by b
                a = a % b;
            }
            // If b is greater than or equal to a, subtract a from b and update b
            else {
                // Update b to the remainder of b divided by a
                b = b % a;
            }
        }
        // If a becomes 0, return b as the GCD
        if (a == 0) {
            return b;
        }
        // If b becomes 0, return a as the GCD
        return a;
    }

    public static void main(String[] args) {
        int n1 = 20, n2 = 15;
        // Find the GCD of n1 and n2
        int gcd = findGcd(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}
// Approach 1
// public class GCD {

//     public static int findgcd(int n1 , int n2){
//         int gcd = 1;

//         for(int i = 1; i<=Math.min(n1, n2); i++){
//             if(n1 % i ==0 && n2 % i ==0){
//                 gcd = i;

//             }
//         }
//         return gcd;

//     }

//     public static void main(String[] args) {
//         int n1 = 34 ,  n2 = 36;
//         int gcd = findgcd(n1, n2);
//         System.out.println("GCD of Number is "+ gcd);

//     }
    
// }


