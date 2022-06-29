package DataStructuresWithGenerics;

public class StackGenerics <Thing>{
    Thing x;
    Thing[] elements;
    public final int capacity;
    int size;
    public Thing topElement;

    StackGenerics(){
        capacity = 10000;
        elements = (Thing[]) new Object[capacity];
        size = 0;
    }
    public int size(){
        return size;
    }
    public Thing push(Thing e){
        elements[size++] = e;
        return e;
    }
    public Thing pop(){
        topElement = elements[size-1];
        size--;
        return topElement;
    }
    public Thing peek(){
        topElement = elements[size-1];
        return topElement;
    }
    public boolean empty(){
        if(size==0) return true;
        else return false;
    }
}
