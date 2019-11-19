package HW;

import java.util.HashMap;

public class Hw_Task10 {
    public static void main(String[] args) {
        //10. Write a Java program to get the value of a specified key in a map.
        HashMap<Integer, String> colorsandpoints = new HashMap<>();

        colorsandpoints.put(1, "Red");
        colorsandpoints.put(2, "Green");
        colorsandpoints.put(3, "Black");
        colorsandpoints.put(4, "White");
        colorsandpoints.put(5, "Blue");
        System.out.println(colorsandpoints.get(2));
    }
}
