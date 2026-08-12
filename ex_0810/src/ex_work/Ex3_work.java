package ex_work;

import java.util.Scanner;

public class Ex3_work {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("A : ");
        int a = sc.nextInt();
        System.out.print("B : ");
        int b = sc.nextInt();
        System.out.print("V : ");
        int v = sc.nextInt();
        int up = 0;

        for( int i = 1; i <= v; i++ ){

            up += a;

            if( up >= v ){
                System.out.println(i + "일 걸림");
                break;
            } else
                up -= b;

        }

    }


    
    
}
