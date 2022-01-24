package classcode.graphalgo;

public class LinkedList1 {



    public static class Node {



        int data;
        Node next;



        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }



    Node head = null;
    Node tail = null;



    // int size=0;
    public void addNode(int data) {



        if (head == null) {
            Node newnode = new Node(data);
            head = newnode;
            tail = head;
// size++;
        } else {
            Node newnode = new Node(data);
            tail.next = newnode;
            tail = newnode;
// size++;
        }



    }



    public int getSize() {
        int size = 0;
        Node current = head;



        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }



    public void printList() {



        Node current = head;



        while (current != null) {



            System.out.println(current.data);
            current = current.next;
        }



    }



    public int getDataByIndx(int i) {



        if (getSize() == 0 || i > getSize()) {



            System.out.println("please enter valid input");
            return -999999999;
        } else {



            Node current = head;
            for (int j = 1; j < i; j++) {
                current = current.next;
            }
            return current.data;
        }
    }




}