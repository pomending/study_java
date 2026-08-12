public class Ex9_multi_for {

  public static void main(String[] args) {

    /*
               *
             * * *
           * * * * *
         * * * * * * *
       * * * * * * * * *
      
     */

    for (int i = 0; i <= 4; i++) {

      for (int j = 0; j < i + 5; j++) {

        System.out.print(( j + i <= 3 ) ? "  " : "* ");

      }

      System.out.println();

    }

    System.out.println("====================");

    for( int y = 4; y >= 0; y-- ) {

      for( int x = -4; x <= 4; x++ ) {

        System.out.print((y <= x + 4) && (y <= -x + 4) ? "* " : "  ");

      }

      System.out.println();

    }

  }

}
