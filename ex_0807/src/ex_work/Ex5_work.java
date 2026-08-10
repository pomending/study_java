package ex_work;

import java.util.Scanner;

public class Ex5_work {

    public static void main(String[] args) {
        
        //정수 n1, n2를 입력받고
        //n1 ~ n2 사이의 합을 출력
        //---------------------
        //수1 : 2
        //수2 : 5
        //결과 : 14
        
        //수1 : 5
        //수2 : 2
        //결과 : 14

        Scanner sc = new Scanner(System.in);
        //int max = 0;
        //int min = 0;
        int sum = 0;

        System.out.print("수1 : ");
        int n1 = sc.nextInt();

        System.out.print("수2 : ");
        int n2 = sc.nextInt();

        //n1과 n2의 값을 교환
        if( n1 > n2 ){
            int n3 = n1;
            n1 = n2;
            n2 = n3;
        }
        

        /*
        int max;
        int min;
        
        if( n1 > n2 ){
            max = n1;
            min = n2;
        } else{
            max = n2;
            min = n1;
        }
            */

        for( int i = n1; i <= n2; i++){
            sum += i;
        }

        System.out.println("결과 : " + sum);

    }
    
}
