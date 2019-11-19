package HW;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class HWTask__ {


    //1. Write a Java program to associate the specified value with the specified key in a HashMap.
    public static void main(String[] args) {


        String[] firstNames = {"Max", "Drake", "Susan"};
        String[] lastNames = {"Smith", "Jones", "Miller"};
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < firstNames.length; i++) {
            String key = firstNames[i];
            String value = lastNames[i];
            map.put("Max","Miller");




        }
        System.out.println(map);
    }}



