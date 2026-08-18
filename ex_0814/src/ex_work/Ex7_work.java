package ex_work;

import java.util.Scanner;

public class Ex7_work {
    
    public static void main(String[] args) {
        
        //키보드에서 아무값이나 입력받고
        //숫자인지 아닌지를 판단하기
        //---------------
        //값 : 123
        //123은(는) 숫자입니까? true

        //값 : a12
        //a12은(는) 숫자입니다? false

        Scanner sc = new Scanner(System.in);

        System.out.print("값 : ");
        String str = sc.next();

        int i = 0;
        String numbers = "0123456789";

        out : for( ; i < str.length(); i++ ){

            for( int j = 0; j < 10; j++ ){

                if( str.charAt(i) == numbers.charAt(j) ){
                    continue out;
                }

            }

        }

        System.out.print(str + "은(는) 숫자입니까? ");

        if( i == str.length() )
            System.out.print("true");
        else
            System.out.print("false");

        /* 

        for문이 끝까지 돌았는지 확인

        int i = 0; < i가 for문 밖에 있어서 끝나고 확인 가능

        for( ; i < str.length(); i++ ){

            char ch = str.charAt(i);

            if( ch < '0' || ch > '9' )
                break;

        }

        if( i == str.length() ){}

        */

    }

}
