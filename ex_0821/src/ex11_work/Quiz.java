package ex11_work;

import java.util.Random;

public class Quiz {

    Random rnd = new Random();

    public String makeQuiz( String[] strArr ){ 

        System.out.print("문제 : ");

        String word = strArr[rnd.nextInt(4)];
        int[] order = new int[word.length()];

        outer : for( int i = 0; i < word.length(); ){

            order[i] = rnd.nextInt(word.length());

            for( int j = 0; j < i; j++ ){
                if(order[i] == order[j])
                    continue outer;
            }

            System.out.print(word.charAt(order[i]));
            i++;

        }

        System.out.println();

        return word;

    }
    
}
