package ex7_work;

import java.util.Random;

public class UpdownSub {

    private int ans = new Random().nextInt(50) + 1;
    private int count = 0;

    public int getCount(){
        return count;
    }

    public String checkUpDown( int num ){

        count++;

        if( num > ans )
            return "DOWN";
        else if ( num < ans )
            return "UP";
        else 
            return "회 만에 정답";

    }
    /*
    
    private boolean result = true;

    public boolean check( int n ){
    
        count++;
        if( n < random )
            syso("UP");

        else if( n > random )
            syso("DOWN");

        else{
            syso(count + "회 만에 정답");
            result = false;    
        }

        return result;

    }
    
    */
    
}
