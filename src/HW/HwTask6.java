package HW;

import java.util.HashSet;
import java.util.Set;

public class HwTask6 {
    public static void main(String[] args) {
        //6. Write a Java program to clone a hash set to another hash set.
        Set<Integer> setnumbers = new HashSet<>();
        setnumbers.add(1);
        setnumbers.add(4);
        setnumbers.add(6);
        setnumbers.add(8);
        Set<Integer> setnumbers1 = new HashSet<>(setnumbers);
        System.out.println(setnumbers1);
    }
}
