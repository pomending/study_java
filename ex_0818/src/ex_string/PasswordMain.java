package ex_string;

import java.util.Scanner;

public class PasswordMain {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        /* 
        
        StringValidation pw1 = new StringValidation();

        System.out.print("비밀번호 : ");
        String pw = sc.next();
        pw1.makePassword(pw);

        */

        System.out.print("Java 추출 및 변환 : ");
        String str = sc.next();

        for( int i = 0; i < str.length() - 3; i++ ){

            if( str.substring(i, i + 4).equals("Java") ){
                System.out.println(str.substring(i, i + 4));
            }

        }

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

    }
    
}
