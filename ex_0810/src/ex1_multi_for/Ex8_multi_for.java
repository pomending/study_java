public class Ex8_multi_for {

    public static void main(String[] args) {
        
        /*
        1 2 3 4 5 6 7 8 9 10
        2 3 4 5 6 7 8 9 10 1
        3 4 5 6 7 8 9 10 1 2
        ...
        10 1 2 3 4 5 6 7 8 9
        */

        for( int i = 1; i <= 10; i++ ){

            for(int j = 0; j < 10; j++){

                System.out.print(( i + j < 11? ( i + j ) : ( i + j - 10)) + " ");

            }

            System.out.println();

        }

    }
    
}
