package queue;

import java.util.Arrays;

public class QueueArrayBased {
    private int[] arr;
    private int indexToAdd;
    private int indexToDelete;
    public QueueArrayBased(){
        arr=new int[5];
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
    public void enqueue(int data){
        this.resize();
        arr[indexToAdd]=data;
        indexToAdd++;
    }
    public int dequeue() throws IndexOutOfBoundsException{
        if (this.size()==0){
            throw new IndexOutOfBoundsException("your queue is empty");
        }
        int temp = arr[indexToDelete];
        arr[indexToDelete] = 0;
        indexToDelete++;
        return temp;
    }
    public int peak(){
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
