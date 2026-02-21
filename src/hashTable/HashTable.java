package hashTable;

import java.util.Arrays;
import static hashTable.HashingAlgorithms.FNV_a;

public class HashTable<key, value> {
    private Pair<key, value>[] arr;
    private int size;

    @SuppressWarnings("unchecked")
    public HashTable(){
        arr = (Pair<key, value>[]) new Pair[10];
        size = 0;
    }
    public void set(key key, value value){
        resizeOrNot();
    }
    public value get(key key){
       long hash = FNV_a(key);
       int i=1;
       int newHash = (int) (hash+i) % size;
       while (arr[newHash] != null && !(arr[newHash].getKey().equals(key))){
           i++;
           newHash =(int) (hash+i) % size;
           if (arr[newHash].getKey().equals(key)){
               return arr[newHash].getValue();
           }
       }
       return null;
    }
    public void remove(key key){

    }
    public int size(){
        return this.size;
    }
    public void print(){

    }
    private void resizeOrNot(){
        if (size >= arr.length){
            arr = Arrays.copyOf(arr, arr.length + 10);
        }
    }
}


class PairHash<key, value>{
    private final key key;
    private value value;
    public PairHash(key key, value value){
        this.key = key;
        this.value= value;
    }
    public key getKey(){
        return key;
    }
    public value getValue(){
        return value;

    }
    public void updateValue(value value){
        this.value=value;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
