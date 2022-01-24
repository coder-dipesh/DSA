package classcode.graphalgo;

public class LinkedListTest {


    int size=0;
   public static class Node{
       int data;
       Node next; // address store garxa tei vayera Node type

       // Constructor for initializing
       Node(int data){
           this.data=data;
           this.next=null;
       }
   }
   //global variable to store first block memory location
   Node head = null;
   Node tail = null;
   public void addNode(int data){
       size++;
       Node newNode = new Node(data);
       if (head==null){
           head=tail=newNode; //Assigning first block address to head variable

       }
       else {
           // Constant time ma insertion
           tail.next = newNode;
           tail = newNode;
            // Crawling and traveling idea in linked list
           // O(n) ma insertion
//           Node current = head;
//           while(current.next!=null){
//               current=current.next;
//           }
//           current.next = newNode;
       }
   }

   //Printing list
    public void printList(){
       Node current = head;
       while(current!=null){
           System.out.println(current.data);
           current=current.next;
       }
    }

    //Get data at any position
    public int getDataAtAnyPos(int pos){
       Node current =head;
       for (int i=1; i<pos; i++){
           current=current.next;
        }
       return current.data;
    }

    public int getSize() {

        return size;
    }


    // Remove data at any pos

    public void removeDataAtAnyPos(int pos){
       if (pos>size || pos<0){ // If user give greater position then size
           System.out.println("Index out of bound!");
       }
       else if (pos==1){
           Node temp = head;
           head = temp.next;
           temp.next=null;
       }
       else{   //pos == size ho vaney tyo last ko node bujinxa
        Node current = head;
        for (int i=1;i<pos-1; i++){
            current = current.next;
        }
        if (current.next==tail){
            Node temp = current.next;
            current.next=null;
            tail=current;
        }
        else {
            Node temp = current.next;
            current.next = temp.next;
            temp.next=null;
        }
       }

    }

}
