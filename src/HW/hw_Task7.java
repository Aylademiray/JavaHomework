package HW;

import java.util.HashMap;

public class hw_Task7 {

    //7. Write a Java program to test if a map contains a mapping for the specified key.
    public static void main(String[] args) {
        HashMap<Integer, String> colorsandpoints = new HashMap<>();

        colorsandpoints.put(1, "Red");
        colorsandpoints.put(2, "Green");
        colorsandpoints.put(3, "Black");
        colorsandpoints.put(4, "White");
        colorsandpoints.put(5, "Blue");
        System.out.println(colorsandpoints.containsKey(3));

    }
}
