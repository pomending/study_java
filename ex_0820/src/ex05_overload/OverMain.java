package ex05_overload;

public class OverMain {
    
    public static void main(String[] args) {
        
        OverSub os = new OverSub();

        os.result();
        os.result(100);
        os.result('A');
        os.result("A");
        os.result(1, "A");
        os.result("A", 1); 

        System.out.println();

    }

}
