package linkedList;

public class LinkedListIterator {
    LinkedListNode current;
    public LinkedListIterator(LinkedListNode current){
        this.current = current;
    }
    public LinkedListNode current() {
        return this.current;
    }
    public int getCurrentData(){
        return current.data;
    }
    public void next(){
        current = current.next;
    }
}
