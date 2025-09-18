package linkedList;

public class LinkedListIterator {
    private LinkedListNode current;
    public LinkedListIterator(LinkedListNode current){
        this.current = current;
    }
    public LinkedListNode getCurrent() {
        return this.current;
    }
    public int getCurrentData(){
        return current.getData();
    }
    public LinkedListIterator next(){
        this.current = this.current.next;
        return this;
    }
}
