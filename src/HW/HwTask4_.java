package HW;

import java.util.HashSet;
import java.util.Set;

public class HwTask4_ {
    public static void main(String[] args) {


    //4. Write a Java program to empty an hash set.
    Set<Integer> setnumbers = new HashSet<>();
        setnumbers.add(1);
        setnumbers.add(4);
        setnumbers.add(6);
        setnumbers.add(8);
        setnumbers.clear();
        System.out.println(setnumbers);
}}
