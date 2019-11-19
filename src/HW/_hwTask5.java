package HW;

import java.util.HashMap;

public class _hwTask5 {
    public static void main(String[] args) {
        //5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
        HashMap<Integer, String> colorsandpoints = new HashMap<>();

        colorsandpoints.put(1, "Red");
        colorsandpoints.put(2, "Green");
        colorsandpoints.put(3, "Black");
        colorsandpoints.put(4, "White");
        colorsandpoints.put(5, "Blue");

        if (colorsandpoints.isEmpty()) {
            System.out.println("it is empty");
        } else {
            System.out.println("it is not empty" );
        }
    }}


