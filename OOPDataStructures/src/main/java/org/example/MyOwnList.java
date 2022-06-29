package org.example;

public class MyOwnList {
    int elements[];
    public final int capacity;
    int size;

    MyOwnList() {
        capacity = 10000;
        elements = new int[capacity];
        size = 0;
    }
    public int size() {
        return size;
    }
    public boolean contains(int e) {
        for (int i = 0; i < size; i++) {
            if (e == elements[i]) {
                return true;
            }
        }
        return false;
    }
    public void add(int e) {
        elements[size++] = e;
    }
    public int get(int index) {
        return elements[index];
    }
    public void set(int index, int value) {
        if(index>=size){
            throw new IndexOutOfBoundsException();
        }
        elements[index] = value;
    }

    public boolean remove(int e) {
        for (int i = 0; i < size; i++) {
            if (e == elements[i]) {
                elements[i] = elements[i+1];
                size--;
                return true;
            }
        }
        return false;
    }
    void clear() {
        elements = new int[capacity];
        size = 0;
    }
    public boolean isEmpty() {
        if (size == 0) return true;
        else return false;
    }
}