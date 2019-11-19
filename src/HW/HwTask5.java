package HW;

import java.util.HashSet;
import java.util.Set;

public class HwTask5 {
    public static void main(String[] args) {


        //5. Write a Java program to test a hash set is empty or not.
        Set<Integer> setnumbers = new HashSet<>();
        setnumbers.add(1);
        setnumbers.add(4);
        setnumbers.add(6);
        setnumbers.add(8);
        System.out.println( setnumbers.isEmpty());
    }
}