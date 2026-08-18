package ex_work;

import java.util.Scanner;

public class Ex5_work {
    
    public static void main(String[] args) {
        
        //문장 : HelloWorld
        //결과 : Hlool

        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        String str = sc.next();
        System.out.print("결과 : ");
        //String res = ""; if 안에 res += str.charAt(i); 후에 res 출력도 가능

        for( int i = 0; i < str.length(); i++ ){//증감식 i += 2 넣고 if 생략가능

            if( i % 2 == 0 ){

                System.out.print(str.charAt(i));

            }

        }

    }

}
