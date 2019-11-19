package HW;

import java.util.HashMap;

public class Hw_Task6 {
   // Write a Java program to get a shallow copy of a HashMap instance.
   public static void main(String[] args) {
       HashMap<Integer, String> colorsandpoints = new HashMap<>();
       colorsandpoints.put(1, "Red");
       colorsandpoints.put(2, "Green");
       colorsandpoints.put(3, "Black");
       colorsandpoints.put(4, "White");
       colorsandpoints.put(5, "Blue");
       HashMap<Integer, String> colorsandpoints1 = new HashMap<>();
       colorsandpoints1.putAll(colorsandpoints);
       System.out.println(colorsandpoints1);

   }
}
