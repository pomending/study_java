package ex06_overload;

public class Bread {

    //메서드 1
    public void makeBread(){
        System.out.println("빵을 만들었습니다");

    }
    
    //메서드 2
    public void makeBread( int n ){

        for( int i = 0; i < n; i++ ){

            System.out.println("빵을 만들었습니다");

        }
        
        System.out.println("요청하신 " + n + "개의 빵을 만들었습니다");

    }

    //메서드 3
    public void makeBread( int n, String name ){

        for( int i = 0; i < n; i++ ){

            System.out.println(name + "빵을 만들었습니다");

        }

        System.out.println("요청하신 " + n + "개의 " + name + "빵을 만들었습니다");

    }

}
