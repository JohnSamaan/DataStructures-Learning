package queue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QueueArrayBased<T> {
    private T[] arr;
    private int indexToAdd;
    private int indexToDelete;
    @SuppressWarnings("unchecked")
    public QueueArrayBased(Class<T> clazz){
        arr=(T[]) Array.newInstance( clazz, 5);
        this.indexToAdd =0;
        this.indexToDelete = 0;
    }
    private void resize(){
        int temp= this.size();
        if (indexToAdd >= this.arr.length){
            if (indexToDelete>=5){
                for (int i=0; indexToDelete<this.arr.length-1; i++){
                    arr[i]=arr[indexToDelete];
                    indexToDelete++;
                }
                indexToAdd=temp;
                indexToDelete=0;
            }
            else{
                arr=Arrays.copyOf(arr, this.arr.length+10);
            }
        }
    }
    public void enqueue(T data){
        this.resize();
        arr[indexToAdd]=data;
        indexToAdd++;
    }
    public T dequeue(){
        if (this.size()==0){
            throw new IndexOutOfBoundsException("your queue is empty");
        }
        T temp = arr[indexToDelete];
        arr[indexToDelete] = null;
        indexToDelete++;
        return temp;
    }
    public T peek(){
        return arr[indexToDelete];
    }
    public int size(){
        return this.indexToAdd-this.indexToDelete;
    }
    public boolean isEmpty(){
        return indexToAdd ==indexToDelete;
    }
    public void printQueue(){
        for (int i = indexToDelete; i< indexToAdd; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    public void testArraySize(){
        System.out.println("actual array size: "+this.arr.length);
    }
}
