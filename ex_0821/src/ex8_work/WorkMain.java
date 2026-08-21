package ex8_work;

import java.util.Random;

public class WorkMain {

    public static void main(String[] args) {
        
        int money = (new Random().nextInt(500) + 1) * 10;

        WorkSub ws = new WorkSub();

        ws.countCoin(money);

    }
    
}
