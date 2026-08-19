package ex4_work;

import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        
        //원본
        String str = sc.next();
        
        CheckWord cw = new CheckWord();
        String rev = cw.check(str);

        if ( str.equals( rev ) ){
            System.out.println(str + "은 회문");
        }else{
            System.out.println(str + "은 안회문");
        }

    }
    
}
