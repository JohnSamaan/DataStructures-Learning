package linkedList;

public class MyLinkedList {
    LinkedListNode head;
    LinkedListNode tail;

    public int getHead() {
        return head.getData();
    }

    public int getTail() {
        return tail.getData();
    }

    public LinkedListNode getNode(int i) {
        LinkedListIterator itr = new LinkedListIterator(this.head);
        while (itr.getCurrent() != null){
            if (itr.getCurrent().getData()==i){
                return itr.getCurrent();
            }
            else {
                itr.next();
            }
        }
        return null;
    }
    public void insertLast(int data){
        LinkedListNode newNode = new LinkedListNode(data);
        if (this.head==null){
            this.head=newNode;
        }
        else{
            this.tail.next=newNode;
        }
        this.tail=newNode;
    }
    public void addAfter(int destination, int newData) {
        LinkedListNode newNode = new LinkedListNode(newData);
        LinkedListNode destinationNode = getNode(destination);
        if (destinationNode==tail) {
            tail = newNode;
        }
        else {
        newNode.next = destinationNode.next;
        }
        destinationNode.next = newNode;
    }
    public void addBefore(int destination, int newData){
        LinkedListNode node = new LinkedListNode(newData);
        LinkedListNode destinationNode = getNode(destination);
        LinkedListNode parent = getParent(destinationNode);
        if (destinationNode == head){
            head = node;
        }
        else {
            parent.next = node;
        }
        node.next=destinationNode;
    }
    public void deleteItem(int data) throws Exception {
        LinkedListNode node = getNode(data);
        LinkedListNode parent = getParent(node);
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

    }
    public LinkedListNode getParent(LinkedListNode child) {
        LinkedListIterator itr = new LinkedListIterator(head);
        while (itr.getCurrent() != null) {
            if (itr.getCurrent().next == child) {
                return itr.getCurrent();
            } else {
                itr.next();
            }
        }
        return null;
    }
    public void update(int data, int newData){
        LinkedListNode node = getNode(data);
        node.setData(newData);
    }
    public void printList(){
        LinkedListIterator iterator = new LinkedListIterator(this.head);
        while (iterator.getCurrent()!=null){
            System.out.print(iterator.getCurrentData()+",");
            iterator.next();
        }
        System.out.println(" ");
    }
}
