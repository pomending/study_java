public class Ex2_for {

    public static void main(String[] args) {
        
        //1 ~ 10까지의 정수들 중에서 홀수의 합만 계산하여 출력
        //-----------
        //결과 : 25

        int total = 0;

        for( int i = 1; i <= 10; i++){
            if( i % 2 == 1 ){
                total += i;
            }
        }

        System.out.println("결과 : " + total);

        // for( int i = 1; i <= 10; i += 2){total += i} 이런식으로도 될듯

    }
    
}
