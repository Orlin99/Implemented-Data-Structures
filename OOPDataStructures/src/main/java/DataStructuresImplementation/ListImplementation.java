package DataStructuresImplementation;

import java.lang.reflect.Array;
import java.util.*;

public class ListImplementation <Thing> implements List<Thing> {
    Thing x;
    Thing elements[];
    public final int capacity;
    int size;
    ListImplementation() {
        capacity = 1000;
        elements = (Thing[]) new Object[capacity];
        size = 0;
    }
    public int size() {
        return size;
    }
    public boolean contains(Object e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }
    public boolean add(Thing e) {
        elements[size++] = e;
        return true;
    }
    @Override
    public boolean remove(Object e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                elements[i] = elements[i+1];
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object e : c)
            if (!contains(e))
                return false;
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Thing> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Thing> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public Thing get(int index) {
        if(index>=size){
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
        return (Thing) elements[index];
    }
    public Thing set(int index, Thing value) {
        if(index>=size){
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
        Thing oldValue = null;
        for (int i = 0; i < size; i++) {
            oldValue = elements[i];
            elements[index] = value;
        }
        return oldValue;
    }

    @Override
    public void add(int index, Thing element) {
        if(index>=size){
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }
        Thing[] newElements = (Thing[]) new Object[capacity+1];
        for (int i = 0; i < index; i++) {
            newElements[i] = elements[i];
        }
        newElements[index] = element;
        for (int i = index+1; i<newElements.length; i++) {
            newElements[i] = elements[i-1];
        }
        elements = newElements;
        size++;
    }
    @Override
    public Thing remove(int index) {
        if(index>=size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
        Thing removingElement =null;
        for (int i = 0; i < size; i++) {
            if(index==i){
                removingElement = elements[i];
                elements[i] = elements[i+1];
                size--;
            }
        }
        return removingElement;
    }
    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Thing> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Thing> listIterator(int index) {
        return null;
    }

    @Override
    public List<Thing> subList(int fromIndex, int toIndex) {
        return null;
    }
    public void clear() {
        elements = (Thing[]) new Object[capacity];
        size = 0;
    }
    public boolean isEmpty() {
        if (size == 0) return true;
        else return false;
    }


    @Override
    public Iterator<Thing> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }
}
