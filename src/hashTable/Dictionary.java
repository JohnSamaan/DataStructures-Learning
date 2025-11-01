package hashTable;


import java.lang.module.FindException;
import java.util.Arrays;


public class Dictionary <Tkey, Tvalue>{
    Pair<Tkey, Tvalue>[] arr;
    private int dictionarySize;
    @SuppressWarnings("unchecked")
    public Dictionary(){
        arr = (Pair<Tkey, Tvalue>[]) new Pair[3];
        dictionarySize =0;
    }
    public void put(Tkey key, Tvalue value){
        if (isExisting(key)==-1) {
            Pair<Tkey, Tvalue> newItem = new Pair<>(key, value);
            int index=this.addTo();
            arr[index] = newItem;
            dictionarySize++;
        }else {
            this.replace(key, value);
        }
    }
    public void remove(Tkey key){
        int index=isExisting(key);
        if (index!=-1){
            arr[index]=null;
            dictionarySize--;
        }
    }
    public Tvalue getValue(Tkey key) {
        for (Pair<Tkey, Tvalue> element : arr) {
            if (element != null && element.getKey()==key) {
                return element.getValue();
            }
        }
        return null;
    }
    public void replace(Tkey key, Tvalue value){
        for (Pair<Tkey, Tvalue> element : arr) {
            if (element != null && element.getKey()==key) {
                element.updateValue(value);
            }
        }
    }
    public int size(){
        return dictionarySize;
    }
    public void printDict(){
        System.out.print("{");
        for (Pair<Tkey, Tvalue> element: arr){
            if (element != null)
                System.out.println(element.getKey()+ ": "+ element.getValue());
        }
        System.out.println("}");
    }
    private int addTo(){
        for (int i=0; i<arr.length;i++){
            if (arr[i]==null){
                return i;
            }
        }
        int oldLength=arr.length;
        arr=Arrays.copyOf(arr, oldLength+10);
        return oldLength;
    }
    private int isExisting(Tkey key){
        for (int i = 0; i< arr.length; i++){
            if (arr[i]!=null && arr[i].getKey()==key){
                return i;
            }
        }
        return -1;
    }

    public int arrSize() {
        return arr.length;
    }
}



class Pair<Tkey, Tvalue>{
    private final Tkey key;
    private Tvalue value;
    public Pair(Tkey key, Tvalue value){
        this.key = key;
        this.value= value;
    }
    public Tkey getKey(){
        return key;
    }
    public Tvalue getValue(){
            return value;

    }
    public void updateValue(Tvalue value){
        this.value=value;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}