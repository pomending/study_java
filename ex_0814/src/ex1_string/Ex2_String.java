package ex1_string;

public class Ex2_String {

    public static void main(String[] args) {
        
        String str = "Hong Gil Dong";
        int index = str.length();//메서드는 ()가 있음
        System.out.println("str의 길이 : " + index );

        index = str.indexOf('o');//length만 빼고 무조건 0부터 시작
        System.out.println("맨 처음 문자 o의 위치 : " + index ); //없으면 -1을 리턴

        index = str.indexOf("Gil");
        System.out.println("문자열 Gil의 위치 : " + index );

        index = str.lastIndexOf('o');
        System.out.println("마지막 문자 o의 위치 : " + index );

        char res = str.charAt(6);
        System.out.println("6번째 문자 : " + res);

        String ss = str.substring(1, 6);//1~5까지 자름
        System.out.println("잘라낸 문장 : " + ss);

        String apple = "Apple";
        //equals는 대소문자까지 동일해야만 같은값으로 인정
        if( apple.equals( "apple" ) ){
            System.out.println("사과");
        }

        if( apple.equalsIgnoreCase("apple") ){
            System.out.println("대소문자 상관없이 사과");
        }

        String password = "        1234     ";
        //trim()을 통해 문자열 앞 뒤의 의미없는 공백을 제거
        String pwd2 = password.trim();
        System.out.println(pwd2 + "의 길이 : " + pwd2.length() );

        //문자열로 작성된 숫자형태의 데이터를 실제 숫자로 바꿔주는 메서드
        String number = "100";
        int num = Integer.parseInt(number);
        System.out.println( num + 1 );

        //기본 자료형은 객체가 아니라서 부모 개념의 클래스가 있음(Wrapper)

        //기본자료형의 Wrapper클래스
        //boolean -> Boolean
        //char -> Character
        //byte -> Byte
        //short -> Short
        //int -> Integer
        //long -> Long
        //float -> Float
        //double -> Double

    }
    
}
