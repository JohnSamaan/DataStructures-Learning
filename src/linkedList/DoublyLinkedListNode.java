package linkedList;

class DoublyLinkedListNode<T> {
     private T data;
     DoublyLinkedListNode<T> next;
     DoublyLinkedListNode<T> previous;
    public DoublyLinkedListNode(T data){
        this.data=data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
