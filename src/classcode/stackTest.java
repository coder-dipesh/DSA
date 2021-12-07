package classcode;
public class stackTest {

    int top = -1;
    int [] stk;
    int size;

    // Constructor to take value
    public stackTest(int n) {
        stk = new int[n];
        size = n;
    }

    //Push method to enter data to stack
    void push(int data){
        if (isFull()){
            System.out.println("WARNING!!! Stackoverflow.");
        }
        else {
            //top++;
            stk[++top]=data; // ++top if prefix ma increment xa vaney paila increment hunxa ni rest statement execute hunxa
        }
    }

    //Pop method to extract data from stack
    int pop(){
        if (isEmpty()){
            System.out.println("WARNING!!! StackUnderFlow.");
            return -9999999;
        }
        else {
            return stk[top--]; // stack of top return hunxa paila ani tespaxi matra decrement hunxa
        }
    }

    // method to check either stack is full or not
    boolean isFull(){
        if (top == size-1){
            return true;
        }
        return false;
    }

    // method to check empty
    boolean isEmpty(){
        return top==-1;
    }

}
