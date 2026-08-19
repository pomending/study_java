package ex_work;

import java.util.Scanner;

public class Ex2_1_work {

    public static void main(String[] args) {
        
        String[][] actor = { {"[송강호]", "박쥐", "괴물", "관상"}, 
                             {"[조인성]", "모가디슈", "호프"},
                             {"[이병헌]", "레드", "광해", "놈놈놈"} };

        int cnt = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("검색 : ");
        String name = sc.next();

        Ex2_Sub sub = new Ex2_Sub();
        sub.findActor(actor, name, cnt);

    }
    
}
