package ex11_work;

import java.util.Scanner;

public class WorkMain {

    public static void main(String[] args) {

        //문제 : PEALP
        //>> ealpp
        //ealpp 오답
        //>> apple
        //apple 정답!!

        Scanner sc = new Scanner(System.in);
        
        String[] strArr = { "APPLE", "ORANGE", "HOPE", "VIEW" };

        Quiz q = new Quiz();

        String quiz = q.makeQuiz(strArr);

        while( true ){

            System.out.print(">> ");
            String ans = sc.next();

            if( ans.equalsIgnoreCase(quiz) ){
                System.out.println(ans + "정답!!");
                break;                
            }else
                System.out.println(ans + "오답");

        }
        

    }
    
}
