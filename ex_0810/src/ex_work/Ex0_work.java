package ex_work;

import java.util.Scanner;

public class Ex0_work {
    
    public static void main(String[] args) {

        //1부터 n까지 한줄당 perRow개 숫자 출력
        
        Scanner sc = new Scanner(System.in);
        int n;
        int perRow;
        int count = 1;

        System.out.print("몇까지? : ");
        n = sc.nextInt();
        System.out.print("한줄당 : ");
        perRow = sc.nextInt();

        for( int i = 0 ; i <= n / perRow ; i++){

            for( int j = 1 ; j <= perRow ; j++){

                if( count <= n ){
                System.out.printf("%d ", count);
                count++;
                }

            }

            System.out.println();

        }

    }

}
