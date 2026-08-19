package ex_work;

import java.util.Scanner;

public class Ex1_1_work {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        String str = sc.next();

        StringBuffer sb = new StringBuffer( str );

        //원본을 뒤집어서 저장할 객체
        String rev = sb.reverse().toString();

        // for( int i = str.length() - 1; i >= 0; i-- ){

        //     rev += str.charAt(i);

        // }

        if ( str.equals( rev ) ){
            System.out.println(str + "은 회문");
        }else{
            System.out.println(str+ "은 안회문");
        }
        
    }

    
    
}
