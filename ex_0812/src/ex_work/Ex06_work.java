package ex_work;

import java.util.Scanner;

public class Ex06_work {

    public static void main(String[] args) {

        // 키보드에서 정수를 10개 입력받아 배열에 담고
        // 가장 많이 등장한 정수와 등장 횟수를 출력
        // -----------------------
        // 정수 :
        // 1
        // 1
        // 2
        // 2
        // 2
        // 3
        // 4
        // 2
        // 5
        // 6
        // 가장 많이 등장한 숫자 : 2
        // 등장 횟수 : 4

        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];

        System.out.println("정수 : ");

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
  
        int count = 0;
        int max = 0;

        for (int i = 0; i < num.length; i++) {

            int same = 0;

            for (int j = 0; j < num.length; j++) {

                if (num[i] == num[j])
                    same++;

            }

            if( same > count ){

                count = same;
                max = num[i];

            }

        }

        System.out.println("가장 많이 등장한 숫자 : " + max);
        System.out.println("등장횟수 : " + count);

    }

}
