package HW;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class HwTask_3_ {
    public static void main(String[] args) {


        // Write a Java program to copy all of the mappings from the specified map to another map.
        HashMap<Integer, String> colorsandpoints = new HashMap<>();

        colorsandpoints.put(1, "Red");
        colorsandpoints.put(2, "Green");
        colorsandpoints.put(3, "Black");
        colorsandpoints.put(4, "White");
        colorsandpoints.put(5, "Blue");
        HashMap<Integer, String> colorsandpoints1 = new HashMap<>(colorsandpoints);
        System.out.println(colorsandpoints1);
    }


}