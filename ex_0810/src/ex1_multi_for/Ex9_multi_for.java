public class Ex9_multi_for {

    public static void main(String[] args) {
        
        /*
                *
              * * *       
            * * * * *        
          * * * * * * *
        * * * * * * * * *
        
        */

        for( int i = 5; i <= 9; i++ ){

            for( int j = 1; j <= i; j++ ){

                System.out.print( ( j + i > 9 ) ? "* " : "  ");

            }

            System.out.println();

        }

    }
    
}
