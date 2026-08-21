package ex6_work;

import java.util.Scanner;

public class WorkMain {

    public static void main(String[] args) {
        
        //정수 : 9
        //9은(는) 소수가 아닙니다
        //정수 : 7
        //7은(는) 소수입니다

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 : ");
        int num = sc.nextInt();

        Prime prime = new Prime();

        if( prime.isPrime(num) )
            System.out.println(num + "은(는) 소수입니다");
        else
            System.out.println(num + "은(는) 소수가 아닙니다");

    }
    
}
