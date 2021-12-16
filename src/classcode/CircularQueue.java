package classcode;
public class CircularQueue {

 int  front,rear,size;
 int [] queue;

    public CircularQueue(int n) {
    front=rear=-1;
    size=n;
    queue=new int[n];
    }

    public void enqueue(int data){
        if (isFull()){
            System.out.println("Queue Overflow!");
        }
        else {
            if (isEmpty()){
                front=rear=0;
                queue[rear]=data;
            }
            else {
                rear=(rear+1)%size;
                queue[rear]=data;
            }
        }
    }

    public int dequeue(){
        int temp = front;
        if (isEmpty()){
            System.out.println("Queue Underflow!");
            return -99999;
        }
        else if (front==rear){
            front=rear=-1;
        }
        else{
                front = (front+1)%size;
        }
        return queue[temp];
    }

    public boolean isEmpty(){
        return front==-1 & rear==-1;
    }
    public boolean isFull(){
        return (rear+1)%size==front;
    }


}
