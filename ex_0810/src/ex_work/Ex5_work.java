package ex_work;

import java.util.Random;
import java.util.Scanner;

public class Ex5_work {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int com1 = new Random().nextInt(10);
        int com2 = new Random().nextInt(10);
        int com3 = new Random().nextInt(10);

        while (true) {

            System.out.print("수1 : ");
            int my1 = sc.nextInt();

            System.out.print("수2 : ");
            int my2 = sc.nextInt();

            System.out.print("수3 : ");
            int my3 = sc.nextInt();

            int s = 0;
            int b = 0;
            int out = 0;

            if (com1 == my1)
                s++;
            if (com2 == my2)
                s++;
            if (com3 == my3)
                s++;
            if (my1 == com2 || my1 == com3)
                b++;
            if (my2 == com1 || my2 == com3)
                b++;
            if (my3 == com1 || my3 == com2)
                b++;
            out = 3 - s - b;

            if( s != 3 ){
                System.out.printf("%dS %dB %dOUT", s, b, out);
                System.out.println();
            }else{
                System.out.println("3S : 정답");
                break;
            }
        }

    }

}
