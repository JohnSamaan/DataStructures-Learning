package linkedList;

public class LinkedListNode {
    private int data;
    LinkedListNode next;
    public LinkedListNode(int data){
        this.data=data;
    }
    public int getData(){
        return this.data;
    }
    public void setData(int newData){
        this.data=newData;
    }
}
