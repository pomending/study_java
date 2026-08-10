public class Ex9_multi_for {

    public static void main(String[] args) {
        
        /*
                *
              * * *       
            * * * * *        
          * * * * * * *
        * * * * * * * * *
        
        */

        for( int i = 1; i <= 5; i++ ){

            for( int j = 1; j <= i + 4; j++ ){

                System.out.print( (j > 5 - i) ? "* " : "  ");

            }

            System.out.println();

        }

    }
    
}
