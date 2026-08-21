package ex10_work;

public class WorkSub {

    public int[][] square(int size) {

        int[][] square = new int[size][size];

        int x = (size - 1) / 2;
        int y = 0;

        for (int i = 1; i <= size * size; i++) {

            square[y][x] = i;

            if( i % size == 0 )
                y++;
            else {
                x++;
                y--;

                if( x == size )
                    x = 0;

                if( y < 0 )
                    y = size - 1;
                
            }

        }

        return square;

    }

}
