package DataStructuresImplementation;

import DataStructuresWithGenerics.ListGen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args){

        ListImplementation<Integer> myList = new ListImplementation<>();
        myList.add(5);
        myList.add(5);
        myList.add(0,2);
        System.out.println(myList.size());
        myList.add(1);
        System.out.println(myList.size());


        System.out.println();



        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(5);
        list.add(0,2);
        System.out.println(list.size());
        list.add(1);
        System.out.println(list.size());

        System.out.println(myList.removeAll(list));

    }
}