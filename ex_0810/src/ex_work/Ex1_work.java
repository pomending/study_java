package ex_work;

import java.util.Scanner;

public class Ex1_work {

    public static void main(String[] args) {

        /*
        **예시 (N = 7):**
        ```text
      *  
    *   *  
  *       *  
*           *  
  *       *  
    *   *  
      *
      
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int diamond = ( n - 1 ) / 2;

        for( int i = 0 ; i < n; i++ ){

            for( int j = -1 * diamond ; j <= diamond; j++){

                System.out.print(( j == -i || j == i ) || ( j == n - i - 1|| j == -( n - i - 1 ))? "* " : "  ");
                
            }

            System.out.println();

        }


    }
    
}
