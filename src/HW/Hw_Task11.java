package HW;

import java.util.HashMap;
import java.util.Set;

public class Hw_Task11 {
    public static void main(String[] args) {
        //11. Write a Java program to get a set view of the keys contained in this map.
        HashMap<Integer, String> colorsandpoints = new HashMap<>();

        colorsandpoints.put(1, "Red");
        colorsandpoints.put(2, "Green");
        colorsandpoints.put(3, "Black");
        colorsandpoints.put(4, "White");
        colorsandpoints.put(5, "Blue");
        System.out.println(colorsandpoints.keySet());


    }
}
