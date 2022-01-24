package classcode.graphalgo;

public class QueuesTest {

    int[] queues;
    int front=-1;
    int rear=-1;




    public QueuesTest(){

        queues=new int[10];
    }

    public void enqueue(int data) {

        if(isFull()) {
            System.out.println("overflow");
        }
        else if(front==-1 && rear==-1) {
            front=rear=0;
            queues[rear]=data;

        }
        else {

            queues[++rear]=data;
        }

    }


    public int dequeue() {
        if(isEmpty()) {

            System.out.println("underflow");
            return -1;
        }
        else if(rear==front) {

            int x=front;
            front=rear=-1;

            return queues[x];
        }
        else {

            return queues[front++];
        }

    }

    public boolean isEmpty() {

        if(rear==-1 && front==-1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {

        if(rear==queues.length-1) {
            return true;
        }
        return false;
    }



}