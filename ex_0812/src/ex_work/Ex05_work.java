package ex_work;

import java.util.Scanner;

public class Ex05_work {

    public static void main(String[] args) {
        
        //학생 수를 입력하세요 : 3
        //학생 1의 성적 : 90
        //학생 2의 성적 : 73
        //학생 3의 성적 : 84
        //-------------
        //평균 성적 : 82.~
        //------------
        //---평균 이상인 학생들---
        //=> 학생1: 90
        //=> 학생3: 84
        //평균 이상인 학생 수 : 2

        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요 : ");
        int num = sc.nextInt();

        int[] point = new int[num];
        int sum = 0;
        float avg = 0;
        int up = 0;

        for( int i = 0; i < num; i++ ){

            System.out.printf("학생%d의 성적 : ", i + 1);
            point[i] = sc.nextInt();
            sum += point[i];

        }

        avg = sum / (float)num;
        System.out.println("-----------------------");
        System.out.println("평균 성적 : " + avg);
        System.out.println("---평균 이상인 학생들---");

        for ( int i = 0; i < num; i++ ){
            if( point[i] >= avg ){
                up++;
                System.out.println("=> 학생 " + (i + 1) + " : " + point[i]);
            }

        }

        System.out.println("평균 이상인 학생 수 : " + up);

    }
    
}
