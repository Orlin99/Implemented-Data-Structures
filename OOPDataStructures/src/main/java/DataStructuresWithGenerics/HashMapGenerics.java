package DataStructuresWithGenerics;

public class HashMapGenerics <Key, Value>{
    Value[] values;
    Key[] keys;
    public final int capacity;
    int size;
    HashMapGenerics() {
        capacity = 1000;
        values = (Value[]) new Object[capacity];
        keys = (Key[]) new Object[capacity];
        size = 0;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        if (size == 0) return true;
        else return false;
    }
    public Value put(Key key, Value value) {

        for (int i = 0; i < size; i++) {
            if(key==keys[i]){
                Value oldValue = values[i];
                values[i] = value;
                return oldValue;
            }
        }
        keys[size] = key;
        values[size] = value;
        size++;
        return null;
    }
    public boolean containsKey(Key key){
        for (int i = 0; i < size; i++) {
            if(keys[i].equals(key)){
                return true;
            }
        }
        return false;
    }
    public boolean containsValue(Value value){
        for (int i = 0; i < size; i++) {
            if(values[i].equals(value)){
                return true;
            }
        }
        return false;
    }
    public Value get(Key key){
        for (int i = 0; i < size; i++) {
            if(keys[i].equals(key)){
                return values[i];
            }
        }
        throw new RuntimeException("The key doesn't exist !!!");
    }
    public Value remove(Key key){
        for (int i = 0; i < size; i++) {
            if(keys[i].equals(key)){

                Value oldValue = values[i];

                keys[i] = keys[i+1];
                values[i] = values[i+1];
                size--;
                return oldValue;
            }
        }
        throw new RuntimeException("The key doesn't exist !!!");
    }
    public void clear(){
        values = (Value[]) new Object[capacity];
        keys = (Key[]) new Object[capacity];
        size = 0;
    }
}
