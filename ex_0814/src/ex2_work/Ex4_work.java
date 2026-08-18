package ex2_work;

import java.util.Scanner;

public class Ex4_work {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        String input = sc.next();

        System.out.print("비교할 문자 : ");
        String comp = sc.next();

        char[] find = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

        int cnt = 0;

        boolean f = false;
        boolean b = false;

        for( int i = 0; i < input.length(); i++ ){

            if( i == 0 || i == input.length() - 1 ){

                if( input.substring( i, i + 1 ).equalsIgnoreCase(comp) )
                    f = true;

            }

            for( int j = 0; j < find.length; j++ ){

                if( input.charAt(i) == find[j] )
                    cnt++;

            }
            
        }

    }
    
}
