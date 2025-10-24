package queue;

import linkedList.MyLinkedList;

public class QueueLinkedListBased<T> {
    private final MyLinkedList<T> list;
    public QueueLinkedListBased(){
        list = new MyLinkedList<>();
    }
    public void enqueue(T data){
        list.insertLast(data);
    }
    public T dequeue(){
        if (list.getLength()<=0) {
            throw new IndexOutOfBoundsException("Queue is empty:");
        }
        T temp = list.getHead();
        list.deleteHead();
        return temp;
    }
    public T peek(){
        if (list.getLength()<=0){
            throw new IndexOutOfBoundsException("Queue is empty:");
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
