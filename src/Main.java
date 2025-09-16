import array.MyArray;
import linkedList.LinkedListNode;
import linkedList.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList linked_list = new MyLinkedList();
        linked_list.insertLast(1);
        linked_list.insertLast(2);
        linked_list.insertLast(3);

        linked_list.printList();

        linked_list.addNext(145, linked_list.getNode(3));
        linked_list.printList();
        System.out.println(linked_list.getTail());

    }
}
