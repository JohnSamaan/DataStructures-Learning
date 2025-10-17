package Stack;

import java.util.Arrays;

public class StackArrayBased {
    private int[] arr;
    private int topElementIndex;
    public StackArrayBased(){
        arr=new int[3];
        this.topElementIndex =-1;
    }
    private void resize(){
        if (this.arr.length== topElementIndex+1){
            arr=Arrays.copyOf(arr, arr.length+10);
            System.out.println("resized to : "+arr.length);
        }
    }

    public void push(int data){
        this.resize();
        arr[topElementIndex+1]=data;
        topElementIndex++;
    }
    public int pop() throws Exception{
        if (topElementIndex < 0){
            throw new IndexOutOfBoundsException("your stack is empty");
        }
            int temp = arr[topElementIndex];
            arr[topElementIndex] = 0;
            topElementIndex--;
            return temp;
    }
    public int peak(){
        return arr[topElementIndex];
    }
    public int size(){
        return topElementIndex+1;
    }
    public boolean isEmpty(){
        return topElementIndex==-1;
    }
    public void printStack(){
        for (int i=topElementIndex; i>=0;i--){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
}
