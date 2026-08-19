package ex7_work;

import java.util.Random;

public class UpdownSub {

    int ans = new Random().nextInt(50) + 1;

    public String checkUpDown( int num ){

        if( num > ans )
            return "DOWN";
        else if ( num < ans )
            return "UP";
        else 
            return "회 만에 정답";

    }
    
}
