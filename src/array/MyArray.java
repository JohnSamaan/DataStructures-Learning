package array;

public class MyArray<T> {
    public MyArray(){}
    public static <T> T[] resize(T[] source, int newSize){
        if(newSize<= source.length)return source;

        @SuppressWarnings("unchecked")
        T[] destinationArray = (T[]) new Object[newSize];
        for(int i=0;i<source.length;i++)destinationArray[i]=source[i];
        return destinationArray;
    }
}