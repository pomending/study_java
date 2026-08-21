package ex7_work;

public class WorkMain {

    public static void main(String[] args) {
        
        //가장 큰 값 : 20
        int[] arr = {1, 11, 7, 20, 13, 15};

        WorkSub ws = new WorkSub();
        int max = ws.findMax(arr);

        System.out.println("가장 큰 값 : " + max);

    }
    
}
