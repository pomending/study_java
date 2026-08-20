package ex03_work;

import java.util.Scanner;

public class Atm {

    // 입금

    // 출금

    // 잔액확인

    Scanner sc = new Scanner(System.in);

    private int money;

    public void showMenu() {
        System.out.println("1.입    금");
        System.out.println("2.출    금");
        System.out.println("3.잔액확인");
        System.out.println("etc.종료");
        System.out.print(">> ");
    }

    public int deposit(int money) {
        System.out.print("입금액 : ");
        this.money = sc.nextInt();
        money += this.money;
        System.out.println("입금성공");
        System.out.println("--------------");
        return money;
    }

    public int withdraw(int money) {
        System.out.print("출금액 : ");
        this.money = sc.nextInt();

        if (money >= this.money) {
            money -= this.money;
            System.out.println("출금성공");

        } else {
            System.out.println("잔액이 부족합니다");

        }
        System.out.println("--------------");
        return money;

    }

    public void balance(int money) {
        System.out.println("-----------");
        System.out.println(money + " 원");
        System.out.println("-----------");

    }

    /* 

    private int money;

    public void deposit(int money){
        this.money += money;
    }
    
    public void withdraw(int money){
        if(this.money < money)
            syso("잔액부족");
        else{
            syso("출금성공");
            this.money -= money;    
        }
    }

    public void balance(){
        syso(money);
    }

    */

}
