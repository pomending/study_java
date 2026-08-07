import java.util.Scanner;

public class Ex3_for {

    public static void main(String[] args) {
        
        //은행 이자가 하루에 1원씩 추가된다.
        //원금과 예치일수를 키보드에서 입력받고
        //예치기한이 끝났을 때 나의 원금이 얼마가 되어있는지 출력
        //-----------------
        //원금 : 1000
        //예치일 : 5
        //5일 후의 잔액은 1005원 입니다.

        Scanner sc = new Scanner(System.in);
        int money;
        int day;
        
        System.out.print("원금 : ");
        money = sc.nextInt();
        System.out.print("예치일 : ");
        day = sc.nextInt();

        for( int i = 0; i < day; i++ ){
            money++;
        }

        System.out.println(day + "일 후의 잔액은 "+ money + "원 입니다");

    }
    
}
