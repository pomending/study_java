package ex_work;

import java.util.Scanner;

public class Ex4_1_work {

    public static void main(String[] args) {
        
        //#연산자는 스캐너의 .next()를 사용하자
        //수1 : 10
        //수2 : 20
        //연산자 : +
        //10 + 20 = 30

        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int res = 0;
        int i = 0;
        String oper = "";

        System.out.print("수1 : ");
        n1 = sc.nextInt();

        System.out.print("수2 : ");
        n2 = sc.nextInt();

        System.out.print("연산자 : ");
        oper = sc.next();

        switch(oper){
            case "+":
                res = n1 + n2;
                i++;
                break;

            case "-":
                res = n1 - n2;
                i++;
                break;

            case "*":
                res = n1 * n2;
                i++;
                break;

            case "/":
                System.out.println( n1 + " / " +  n2 + " = " + (n1 / (float)n2));
                break;
            
            default:
                System.out.println("연산자 오류");
                break;
                
        }
        if ( i == 1 ){
        System.out.println( n1 + " " + oper + " " + n2 + " = " + res);
        }

    }
    
}

