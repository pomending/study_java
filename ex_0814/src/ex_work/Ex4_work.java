package ex_work;

import java.util.Scanner;

public class Ex4_work {
    
    public static void main(String[] args) {
        
        //키보드에서 입력받은 OX값을 계산하여 출력하기
        //-------------------
        //입력 : ooxxo
        //결과 : 4

        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        String ox = sc.next();

        String[] o = ox.split("x");
        int total = 0;

        for( int i = 0; i < o.length; i++ ){

            int res = 0;

            for( int j = 1; j <= o[i].length(); j++ ){

                res += j;

            }

            total += res;

        }

        System.out.println("결과 : " + total);

        System.out.println("------------------");

        int count = 0;
        int total2 = 0;

        for( int i = 0; i < ox.length(); i++ ){

            if( ox.charAt(i) == 'o' ){
                count++;
                total2 += count;
            }         
            else if( ox.charAt(i) == 'x' ){
                count = 0;            
            }

        }

        System.out.println("결과 : " + total2);

    }

}
