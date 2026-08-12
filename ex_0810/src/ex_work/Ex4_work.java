package ex_work;

import java.util.Scanner;

public class Ex4_work {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("월 : ");
        int month = sc.nextInt();
        System.out.print("일 : ");
        int day = sc.nextInt();

        int totalDay = 0;
        int i = 1;

        while (i < month) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    totalDay += 31;
                    break;
                case 2:
                    totalDay += 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    totalDay += 30;
                    break;
            }
            i++;

        }
        totalDay += day;
        System.out.printf("%d월 %d일은 ", month, day);
        switch (totalDay % 7) {
            case 1:
                System.out.println("목요일");
                break;
            case 2:
                System.out.println("금요일");
                break;
            case 3:
                System.out.println("토요일");
                break;
            case 4:
                System.out.println("일요일");
                break;
            case 5:
                System.out.println("월요일");
                break;
            case 6:
                System.out.println("화요일");
                break;
            case 0:
                System.out.println("수요일");
                break;

        }

    }

}
