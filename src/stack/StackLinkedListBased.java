package stack;
import linkedList.MyLinkedList;

public class StackLinkedListBased<T> {
    private final MyLinkedList<T> linkedList = new MyLinkedList<>();

    public void push(T data){
        linkedList.insertFirst(data);
    }
    public T pop(){
        T peak = linkedList.getHead();
        linkedList.deleteHead();
        return peak;
    }
    public T peak(){
        return linkedList.getHead();
    }
    public int size(){
        return linkedList.getLength();
    }
    public boolean isEmpty(){
        return linkedList.getLength() == 0;
    }
    public void printStack(){
        linkedList.printList();
    }

}
