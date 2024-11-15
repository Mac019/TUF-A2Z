public class StarPatterns { 
    public static void main(String args[]) { 
       int n = 5;

       for(int i = 1; i<=n; i++){                                // *****
        for(int j = 1; j<=n; j++){                               // *****
            System.out.print("*");                             // *****            
        }                                                        // *****
        System.out.println();                                    // *****
       } 
    


       for(int i = 1; i <=n; i++){                               //  *      
        for( int j = 1; j<i; j++){                               //  **
            System.out.print("*");                             //  ***
        }                                                        //  ****
        System.out.println();
    }



    for(int i = 0; i <=n; i++){                                 //  1     
        for( int j = 1; j<=i; j++){                             //  12
            System.out.print(j);                                //  123
        }                                                       //  1234
        System.out.println();                                   //  12345
    }


    for(int i = 0; i <=n; i++){                                 //  1     
        for( int j = 1; j<=i; j++){                             //  22
            System.out.print(i);                                //  333
        }                                                       //  4434
        System.out.println();                                   //  55555
    }


    for(int i = n; i >=1; i--){                                 //  *****  
        for( int j = 1; j<=i; j++){                             //  ****
            System.out.print("*");                            //  ***
        }                                                       //  **
        System.out.println();                                   //  *
    }


    for(int i = n; i >=1; i--){                                 //  12345 
        for( int j = 1; j<=i; j++){                             //  1234
            System.out.print(j);                                //  123
        }                                                       //  12
        System.out.println();                                   //  1
    }
}

}