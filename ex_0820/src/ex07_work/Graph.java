package ex07_work;

import java.util.Random;

public class Graph {

    public static void main(String[] args) {
        
        //0 ~ 9사이의 난수를 100개 발생시키고
        //각 숫자가 몇개씩 만들어졌는지를 그래프화 하시오
        //--------------------
        //0의 갯수 : ############ 12
        //1의 갯수 : ####### 7
        //...
        //9의 갯수 : ########## 10

        int[] random = new int[100];

        for( int i = 0; i < random.length; i++ ){
            random[i] = new Random().nextInt(10);
        }

        GraphSub gs = new GraphSub();

        String[] graph = gs.makeGraph(random);
        //StringBuffer[] graph = gs.makeGraph(random);

        for( int i = 0; i < graph.length; i++ ){
            //syso(graph[i].toString());
            System.out.println(graph[i]);
        }

    }
    
}
