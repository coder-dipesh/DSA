package classcode;

public class QueueTest {

    int front ;
    int rear ;
    int [] queue;
    int size;

    QueueTest(int n){
        //this.front=this.rear=-1;
        this.front=-1;
        this.rear=-1;
        this.size=n;
        queue = new int[n];

    }

    public void enqueue(int data){
        if (isFull()){
            System.out.println("Queue overflow!");
        }else {
            if (isEmpty()){
                front=0;
            }
            queue[++rear]=data;

        }
    }

    // Dqueue operation
    public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue Underflow!");
            return -9999;
        }
        else{
            int temp = front;
            if (front==rear){
                front=rear=-1;
            }
            else {
                front++;

            }
            return queue[temp];
        }
    }

    public boolean isEmpty(){
        return front==-1 && rear==-1;
    }

    // Checking is Queue full or not
    public boolean isFull(){
        return rear==size-1;
    }
// For peek value
    public int peek(){
        return queue[front];
    }



}
