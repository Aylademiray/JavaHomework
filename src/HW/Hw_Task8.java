package HW;

import java.util.HashMap;

public class Hw_Task8 {
    public static void main(String[] args) {
        //8. Write a Java program to test if a map contains a mapping for the specified value.

        HashMap<Integer, String> colorsandpoints = new HashMap<>();

        colorsandpoints.put(1, "Red");
        colorsandpoints.put(2, "Green");
        colorsandpoints.put(3, "Black");
        colorsandpoints.put(4, "White");
        colorsandpoints.put(5, "Blue");
        System.out.println(colorsandpoints.containsValue("Black"));
    }}