package classcode.graphalgo;

public class AdjList {
    LinkedListTest[] list;
    int size;

    AdjList(int v){
        list=new LinkedListTest[v];
        this.size=v;
        for(int i=0;i<v;i++){
            list[i] =new LinkedListTest();
        }
    }


    public void addEdge(int source,int destination){
        list[source].addNode(destination);
        list[destination].addNode(source);
    }

    public void printGraph(){
        for(int i=0;i<size;i++){
            System.out.print(i+ " is connected to ");
            if(list[i].getSize()>0){
                for(int j=1;j<=list[i].getSize();j++){
                    System.out.print(list[i].getDataAtAnyPos(j)+" ");
                }
            }
            System.out.println("");
        }
    }


    public static void main(String [] args){
        AdjList a=new AdjList(4);
        a.addEdge(0,1);
        a.addEdge(0,2);
        a.addEdge(0,3);
        a.addEdge(2,3);
        a.printGraph();
    }
}