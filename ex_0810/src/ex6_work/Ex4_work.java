package ex6_work;

import java.util.Scanner;

public class Ex4_work {

    public static void main(String[] args) {
        
        //키보드에서 입력받은 두 개의 수의 최대공약수 출력
        //-----------------
        //수1 : 18
        //수2 : 12
        //최대공약수 : 6

        Scanner sc = new Scanner(System.in);

        System.out.print("수1 : ");
        int n1 = sc.nextInt();

        System.out.print("수2 : ");
        int n2 = sc.nextInt();

        if( n1 > n2 ){
            int n3 = n1;
            n1 = n2;
            n2 = n3;
        }

        for( int i = n1; i >= 1; i-- ){

            if( n1 % i == 0 && n2 % i == 0 ){
                System.out.println("최대공약수 : " + i);
                break;
            }

        }

        System.out.println("----------------------");

        while( n2 != 0 ){
            int tmp = n1 % n2;
            n1 = n2;
            n2 = tmp;
        }

        System.out.println("최대공약수 : " + n1);

    }
    
}
