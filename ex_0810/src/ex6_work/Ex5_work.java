package ex6_work;

import java.util.Scanner;

public class Ex5_work {

    public static void main(String[] args) {
        
        //입력받은 두 수의 최소공배수
        //----------------
        //수1 : 6
        //수2 : 10
        //최소공배수 : 30

        Scanner sc = new Scanner(System.in);

        System.out.print("수1 : ");
        int n1 = sc.nextInt();

        System.out.print("수2 : ");
        int n2 = sc.nextInt();

        if( n1 < n2 ){
            int n3 = n1;
            n1 = n2;
            n2 = n3;
        }

        for( int i = n1; i <= n1 * n2; i++ ){

            if( i % n1 == 0 && i % n2 == 0 ){
                System.out.println("최소공배수 : " + i);
                break;
            }

        }

        System.out.println("-------------------");

        int x = n1;
        int y = n2;
        
        while( y != 0 ){
            int tmp = x % y;
            x = y;
            y = tmp;
        }

        System.out.println("최소공배수 : " + n1 * n2 / x);

    }
    
}
