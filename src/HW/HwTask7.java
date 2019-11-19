package HW;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HwTask7 {
    public static void main(String[] args) {


        //7. Write a Java program to convert a hash set to an array.
        Set<Integer> setnumbers = new HashSet<>();
        setnumbers.add(1);
        setnumbers.add(4);
        setnumbers.add(6);
        setnumbers.add(8);
        ArrayList array= new ArrayList(setnumbers);
        System.out.println(array);
    }
}