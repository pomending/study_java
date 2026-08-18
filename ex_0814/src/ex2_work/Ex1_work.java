package ex2_work;

import java.util.Random;
import java.util.Scanner;

public class Ex1_work {

    public static void main(String[] args) {
        
        //1 ~ 9사이의 중복되지 않는 난수 3개
        //같은 자리, 같은 숫자 : Strike
        //다른 자리, 같은 숫자 : Ball
        //셋다 다른 숫자 : OUT
        //몇회에 정답 맞췄는지 체크 (4회 정답 !! - 142)

        Scanner sc = new Scanner(System.in);

        int[] que = new int[3];
        
        outer : for( int i = 0; i < que.length; ){

            que[i] = new Random().nextInt(9) + 1;

            for( int j = 0; j < i; j++ ){

                if( que[i] == que[j] )
                    continue outer;

            }

            i++;

        }

        int[] ans = new int[3];
        int count = 0;
        
        while( true ){

            count++;

            int strike = 0;
            int ball = 0;

            System.out.print("세자리 수를 입력하세요(예:123) - ");
            int input = sc.nextInt();
            ans[0] = input / 100;
            ans[1] = ( input / 10 ) % 10;
            ans[2] = input % 10;

            out : for( int i = 0; i < ans.length; i++ ){

                for( int j = 0; j < que.length; j++ ){

                    if( ans[i] == que[i] ){
                        strike++;
                        continue out;
                    }else if( ans[i] == que[j] ){
                        ball++;
                    }

                }

            }

            if( strike == 0 && ball == 0 ){
                System.out.println("OUT!");
                
            }else if( strike == 3 ){
                System.out.printf("%d회 정답 !! - %d%d%d", count, ans[0], ans[1], ans[2]);
                break;
                
            }else{
                System.out.printf("%d Strike, %d Ball\n", strike, ball);
                
            }


        }

    }
    
}
