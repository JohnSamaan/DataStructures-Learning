package linkedList;

public class LinkedListNode<T> {
    private T data;
    LinkedListNode<T> next;
    public LinkedListNode(T data){
        this.data=data;
    }
    public T getData(){
        return this.data;
    }
    public void setData(T newData){
        this.data=newData;
    }
}
