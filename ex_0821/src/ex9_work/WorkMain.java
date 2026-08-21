package ex9_work;

public class WorkMain {

    public static void main(String[] args) {
        
        //1 ~ 45사이의 중복되지 않는 난수 6개를 출력하는
        //로또번호 생성기 만들기

        int[] lotto = new int[6];

        WorkSub ws = new WorkSub();

        ws.myLotto(lotto); //lotto 배열은 얕은 복사되어 메서드 처리중에 값이 바뀜

    }
    
}
