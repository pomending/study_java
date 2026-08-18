package ex2_work;

import java.util.Scanner;

public class Ex2_work {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("N : ");
        int size = sc.nextInt();

        System.out.print("K : ");
        int num = sc.nextInt();

        int[][] field = new int[size][size];
        int[][] wifi = new int[num][3];

        for (int i = 0; i < num; i++) {

            System.out.printf("r%d : ", (i + 1));
            wifi[i][0] = sc.nextInt();

            System.out.printf("c%d : ", (i + 1));
            wifi[i][1] = sc.nextInt();

            System.out.printf("P%d : ", (i + 1));
            wifi[i][2] = sc.nextInt();

        }

        for (int i = 0; i < num; i++) {

            for (int j = 0; j < size; j++) {

                for (int k = 0; k < size; k++) {

                    int dr = j - wifi[i][0];
                    int dc = k - wifi[i][1];
                    if( dr < 0 )
                        dr *= -1;
                    if( dc < 0 )
                        dc *= -1;
                    if( dr + dc <= wifi[i][2] )
                        field[j][k]++;

                }

            }

        }

        int cnt = 0;

        for( int i = 0; i < size; i++ ){

            for( int j = 0; j < size; j++ ){

                if( field[i][j] == 0 )
                    cnt++;

            }

        }

        System.out.println("빈칸 : " + cnt);

    }

}
