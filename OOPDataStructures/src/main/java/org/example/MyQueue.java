package org.example;

public class MyQueue {
    int[] elements;
    public final int capacity;
    int size;
    public int head;
    public int tail;
    MyQueue(){
        capacity = 10000;
        elements = new int[capacity];
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean add(int e){
        elements[size++] = e;
        return true;
    }
    public int poll(){
        head = elements[0];
        for (int i = 0; i < size; i++) {
            elements[i] = elements[i+1];
        }
        size--;
        return head;
    }
    public int peek(){
        head = elements[0];
        return head;
    }
    public boolean empty(){
        if(size==0) return true;
        else return false;
    }
}
