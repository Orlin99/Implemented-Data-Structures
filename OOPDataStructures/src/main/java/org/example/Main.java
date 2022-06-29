package org.example;

import java.awt.*;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //TODO grow all dataStructures;

        MyStack stack = new MyStack();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);

        System.out.println(stack.size);

        //MyHashMap myHashMap = new MyHashMap();

        //System.out.println(myHashMap.size);
        //System.out.println(myHashMap.isEmpty());
        //System.out.println();

        //System.out.println(myHashMap.put(0,100));
        //System.out.println(myHashMap.put(1,101));
        //System.out.println(myHashMap.put(2,102));
        //System.out.println(myHashMap.put(0,150));
        //System.out.println(myHashMap.put(0,111));
        //System.out.println(myHashMap.put(10,110));
        //System.out.println();

        //System.out.println(myHashMap.size);
        //System.out.println(myHashMap.isEmpty());
        //System.out.println(myHashMap.containsKey(10));
        //System.out.println(myHashMap.containsKey(5));
        //System.out.println(myHashMap.containsValue(102));
        //System.out.println(myHashMap.containsValue(150));

        //System.out.println(myHashMap.get(0));
        //System.out.println(myHashMap.get(2));
        //System.out.println(myHashMap.get(5));

        //myHashMap.clear();
        //System.out.println(myHashMap.isEmpty());

        //System.out.println(myHashMap.remove(2));
        //System.out.println(myHashMap.get(2));



        /*
        MyQueue myQueue = new MyQueue();
        System.out.println(myQueue.size);
        System.out.println(myQueue.empty());
        System.out.println();
        System.out.println(myQueue.add(4));
        System.out.println(myQueue.add(5));
        System.out.println(myQueue.add(1));
        System.out.println(myQueue.add(9));
        System.out.println(myQueue.size);
        System.out.println();
        System.out.println();
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.size);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.size);
        System.out.println(myQueue.empty());
        */

        /*
        MyStack myStack = new MyStack();
        System.out.println(myStack.empty());
        System.out.println(myStack.size);
        System.out.println(myStack.push(5));
        System.out.println(myStack.empty());
        System.out.println(myStack.size);
        myStack.push(7);
        myStack.push(14);
        myStack.push(18);
        myStack.push(27);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        */

        /*
        MyOwnList myOwnList = new MyOwnList();
        myOwnList.add(4);
        myOwnList.add(12);
        myOwnList.add(19);
        myOwnList.add(7);
        myOwnList.add(25);
        myOwnList.add(80);
        System.out.println(myOwnList.size);

        System.out.println(myOwnList.contains(80));
        System.out.println(myOwnList.contains(81));

        System.out.println(myOwnList.get(0));
        myOwnList.set(0,10);
        System.out.println(myOwnList.get(0));
        System.out.println();

        System.out.println(myOwnList.get(1));
        System.out.println(myOwnList.remove(12));
        System.out.println(myOwnList.remove(13));
        System.out.println(myOwnList.get(1));
        System.out.println(myOwnList.size);
        System.out.println(myOwnList.isEmpty());

        myOwnList.clear();
        System.out.println(myOwnList.size);
        System.out.println(myOwnList.isEmpty());
        */
    }
}