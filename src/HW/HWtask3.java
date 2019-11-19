package HW;

import day20.HW;

import java.util.HashMap;

public class HWtask3 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");
        HashMap<Integer, String> map2 = new HashMap<>(map);
        System.out.println(map2);
    }
}
