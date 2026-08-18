package ex_work;

import java.util.Random;
import java.util.Scanner;

public class Ex1_baseball {

    public static void main(String[] args) {
        
        //키보드에서 받아야 되는 값이 있으므로
        Scanner sc = new Scanner(System.in);

        //정답용 숫자 3개 배열 생성
        int[] com = new int[3];
        //입력받을 숫자 3개 배열 생성
        int[] user = new int[3];

        //정답 생성 시작(무작위 서로 다른 숫자 3개 생성)
        outer : for( int i = 0; i < com.length; ){

            //1 ~ 9 정수 하나 생성
            com[i] = new Random().nextInt(9) + 1;

            //반복문으로 앞에 같은게 있는지 확인
            for( int j = 0; j < i; j++ ){

                //앞에 같은 숫자가 있다면 
                if( com[i] == com[j] )
                    //outer 처음으로 돌아가서 다시 숫자 생성
                    //증감식이 없어서 같은 자리에 만든다
                    continue outer;

            }
            
            //continue를 안만났다면 같은 숫자가 없다는 뜻이므로 i 증가해서 다시 outer 수행
            i++;

        }

        //몇 회만에 맞추는지 변수, while문 돌면서 계속 초기화 안되게 밖에 생성
        int cnt = 0;
        
        //맞출때까지 무한반복
        while(true){

            //반복문이 몇번 돌았는지 확인 위해 시작에 카운트 증가
            cnt++;

            //키보드로 입력받을 예정
            System.out.print("입력(예:123) : ");

            //세자리 숫자 입력받음
            int number = sc.nextInt();

            //100으로 나눈 몫(=백의 자리)이 user[0]
            user[0] = number / 100;
            //10으로 나눈 후 일의 자리(=십의 자리)가 user[1]
            user[1] = number / 10 % 10;
            //그냥 일의 자리가 user[2]
            user[2] = number % 10;

            //스트라이크와 볼 숫자 셀 변수 
            int strike = 0;
            //while문 돌때마다 0부터 시작되게 안에서 cnt와 다르게 안에서 초기화
            int ball = 0;

            //정답인 3개 숫자를 각각 맞춰보기 위해
            for( int i = 0; i < user.length; i++ ){

                //정답 숫자 한번마다 내가 입력한 세 숫자를 확인
                for( int j = 0; j< user.length; j++ ){

                    //같은 자리에서
                    if( i == j ){
                        //숫자가 같다면
                        if( com[i] == user[j] )
                            //strike 판정
                            strike++;

                    //다른 자리에서
                    }else{
                        //숫자가 같다면
                        if( com[i] == user[j] )
                            //ball 판정
                            ball++;
                    }

                }

            }

            //스트라이크가 3개면
            if( strike == 3 ){
                //정답이므로 정답인 숫자와 
                System.out.println("정답! - " + com[0] + com[1] + com[2]);
                //몇번만에 맞췄는지 출력하고 
                System.out.println(cnt + "회 클리어");
                //while문 종료
                break;

            //3스트라이크가 아니라면 더 반복해야함
            }else{

                //strike, ball중 하나라도 있다면
                if( strike > 0 || ball > 0 ){
                    //그 갯수를 출력해서 힌트를 주고 다시 while문 시작
                    System.out.printf("%d Strike, %d Ball\n", strike, ball);

                //else는 strike, ball 둘다 0이라는 뜻
                }else{
                    //out이므로 다른 숫자 써서 맞춰보라는 힌트를 주고 다시 while문 시작
                    System.out.println("OUT!");

                }

            }

            //가독성용
            System.out.println("--------------------");

        }

    }
    
}
