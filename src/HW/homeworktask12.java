package HW;

import java.util.ArrayList;
import java.util.HashSet;

public class homeworktask12 {
    public static void main(String[] args) {

       HashSet myset = new java.util.HashSet<>();
        myset.add(1);
        myset.add(6);
        myset.add(33);
        myset.add(33);
        myset.add(7);
        myset.add(52);
        myset.add(2);
        System.out.println(myset);
        HashSet<Integer> myList=new HashSet<>();
        myList.add(1);
        myList.add(6);
       myset.removeAll(myList);
        System.out.println(myset);
    }
}
