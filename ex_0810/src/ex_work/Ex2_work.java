package ex_work;

import java.util.Scanner;

public class Ex2_work {

    public static void main(String[] args) {
        
        /*
        예시 (N = 5, 전체 행은 2*N - 1):

Plaintext
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

        */

        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();

        for( int i = -n + 1; i < n ; i++){ // -4 ~ 4

            for( int j = -n; j < n; j++){ // -5 ~ 4

                if( i <= 0 ){

                    System.out.print(( j < i || j >= -i ) ? "* " : "  ");

                }else{

                    System.out.print(( j >= i || j < -i ) ? "* " : "  ");
                    
                }
            }

            System.out.println();

        }

    }
    
}
