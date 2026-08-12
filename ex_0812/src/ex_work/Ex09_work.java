package ex_work;

import java.util.Random;

public class Ex09_work {

    public static void main(String[] args) {

        // 1 ~ 45사이의 중복되지 않는 난수 6개를 출력하는
        // 로또번호 생성기 만들기
        // ------------------
        // 17 2 45 27 9 11
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {

            int same = 0;

            do {

                same = 0;

                lotto[i] = new Random().nextInt(45) + 1;

                for (int j = 0; j < lotto.length; j++ ) {
                    if (lotto[i] == lotto[j])
                        same++;
                }

            }while(same >= 2);

            System.out.print(lotto[i] + " ");    

        }

    }

}
