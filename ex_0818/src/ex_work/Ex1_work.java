package ex_work;

import java.util.Scanner;

public class Ex1_work {

    public static void main(String[] args) {
        
        //키보드에서 입력받은 값이 회문인지 판단
        //--------------------
        //입력 : abcba
        //abcba은(는) 회문입니다

        //입력 : abc
        //abc은(는) 회문이 아닙니다

        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        String str = sc.next();

        int i = 0;
        int check = (str.length() + 1) / 2;

        for( ; i < check; i++ ){

            if( str.charAt(i) != str.charAt(str.length() - 1 - i) )
                break;

        }

        System.out.print(str + "은(는) ");

        if( i == check )
            System.out.println("회문입니다");
        else
            System.out.println("회문이 아닙니다");

    }
    
}
