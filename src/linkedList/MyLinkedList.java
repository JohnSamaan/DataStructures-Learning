package linkedList;

public class MyLinkedList {
    LinkedListNode head;
    LinkedListNode tail;

    public int getHead() {
        return head.data;
    }

    public int getTail() {
        return tail.data;
    }

    public LinkedListNode getNode(int i) {
        LinkedListIterator itr = new LinkedListIterator(this.head);
        while (itr.current != null){
            if (itr.current.data==i){
                return itr.current;
            }
            else {
                itr.next();
            }
        }
        return null;
    }
    public void insertLast(int data){
        LinkedListNode newNode = new LinkedListNode(data);
        if (this.head==null){
            this.head=newNode;
        }
        else{
            this.tail.next=newNode;
        }
        this.tail=newNode;
    }
    public void addNext(int newData, LinkedListNode destination) {
        LinkedListNode newNode = new LinkedListNode(newData);
        newNode.next = destination.next;
        destination.next = newNode;
        if (destination == tail) {
            tail = newNode;
        }
    }
    public void printList(){
        LinkedListIterator iterator = new LinkedListIterator(this.head);
        while (iterator.current() != null){
            System.out.print(iterator.getCurrentData()+",");
            iterator.next();
        }
        System.out.println(" ");
    }
}
