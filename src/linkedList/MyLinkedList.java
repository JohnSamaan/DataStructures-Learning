package linkedList;

public class MyLinkedList<T> {
    LinkedListNode<T> head;
    LinkedListNode<T> tail;
    private int length=0;

    public T getHead() {
        return head.getData();
    }
    public T getTail() {
        return tail.getData();
    }

    public LinkedListNode<T> getNode(T data) {
        LinkedListIterator<T> itr = new LinkedListIterator<>(this.head);
        while (itr.getCurrent() != null){
            if (itr.getCurrent().getData().equals(data)){
                return itr.getCurrent();
            }
            else {
                itr.next();
            }
        }
        return null;
    }
    public void insertLast(T data){
        LinkedListNode<T> newNode = new LinkedListNode<T>(data);
        if (this.head==null){
            this.head=newNode;
        }
        else{
            this.tail.next=newNode;
        }
        this.tail=newNode;
        this.length++;
    }
    public void addAfter(T destination, T newData) {
        LinkedListNode<T> newNode = new LinkedListNode<T>(newData);
        LinkedListNode<T> destinationNode = getNode(destination);
        if (destinationNode==tail) {
            tail = newNode;
        }
        else {
        newNode.next = destinationNode.next;
        }
        destinationNode.next = newNode;
        this.length++;
    }
    public void addBefore(T destination, T newData){
        LinkedListNode<T> node = new LinkedListNode<T>(newData);
        LinkedListNode<T> destinationNode = getNode(destination);
        LinkedListNode<T> parent = getParent(destinationNode);
        if (destinationNode == head){
            head = node;
        }
        else {
            parent.next = node;
        }
        node.next=destinationNode;
        this.length++;
    }
    public void deleteItem(T data) throws Exception {
        LinkedListNode<T> node = getNode(data);
        LinkedListNode<T> parent = getParent(node);
        if(node==null){
            throw new Exception("item is not found.");
        }
        else if (this.head==this.tail){
            head=null; tail=null;
        }
        else if (node==head){
            head=head.next;
        }
        else if (node==tail){
            tail=parent;
            tail.next=null;
        }
        else {
            parent.next = node.next;
        }
        this.length--;
    }
    public LinkedListNode<T> getParent(LinkedListNode<T> child) {
        LinkedListIterator<T> itr = new LinkedListIterator<>(head);
        while (itr.getCurrent() != null) {
            if (itr.getCurrent().next == child) {
                return itr.getCurrent();
            } else {
                itr.next();
            }
        }
        return null;
    }
    public void update(T data, T newData){
        LinkedListNode<T> node = getNode(data);
        node.setData(newData);
    }
    public void printList(){
        LinkedListIterator<T> iterator = new LinkedListIterator<>(this.head);
        while (iterator.getCurrent()!=null){
            System.out.print(iterator.getCurrentData()+",");
            iterator.next();
        }
        System.out.println(" ");
    }
    public int getLength(){
        return this.length;
    }
    public void deleteHead() {
            head=head.next;
            this.length--;
    }
    public void insertFirst(T data){
        if (this.head==null) {
            LinkedListNode<T> newNode = new LinkedListNode<T>(data);
            this.head= newNode;
            this.tail= newNode;
            this.length++;
        }else {
            addBefore(this.getHead(), data);
        }
    }
}
