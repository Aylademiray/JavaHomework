package HW;

import java.util.HashMap;

public class hwTask__4 {
    public static void main(String[] args) {


   //4. Write a Java program to remove all of the mappings from a map.
   HashMap<Integer, String> colorsandpoints = new HashMap<>();

        colorsandpoints.put(1, "Red");
        colorsandpoints.put(2, "Green");
        colorsandpoints.put(3, "Black");
        colorsandpoints.put(4, "White");
        colorsandpoints.put(5, "Blue");
        colorsandpoints.clear();
        System.out.println(colorsandpoints);
}}