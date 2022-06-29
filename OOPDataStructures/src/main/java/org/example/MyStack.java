package org.example;

import java.util.List;

public class MyStack {
    int[] elements;
    public int capacity;
    int size;
    public int topElement;

    MyStack(){
        capacity = 3;
        elements = new int[capacity];
        size = 0;
    }
    public int size(){
        return size;
    }
    public int push(int e){
            if(size==capacity){
                grow(elements);
            }
        elements[size++] = e;
        return e;
    }
    private void grow(int [] array) {
        int[] newElements = new int[capacity*2];
        for (int i = 0; i < size; i++) {
            newElements[i] = array[i];
        }
        //array = newElements; NE
        elements = newElements;
        capacity = capacity*2;
    }

    public int pop(){
        topElement = elements[size-1];
        size--;
        return topElement;
    }
    public int peek(){
        topElement = elements[size-1];
        return topElement;
    }
    public boolean empty(){
        if(size==0) return true;
        else return false;
    }

}
