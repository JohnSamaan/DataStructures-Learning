import linkedList.MyDoublyLinkedList;
import linkedList.MyLinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        MyLinkedList linked_list = new MyLinkedList();

        linked_list.insertFirst(7);
        linked_list.insertFirst(2);
        linked_list.insertFirst(9);
        linked_list.insertFirst(1);
        linked_list.insertFirst(25);
        linked_list.insertFirst(5);
        linked_list.printList();
    }
}
