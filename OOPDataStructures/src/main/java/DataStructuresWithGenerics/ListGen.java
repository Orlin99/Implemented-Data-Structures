package DataStructuresWithGenerics;

import java.lang.reflect.Array;

public class ListGen <Thing>{
    Thing x;
     Thing elements[];
    public final int capacity;
    int size;
    public ListGen() {
        capacity = 1000;
        elements = (Thing[]) new Object[capacity];
        size = 0;
    }
    public int size() {
        return size;
    }
    public boolean contains(Thing e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }
    public void add(Thing e) {
        elements[size++] = e;
    }
    public Thing get(int index) {
        if(index>=size){
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
        return elements[index];
    }
    public void set(int index, Thing value) {
        if(index>=size){
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
        elements[index] = value;
    }

    public boolean remove(Thing e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                elements[i] = elements[i+1];
                size--;
                return true;
            }
        }
        return false;
    }
    void clear() {
        elements = (Thing[]) new Object[capacity];
        size = 0;
    }
    public boolean isEmpty() {
        if (size == 0) return true;
        else return false;
    }
}