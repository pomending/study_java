package computer;

public class ComMain {

    public static void main(String[] args) {
        
        Computer c1 = new Computer(); //명시적 객체 생성
        c1.ssd = 1024;
        c1.cpu = 3.5f;
        c1.color = "black";
        //private변수 brand로는 접근이 불가
        //c1.brand = "apple";
        c1.info();

        Computer c2 = new Computer();
        c2.info();

    }
    
}
