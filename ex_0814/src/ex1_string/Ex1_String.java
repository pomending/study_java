package ex1_string;

import java.util.Scanner;

public class Ex1_String {

    public static void main(String[] args) {
        
        //String클래스의 두 가지 특징
        //1) 객체 생성방법이 2가지( 암시적, 명시적 )
        //2) 한 번 생성된 문자열의 내용은 변하지 않는다(immutable)

        String s1 = "abc"; //암시적 객체 생성(String만 가능)
        String s2 = "abc"; //s1와 s2가 주소 공유
        String s3 = new String("abc"); //명시적 객체 생성(new)
        String s4 = new String("abc"); //s3와 s4는 주소 공유x

        //==은 객체간 비교에서는 주소값 비교를 한다
        if( s1 == s3 ){
            System.out.println("주소가 같습니다");
        }else{
            System.out.println("주소가 다릅니다");
        }

        //String 클래스의 불변의 법칙
        String greet = "안녕";
        greet += "하세요"; // 안녕하세요의 메모리가 새로 생기고 주소 이동 후 안녕은 청소
        System.out.println(greet);

        // Scanner sc = new Scanner(System.in);
        // System.out.print("연산자 : ");
        // String op = sc.next();

        // if( op.equals("+") ){  //String끼리는 ==이 아니라 equals 메서드를 이용해 내용 비교
        //     System.out.println("+연산 할게요");
        //}

        
        String st1 = "abc";
        String st2 = "a";
        String st3 = "";
        String st4 = "";
        String st5;
        st2 += "bc";
        st3 += "abc";
        st4 += st1;
        st5 = "abc";

        if( st1 == st2 ){
            System.out.println("st1 == st2");
        }else{
            System.out.println("st1 != st2");
        }
        if( st1 == st3 ){
            System.out.println("st1 == st3");
        }else{
            System.out.println("st1 != st3");
        }
        if( st1 == st4 ){
            System.out.println("st1 == st4");
        }else{
            System.out.println("st1 != st4");
        }
        if( st1 == st5 ){
            System.out.println("st1 == st5");
        }else{
            System.out.println("st1 != st5");
        }

    }
    
}
