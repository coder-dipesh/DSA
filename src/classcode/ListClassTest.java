package classcode;

import classcode.graphalgo.LinkedListTest;

public class ListClassTest {
    public static void main(String[] args) {
        LinkedListTest list = new LinkedListTest();
        list.addNode(12);
        list.addNode(33);
        list.addNode(50);
        list.addNode(55);

        System.out.println("==================");
        list.printList();
        System.out.println("Getting data at any pos");
        System.out.println(list.getDataAtAnyPos(2));
        list.removeDataAtAnyPos(3);
        System.out.println("After removing data");
        list.printList();

    }
}
