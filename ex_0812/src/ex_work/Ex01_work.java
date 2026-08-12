package ex_work;

import java.util.Scanner;

public class Ex01_work {

    public static void main(String[] args) {
        
        //입력 : 5
        //ABCDE
        
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        int length = sc.nextInt();

        char[] ch;
        ch = new char[length];

        for( int i = 0; i < ch.length; i++){     

            ch[i] = (char)('A' + i);
            System.out.print(ch[i]);

        }

        System.out.println();
        System.out.println("----------------");

        char[] cArr = new char[length];
        char ch2 = 'A';

        for( int i = 0; i < length; i++ ){

            System.out.print( cArr[i] = ch2++ );

        }

    }
    
}
