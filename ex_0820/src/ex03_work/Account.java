package ex03_work;

import java.util.Scanner;

public class Account {
        
    public static void main(String[] args) {
        
        /*
        1.입    금
        2.출    금
        3.잔액확인
        etc.종료
        >> 1
        ---입  금---
        입금액 : 1000
        입금성공
        -----------
        1.입    금
        2.출    금
        3.잔액확인
        etc.종료
        >> 3
        ---잔액확인---
        1000원
        -------------
        1.입    금
        2.출    금
        3.잔액확인
        etc.종료
        >> 5
        atm 사용을 종료합니다

        */

        Scanner sc = new Scanner(System.in);

        int money = 0;

        Atm atm = new Atm();

        while( true ){

            atm.showMenu();
            int choice = sc.nextInt();

            if( choice == 1 ){
                money = atm.deposit(money);

            }else if( choice == 2 ){
                money = atm.withdraw(money);

            }else if( choice == 3 ){
                atm.balance(money);

            }else{
                System.out.println("atm 사용을 종료합니다");
                break;
            }

        }

        /*

        Atm atm = new Atm();
        
        while( true ){

            atm.showMenu();
            int select = sc.nextInt();
            int money = 0;

            switch(select){
                case 1:
                    syso("입금");
                    syso("입금액 : ");
                    money = sc.nextInt();
                    atm.deposit(money);
                    break;

                case 2:
                    syso("출금");
                    syso("출금액 : ");
                    money = sc.nextInt();
                    atm.withdraw(money);
                    break;

                case 3:
                    atm.balance();
                    break;

                default:
                    System.out.println("atm 종료");
                    return;

            }

            System.out.println("-------------");

        }

        */

    }
    
}
