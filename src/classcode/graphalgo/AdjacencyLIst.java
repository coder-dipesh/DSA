package classcode.graphalgo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class AdjacencyLIst {

    int vertices=5;
    LinkedList1 [] listd=new LinkedList1[vertices];

    AdjacencyLIst(){

        for(int i=0;i<vertices;i++) {

            listd[i]=new LinkedList1();
        }

    }


    public void addEdge(int source, int destination) {

        listd[source].addNode(destination);
        listd[destination].addNode(source);


    }

    public void printGraph() {

        for(int i=0;i<vertices;i++) {

            System.out.print(i +" is connected to : ");
            for(int j=1; j<=listd[i].getSize();j++) {

                System.out.print(listd[i].getDataByIndx(j)+" ");
            }
            System.out.println("");
        }
    }

    //getadjNodes(0) i=0
    public List<Integer> getadjNodes(int i){
        ArrayList<Integer> adjlist=new ArrayList<Integer>();
        for(int j=1; j<=listd[i].getSize();j++) {
            // System.out.print(listd[i].getDataByIndx(j)+" ");
            adjlist.add(listd[i].getDataByIndx(j));
        }

        return adjlist;
    }




    public void BFS(int rootnode) {

        QueuesTest queue=new QueuesTest();
        boolean visited[]= new boolean[5];

        queue.enqueue(rootnode);
        visited[rootnode]=true;

        while(!queue.isEmpty()) {

            int x=queue.dequeue();
            System.out.println(x);
//get adj nodes [1,2]
            Iterator<Integer> iterator=getadjNodes(x).iterator();
            while(iterator.hasNext()) {
                int adjval=iterator.next();
                if(!visited[adjval]) {
                    queue.enqueue(adjval);
                    visited[adjval]=true;
                }
            }



        }

    }




    public void DepthFirstSearch(int rootnode) {
        boolean visited[]=new boolean[5];
        dfs(rootnode,visited);
    }



    public void dfs(int rootnode, boolean [] visited) {
        visited[rootnode]=true;
        System.out.println(rootnode);

        Iterator<Integer> iterator=getadjNodes(rootnode).iterator();
        while(iterator.hasNext()) {
            int adjval=iterator.next();
            if(!visited[adjval]) {
                dfs(adjval,visited);
            }
        }

    }


    public static void main(String [] args) {

        AdjacencyLIst graph=new AdjacencyLIst();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
        graph.BFS(0);
        graph.DepthFirstSearch(0);
    }



}