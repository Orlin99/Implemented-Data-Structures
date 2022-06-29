package DataStructuresWithGenerics;

public class QueueGenerics <Thing>{
    Thing x;
    Thing[] elements;
    public final int capacity;
    int size;
    public Thing head;
    public Thing tail;
    QueueGenerics(){
        capacity = 1000;
        elements = (Thing[]) new Object[capacity];
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean add(Thing e){
        elements[size++] = e;
        return true;
    }
    public Thing poll(){
        head = elements[0];
        for (int i = 0; i < size; i++) {
            elements[i] = elements[i+1];
        }
        size--;
        return head;
    }
    public Thing peek(){
        head = elements[0];
        return head;
    }
    public boolean empty(){
        if(size==0) return true;
        else return false;
    }
}
