package BasicMathProblems;

public class CheckPrimeNumber { 

    static boolean checkPrime(int n ){
        int count = 0;

        // for( int i = 1 ; i<= n; i++){ T.C = o(N)
        for (int i = 1; i <= Math.sqrt(n); i++) {    // T.C = o(sqrt.N)
            if( n%i == 0){
                count = count + 1;
                // If n is not a perfect square, count its reciprocal factor.
                  if (n / i != i) { 
                    count = count + 1;
                  }
            }
        }
        if (count == 2){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {
        int N = 64;
        boolean isPrime = checkPrime(N);

        if(isPrime){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is Not a Prime Number");
        }
    }
    
}
