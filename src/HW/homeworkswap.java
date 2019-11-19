package HW;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class homeworkswap {
    public static void main(String[] args) {


        ArrayList<Integer> mySet = new ArrayList<>();

        mySet.add(1);
        mySet.add(6);
        mySet.add(33);
        mySet.add(33);
        mySet.add(7);
        mySet.add(52);
        mySet.add(2);
        Collections.swap(mySet,1,4);
        System.out.println(mySet);
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(5);
        myList.add(8);
        myList.add(9);
        System.out.println(myList);
        mySet.addAll(myList);
        System.out.println(mySet);
    }


    }

