package ex_work;

import java.util.Scanner;

public class Ex3_work {

    public static void main(String[] args) {
        
        //키보드에서 나이와 키를 입력을 받는다
        //나이가 15세 이상이거나 키가 150cm이상이면 탑승가능
        //그렇지 않으면 탑승불가를 출력
        
        //나이 : 14
        //키 : 140
        //탑승불가

        Scanner sc = new Scanner(System.in);
        int age;
        int height;
        String res = "";

        System.out.print("나이 : ");
        age = sc.nextInt();
        System.out.print("키 : ");
        height = sc.nextInt();

        if( age >= 15 || height >= 150 ){
            res = "탑승가능";

        } else{
            res = "탑승불가";

        }
        System.out.println(res);
        
    }
    
}
