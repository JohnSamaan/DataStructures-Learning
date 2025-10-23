package queue;

import linkedList.MyLinkedList;

public class QueueLinkedListBased {
    private final MyLinkedList list;
    public QueueLinkedListBased(){
        list = new MyLinkedList();
    }
    public void enqueue(int data){
        list.insertLast(data);
    }
    public int dequeue()throws Exception{
        if (list.getLength()<=0) {
            throw new Exception("Queue is empty:");
        }
        int temp = list.getHead();
        list.deleteHead();
        return temp;
    }
    public int peak()throws Exception{
        if (list.getLength()<=0){
            throw new Exception("Queue is empty:");
        }
        return list.getHead();
    }
    public int size(){
        return list.getLength();
    }
    public boolean isEmpty(){
        return list.getLength()==0;
    }
    public void printQueue(){
        list.printList();
    }
}
