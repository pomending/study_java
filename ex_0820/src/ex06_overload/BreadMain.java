package ex06_overload;

public class BreadMain {
    
    public static void main(String[] args) {
        
        //빵을 만들었습니다  <-- 메서드1 호출
        //-------------------
        //빵을 만들었습니다
        //빵을 만들었습니다
        //요청하신 2개의 빵을 만들었습니다 <-- 메서드2 호출
        //-------------------
        //크림빵을 만들었습니다
        //크림빵을 만들었습니다
        //요청하신 2개의 크림빵을 만들었습니다 <-- 메서드3 호출

        Bread b = new Bread();

        b.makeBread();
        System.out.println("-------------");
        b.makeBread(3);
        System.out.println("-------------");
        b.makeBread(4, "피자");

    }

}
