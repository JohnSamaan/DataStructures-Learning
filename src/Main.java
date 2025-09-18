import array.MyArray;
import linkedList.LinkedListNode;
import linkedList.MyLinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        MyLinkedList linked_list = new MyLinkedList();
        linked_list.insertLast(1);
        linked_list.insertLast(2);
        linked_list.insertLast(3);
        System.out.println("the head and tail are: "+linked_list.getHead());
        System.out.println(linked_list.getTail());
        linked_list.addAfter(2, 145);
        linked_list.addBefore(1, -10);
        linked_list.addAfter(3, 14);
        linked_list.deleteItem(145);
        linked_list.deleteItem(-10);
        linked_list.deleteItem(14);





    }
}
