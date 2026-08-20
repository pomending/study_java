package ex07_work;

public class GraphSub {

    private String[] graph = new String[10];
    //private StringBuffer[] graph = new StringBuffer[10];

    public String[] makeGraph( int[] random ){
    //public StringBuffer[] makeGraph( int[] random ){

        for( int i = 0; i < graph.length; i++ ){

            int count = 0;
            graph[i] = (i + "의 갯수 : ");
            //graph[i].append(i + "의 갯수 : ");

            for( int j = 0; j < random.length; j++ ){

                if( random[j] == i ){
                    count++;
                    graph[i] += "#";
                    //graph[i].append("#");
                }
                
            }

            graph[i] += " " + count;
            //graph[i].append(" " + count);

        }

        return graph;
        //return graph;

    }
    
}
