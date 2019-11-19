package HW;

import java.util.HashSet;
import java.util.Set;

public class HwTask3_ {
    public static void main(String[] args) {


        //3. Write a Java program to get the number of elements in a hash set.
        Set<Integer> setnumbers = new HashSet<>();
        setnumbers.add(1);
        setnumbers.add(4);
        setnumbers.add(6);
        setnumbers.add(8);
        System.out.println( setnumbers.size());
    }
}
