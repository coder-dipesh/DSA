package classcode;

public class ImplementingQueue {
    public static void main(String[] args) {
        QueueTest qt = new QueueTest(5);
        qt.enqueue(10);
        qt.enqueue(20);
        qt.enqueue(30);
        qt.enqueue(40);
        qt.enqueue(50);
        System.out.println(qt.dequeue());
        System.out.println(qt.dequeue());
        System.out.println(qt.dequeue());
        System.out.println(qt.dequeue());
        System.out.println("Peek value " + qt.peek());

    }
}
