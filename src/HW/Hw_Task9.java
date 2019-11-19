package HW;

import java.util.HashMap;
import java.util.Set;

//9. Write a Java program to create a set view of the mappings contained in a map.
public class Hw_Task9 {
    public static void main(String[] args) {
        HashMap<Integer, String> colorsandpoints = new HashMap<>();

        colorsandpoints.put(1, "Red");
        colorsandpoints.put(2, "Green");
        colorsandpoints.put(3, "Black");
        colorsandpoints.put(4, "White");
        colorsandpoints.put(5, "Blue");
        Set set = colorsandpoints.entrySet();
        System.out.println(set);
    }
}
