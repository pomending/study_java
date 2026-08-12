package ex_work;

import java.util.Scanner;

public class Ex6_work {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("N = ");
        int n = sc.nextInt();

        for( int i = 2; i <= (n/2) + 1; i++ ){

            if ( n % i == 0 ){
                break;
            }

            System.out.print(i + " ");

        }

    }
    
}
