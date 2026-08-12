package ex_work;

import java.util.Random;

public class Ex08_work {

    public static void main(String[] args) {

        // 변수 money에 10 ~ 5000 사이의 난수를 발생시킨다
        // 단 발생한 money는 1의 자리가 반드시 0이 되도록 한다
        // money를 최소한의 동전으로 몇 개씩 거슬러지는지 출력
        // ----------------
        // 금액 : 2590
        // 500원 : 5
        // 50원 : 1
        // 10원 : 4
        int[] coin = { 500, 100, 50, 10 };
        int money = 10 * (new Random().nextInt(500) + 1);
        System.out.println("금액 : " + money);

        for (int i = 0; i < coin.length; i++) {

            int num = 0;

            while (money >= coin[i]) {

                num++;
                money -= coin[i];

            }

            if (num != 0)
                System.out.printf("%d원 : %d\n", coin[i], num);

        }

    }

}
