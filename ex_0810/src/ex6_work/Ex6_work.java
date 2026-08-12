package ex6_work;

import java.util.Scanner;

public class Ex6_work {

    public static void main(String[] args) {
        
        //키보드에서 출력될 수열의 갯수를 지정하고
        //피보나치수열대로 결과 보여주기
        //-------------
        //입력 : 8
        //1 1 2 3 5 8 13 21

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int count = sc.nextInt();

        int n1 = 1;
        int n2 = 1;

        for( int i = 1; i <= count ; i++ ){

            System.out.print(n1 + " ");
            int n3 = n1;
            n1 = n2;
            n2 += n3;

        }
        /*
        int n1 = 1;
        int n2 = 0;
        int n3 = 0;

        for( int i = 0; i < count; i++ ){
            n2 = n3;
            n3 = n1;
            n1 = n2 + n3;
            System.out.print( n3 + " " );
        }
        */

    }
    
}
