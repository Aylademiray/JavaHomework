package HW;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//2. Write a Java program to count the number of key-value (size) mappings in a map.
public class HwHashmap {
    public static void main(String[] args) {


        HashMap<Integer, String> colorsandpoints = new HashMap<>();

        colorsandpoints.put(1, "Red");
        colorsandpoints.put(2, "Green");
        colorsandpoints.put(3, "Black");
        colorsandpoints.put(4, "White");
        colorsandpoints.put(5, "Blue");
        Integer keyvaluesize = colorsandpoints.size();


        System.out.println(keyvaluesize);
    }}