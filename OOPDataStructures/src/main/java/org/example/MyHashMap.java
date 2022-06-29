package org.example;

public class MyHashMap {
    Integer[] values;
    Integer[] keys;
    public final int capacity;
    int size;
    MyHashMap() {
        capacity = 1000;
        values = new Integer[capacity];
        keys = new Integer[capacity];
        size = 0;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        if (size == 0) return true;
        else return false;
    }
    public Integer put(Integer key, Integer value) {

        for (int i = 0; i < size; i++) {
            if(key==keys[i]){
                Integer oldValue = values[i];
                values[i] = value;
                return oldValue;
            }
        }
        keys[size] = key;
        values[size] = value;
        size++;
        return null;
    }
    public boolean containsKey(int key){
        for (int i = 0; i < size; i++) {
            if(keys[i].equals(key)){
                return true;
            }
        }
        return false;
    }
    public boolean containsValue(int value){
        for (int i = 0; i < size; i++) {
            if(values[i].equals(value)){
                return true;
            }
        }
        return false;
    }
    public int get(int key){
        for (int i = 0; i < size; i++) {
            if(keys[i].equals(key)){
                return values[i];
            }
        }
        throw new RuntimeException("The key doesn't exist !!!");
    }
    public int remove(int key){
        for (int i = 0; i < size; i++) {
            if(keys[i].equals(key)){

                Integer oldValue = values[i];

                keys[i] = keys[i+1];
                values[i] = values[i+1];
                size--;
                return oldValue;
            }
        }
        throw new RuntimeException("The key doesn't exist !!!");
    }
    public void clear(){
        values = new Integer[capacity];
        keys = new Integer[capacity];
        size = 0;
    }
}
