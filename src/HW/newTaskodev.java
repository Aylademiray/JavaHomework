package HW;

import day20.HW;

import java.util.HashMap;
import java.util.Map;

public class newTaskodev {
    //2. Write a Java program to count the number
    //  of key-value (size) mappings in a map.


    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");
          int  count = 0;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            count++;



            }
        System.out.println(map.size());



        }
    }

