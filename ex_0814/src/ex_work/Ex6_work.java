package ex_work;

import java.util.Scanner;

public class Ex6_work {

    public static void main(String[] args) {

        // 문장 : abcab
        // 결과 : abc

        Scanner sc = new Scanner(System.in);

        System.out.print("문장 : ");
        String str = sc.next();

        int count = 0;

        for( int i = (int)'a'; i < (int)'z'; i++ ){

            if( str.indexOf(i) > -1 ){
                count++;
            }

        }

        for( int i = 0; i < str.length(); i++ ){

            String check = str.substring(0, i + 1);
            if(check.indexOf(check.charAt(i)) == check.lastIndexOf(check.charAt(i))){

                System.out.print(check.charAt(i));

            }

        }

        System.out.println();
        String res = "";

        for( int i = 0; i < str.length(); i++ ){

            char curr = str.charAt(i);

            if( res.indexOf(curr) == -1 ){

                res += curr;

            }

        }

        System.out.println("결과 : " + res);

    }

}
