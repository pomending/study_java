package ex_work;

public class Ex07_work {

    public static void main(String[] args) {
        
        //배열 arr을 오름차순으로 출력
        //----------------
        //11 7 9 20 15 3
        //3 7 9 11 15 20
        int[] arr = {11, 7, 9, 20, 15, 3};
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int count = 0;
            int same = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] > arr[j])
                    count++;
                if (arr[i] == arr[j])
                    same++;

            }

            res[count] = arr[i];
            
            if ( same > 1 ){
                for( int j = 1; j < same ; j++ ){
                    res[count + j] = arr[i];
                }
            }

        }

        for( int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(res[i] + " ");
        }

    }
    
}
