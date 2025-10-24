package stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StackArrayBased<T> {
    private T[] arr;
    private int topElementIndex;
    @SuppressWarnings("unchecked")
    public StackArrayBased(Class<T> clazz){
        arr= (T[]) Array.newInstance(clazz, 10);
        this.topElementIndex =-1;
    }
    private void resize(){
        if (this.arr.length== topElementIndex+1){
            arr=Arrays.copyOf(arr, arr.length+10);
            System.out.println("resized to : "+arr.length);
        }
    }

    public void push(T data){
        this.resize();
        arr[topElementIndex+1]=data;
        topElementIndex++;
    }
    public T pop(){
        if (topElementIndex < 0){
            throw new IndexOutOfBoundsException("your stack is empty");
        }
            T temp = arr[topElementIndex];
            arr[topElementIndex] = null;
            topElementIndex--;
            return temp;
    }
    public T peak(){
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
