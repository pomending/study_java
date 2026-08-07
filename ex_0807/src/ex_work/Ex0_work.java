package ex_work;

public class Ex0_work {

    public static void main(String[] args) {

        /*
         * 1 ~ 100 사이의 모든 숫자 중에서 다음 조건을 만족하는 값만 한 줄에 5개씩 출력하세요:
         * - 2의 배수이면서 3의 배수는 아닌 숫자
         * (for, if 사용)
         */

        int num = 0;

        for (int i = 1; i <= 100; i++) {
            if ((i % 2 == 0) && (i % 3 != 0)) {
                System.out.print(i + " ");
                num++;
                if (num % 5 == 0) {
                    System.out.println();
                }
            }
        }

        System.out.println();
        System.out.println("----------------");

        /*
         * 연습문제 2.
         * 100~999 사이의 세 자리 수 중에서,
         * 각 자리 숫자가 모두 다르고,
         * 각 자리의 수 중 최대값이 7인 숫자만 출력하세요.
         * (for, if, switch 사용)
         */

        int count = 0;
        int count1 = 0;
        int count10 = 0;
        int count100 = 0;
        int max = 0;

        for (count = 100; count <= 999; count++) {
            count100 = count / 100;
            count10 = (count / 10) % 10;
            count1 = count % 10;
            
            if ((count1 != count10) && (count10 != count100) && (count1 != count100)) {
                if (count1 > count10) {
                    if (count1 > count100) {
                        max = count1;
                    } else {
                        max = count100;
                    }
                } else if (count10 > count100) {
                    max = count10;
                } else {
                    max = count100;
                }
                if (max == 7) {
                    System.out.println(count);
                }
            }
        }

    }

}
