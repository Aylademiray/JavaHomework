package HW;

import day20.HW;

import java.util.HashMap;
import java.util.Set;

public class HwTask2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");
        System.out.println(map);
        Set set = map.entrySet();
        System.out.println(set);





        HashMap<Integer, String> map2 = new HashMap<>(map);
        System.out.println(map2);
    }
}
