package HW;

import java.util.HashMap;

public class Hw_Task12 {
    //12. Write a Java program to get a collection view of the values contained in this map.
    public static void main(String[] args) {
        HashMap<Integer, String> colorsandpoints = new HashMap<>();

        colorsandpoints.put(1, "Red");
        colorsandpoints.put(2, "Green");
        colorsandpoints.put(3, "Black");
        colorsandpoints.put(4, "White");
        colorsandpoints.put(5, "Blue");
        System.out.println(colorsandpoints.values());
    }
}
