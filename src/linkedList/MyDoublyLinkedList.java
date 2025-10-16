package linkedList;

import java.util.Objects;

public class MyDoublyLinkedList <T>  {
    private DoublyLinkedListNode<T> head;
    private DoublyLinkedListNode<T> tail;
    private int length=0;
    public MyDoublyLinkedList(){}
    public MyDoublyLinkedList(T data){
        this.head = new DoublyLinkedListNode<>(data);
        this.tail = new DoublyLinkedListNode<>(data);
        this.length++;
    }

     public T getHead() {
        return head.getData();
    }
     public T getTail() {
        return tail.getData();
    }
    private DoublyLinkedListIterator<T> itr(){
        return new DoublyLinkedListIterator<>(this.head);
    }
    DoublyLinkedListNode<T> getNode(T data){

         DoublyLinkedListIterator<T> itr = itr();
         while (itr.getCurrent()!=null){
            if(data == itr.getCurrent().getData()){
                return itr.getCurrent();
            }else {
                itr.next();
            }
        }
        return null;
    }
    public void insertLast(T data){
        DoublyLinkedListNode<T> dataNode = new DoublyLinkedListNode<>(data);
        if (this.head==null) {
            this.head=dataNode;
        }else{
            dataNode.previous=tail;
            this.tail.next=dataNode;
        }
        this.tail=dataNode;
        this.length++;
    }
    public void addBefore(T data, T newData) throws Exception{
        DoublyLinkedListNode<T> node = getNode(data);
        if (node==null){
            throw new Exception("item not found.");
        }
        DoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<>(newData);
        if (node == head) {
            head = newNode;
        }else {
            node.previous.next=newNode;
        }
        newNode.previous = node.previous;
        node.previous = newNode;
        newNode.next = node;
        this.length++;
    }
    public void addAfter(T data, T newData) throws Exception{
        DoublyLinkedListNode<T> node = getNode(data);
        if (node==null){
            throw new Exception("item not found.");
        }
        DoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<>(newData);
        if (node==tail){
            tail = newNode;
        }else{
            node.next.previous=newNode;
        }
        newNode.next=node.next;
        newNode.previous=node;
        node.next=newNode;
        this.length++;
    }
    public void deleteItem(T data) throws Exception{
        DoublyLinkedListNode<T> node = getNode(data);
        if (node == null){throw new Exception("item not found");}
        if (head==tail){
            this.head = null;
            this.tail = null;
        } else if (head==node) {
            head=head.next;
            head.previous=null;
        } else if (node==tail) {
            tail = tail.previous;
            tail.next = null;
        }
        else {
            node.next.previous = node.previous;
            node.previous.next = node.next;
    }
        this.length--;
    }
    public void update(T data,T newData)throws Exception{
        DoublyLinkedListNode<T> node = getNode(data);
        if (node==null){throw new Exception("item not found.");}
        node.setData(newData);
    }
    public void printList(){
        DoublyLinkedListIterator<T> itr = itr();
        while (itr.getCurrent() != null){
            System.out.print(itr.getCurrent().getData()+", ");
            itr.next();
        }
        System.out.println();
    }
    public int getLength(){
        return this.length;
    }
    public void copyList(MyDoublyLinkedList<T> newList){
        DoublyLinkedListIterator<T> itr = itr();
        if (newList.getLength()==0) {
            while (itr.getCurrent() != null) {
                newList.insertLast(itr.getCurrent().getData());
                itr.next();
            }
        }
    }
}
