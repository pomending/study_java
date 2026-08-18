package ex2_work;

import java.util.Scanner;

public class Ex3_work {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        String input = sc.next();
        
        System.out.print("찾을 문자 : ");
        String find = sc.next();

        int cnt = 0;

        for ( int i = 0; i < input.length(); i++ ){

            if( input.substring( i, i + 1 ).equals(find) )
                cnt++;

        }

        System.out.printf("문자 %s의 개수 : %d개\n", find, cnt);

    }
    
}
