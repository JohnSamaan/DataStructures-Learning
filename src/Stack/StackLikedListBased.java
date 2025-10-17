package Stack;
import linkedList.MyLinkedList;

public class StackLikedListBased {
    private final MyLinkedList linkedList = new MyLinkedList();

    public void push(int data){
        linkedList.insertFirst(data);
    }
    public int pop(){
        int peek = linkedList.getHead();
        linkedList.deleteHead();
        return peek;
    }
    public int peak(){
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
