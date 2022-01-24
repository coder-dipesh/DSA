package classcode;

import classcode.graphalgo.LinkedList1;
import classcode.graphalgo.QueuesTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GraphTest {

    int[][] matrix;
    int size;

    // asking user value at the time of class calling
    GraphTest(int v){
        this.matrix = new int[v][v];
        size=v;
    }

    // Node ko bich ko connection rakhna  lai edge vanxa.
    public void addEdge(int source, int destination){
        matrix[source][destination]=1;
        matrix[destination][source]=1;
    }

    public void printMatrix(){
        //visiting rows
        for(int row=0; row<size; row++ ){
            //visiting column
            for(int col=0; col<size; col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    // Printing graph
    public void printGraph(){
        for (int row=0; row<size; row++ ){
            System.out.print(row + " is connected to: ");

            for (int col=0; col<size; col++){
                if (matrix[row][col]!=0){
                    System.out.print(col+ " ");
                }
            }
            System.out.println(" ");
        }
    }

    public List<Integer> getadjNodes(int i){
        ArrayList<Integer> adjlist=new ArrayList<Integer>();
        for(int j=1; j<=listd[i].getSize();j++) {
            adjlist.add(listd[i].getDataByIndx(j));
        }

        return adjlist;
    }


    // MODIFIED BFS Algo with calculation of Distance
    public void shortestDistance(int source , int destination){

        int [] distance = new int[size];
        int [] path = new int[size];

        boolean [] visited = new boolean[size];

        QueuesTest queue = new QueuesTest();

        for (int i=0; i<size; i++){
            distance[i]=-1;
            path[i]=-1;

        }
        distance[source]=0;
        queue.enqueue(source);
        visited[source] = true;

        while(!queue.isEmpty()){
            int u = queue.dequeue();

            Iterator<Integer> iterator = getadjNodes(u).iterator();
            while (iterator.hasNext()){
                int v = iterator.next();

                if (!visited[v]){
                    distance[v] = distance[u] + 1;
                    path[v] = u;
                    queue.enqueue(v);
                    visited[v] = true;
                }

            }
        }
        System.out.println("Distance from source " + source + " to destination " + destination + " is: " );
        System.out.print(distance[destination]);

        // To print PATH
        LinkedList1 prevPath =  new LinkedList1();
        prevPath.addNode(destination);
        int crawl = destination;

        while (path[crawl] != -1){
            prevPath.addNode(path[crawl]);
            crawl = path[crawl];
        }

        System.out.println(" ");
        System.out.print("and the shortest path is: ");
        for (int i = prevPath.getSize(); i>0 ;i--){
            System.out.println(prevPath.getDataByIndx(i)+" ");
        }


    }

    public static void main(String[] args) {
        GraphTest g = new GraphTest(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,2);
        g.addEdge(1,3);

        g.printMatrix();
        System.out.println("Printing Graph");
        g.printGraph();

    }

}
