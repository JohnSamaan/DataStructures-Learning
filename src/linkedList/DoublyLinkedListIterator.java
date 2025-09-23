package linkedList;

class DoublyLinkedListIterator<T> {
    DoublyLinkedListNode<T> current;

    public DoublyLinkedListIterator(DoublyLinkedListNode<T> current){
        this.current=current;
    }
    public DoublyLinkedListNode<T> getCurrent(){
        return this.current;
    }
    public void next(){
        current = current.next;
    }
}
