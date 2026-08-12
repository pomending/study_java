package ex_work;

import java.util.Scanner;

public class Ex7_work {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("수1 : ");
        int n1 = sc.nextInt();

        System.out.print("수2 : ");
        int n2 = sc.nextInt();

        while( true ){

            if( n1 == n2 ){
                System.out.println(n1);
                break;
            }
            if( n1 == 1 || n2 == 1 ){
                System.out.println(1);
                break;
            }
            if( n1 > n2 )
                n1 -= n2;
            if( n1 < n2 )
                n2 -= n1;

        }

    }
    
}
