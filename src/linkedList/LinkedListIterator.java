package linkedList;

public class LinkedListIterator<T> {
    private LinkedListNode<T> current;
    public LinkedListIterator(LinkedListNode<T> current){
        this.current = current;
    }
    public LinkedListNode<T> getCurrent() {
        return this.current;
    }
    public T getCurrentData(){
        return current.getData();
    }
    public LinkedListIterator<T> next(){
        this.current = this.current.next;
        return this;
    }
}
