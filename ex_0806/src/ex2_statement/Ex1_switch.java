package ex2_statement;

public class Ex1_switch {

    public static void main(String[] args) {
        
        //switch-case문
        //비교값과 조건값을 통해서 원하는 결과를 얻어내기 위한 제어문
        //특정 값을 바로 찾아서 실행하기 때문에 else-if에 비해 속도가 빠르다
        //switch문의 비교값으로는
        //1. 정수( byte, short, int ) // long은 안됨
        //2. 문자열(String)
        //3. 문자(char)

        //switch( 비교값 ){
        //  case 조건값:
        //      비교값과 조건값이 일치할 때 실행되는 영역
        //      break;
        //}

        int n = 4;

        switch( n ){ //비교값

            //case 1:
            //  break;-> 똑같은 조건 여러개면 에러

            case 1:  //조건값
                System.out.println("게임시작");
                break;

            case 2:
                System.out.println("설정");
                break;

            case 3:
                System.out.println("종료");
                break;

            default:
                //비교값과 일치하는 조건값이 하나도 없을 때
                //반드시 호출되는 영역
                System.out.println("올바른 값을 입력하세요");
                break;   

        }

    }
    
}
