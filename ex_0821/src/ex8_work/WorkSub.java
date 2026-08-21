package ex8_work;

public class WorkSub {

    int[] coin = {500, 100, 50, 10};

    public void countCoin( int money ){

        System.out.println("금액 : " + money);

        for( int i = 0; i < coin.length; i++ ){

            int count = money / coin[i];

            if( count > 0 )
                System.out.println(coin[i]+ "원 : " + count);

            money %= coin[i];

        }

    }
    
}
