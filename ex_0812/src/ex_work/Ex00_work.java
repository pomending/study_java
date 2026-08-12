package ex_work;

public class Ex00_work {

    public static void main(String[] args) {

        int[] arr = { 4, 13, 7, 19, 1, 15, 21, 13, 7 };
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

        for (int i = 0; i < arr.length; i++) {
            System.out.print(res[i] + " ");
        }

    }

}
