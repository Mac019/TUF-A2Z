public class StarPatterns { 
    public static void main(String args[]) { 
       int n = 5;
    //Square of Stars
       for(int i = 1; i<=n; i++){                                // *****
        for(int j = 1; j<=n; j++){                               // *****
            System.out.print("*");                             // *****            
        }                                                        // *****
        System.out.println();                                    // *****
       } 
    

    // Right-Angled Traingle of Stars
       for(int i = 1; i <=n; i++){                               //  *      
        for( int j = 1; j<i; j++){                               //  **
            System.out.print("*");                             //  ***
        }                                                        //  ****
        System.out.println();
    }


    // Right-Angled Traingle of Numbers
    for(int i = 0; i <=n; i++){                                 //  1     
        for( int j = 1; j<=i; j++){                             //  12
            System.out.print(j);                                //  123
        }                                                       //  1234
        System.out.println();                                   //  12345
    }

     // Right-Angled Traingle of Numbers with Rows
    for(int i = 0; i <=n; i++){                                 //  1     
        for( int j = 1; j<=i; j++){                             //  22
            System.out.print(i);                                //  333
        }                                                       //  4434
        System.out.println();                                   //  55555
    }

     // Reverse-Angled Traingle of Stars
    for(int i = n; i >=1; i--){                                 //  *****  
        for( int j = 1; j<=i; j++){                             //  ****
            System.out.print("*");                            //  ***
        }                                                       //  **
        System.out.println();                                   //  *
    }

    // Reverse-Angled Traingle of Numbers
    for(int i = n; i >=1; i--){                                 //  12345 
        for( int j = 1; j<=i; j++){                             //  1234
            System.out.print(j);                                //  123
        }                                                       //  12
        System.out.println();                                   //  1
    }

    // Piramid Traingle of stars
    for (int i = 0; i < n; i++)                                 //     *
    {                                                           //    ***
        // For printing the spaces before stars in each row     //   *****
        for (int j =0; j<n-i-1; j++)                            //  *******
        {                                                       // *********
            System.out.print(" ");
        }
       
        // For printing the stars in each row
        for(int j=0;j< 2*i+1;j++){
            
            System.out.print("*");
        }
        
        // For printing the spaces after the stars in each row
         for (int j =0; j<n-i-1; j++)
        {
            System.out.print(" ");
        }
       

        System.out.println();
    }


      //Reverse Pyramid of stars
      for (int i = 0; i < n; i++)                                    //********* 
      {                                                              // *******
          // For printing the spaces before stars in each row        //  *****
          for (int j =0; j<i; j++)                                   //   ***
          {                                                          //    *
              System.out.print(" ");
          }
         
          // For printing the stars in each row
          for(int j=0;j< 2*n -(2*i +1);j++){
              
              System.out.print("*");
          }
          
          // For printing the spaces after the stars in each row
          for (int j =0; j<i; j++)
          {
              System.out.print(" ");
          }
         
  
          System.out.println();
      }
  



}
}

