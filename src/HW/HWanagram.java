package HW;

import day20.HW;

import java.util.Arrays;

public class HWanagram {
    public static void main(String[] args) {


    String a = "anagram";
    String  b= "nagaram";

    char[] c = a.toCharArray();
        System.out.println(c);
        Arrays.sort(c);
        System.out.println(c);

    char[] d = b.toCharArray();
        System.out.println(d);
        Arrays.sort(d);
        System.out.println(d);

    boolean e =true;
        for(int i=0;i<d.length;i++) {
        if (c[i] == d[i]) {
           e =true;
            System.out.println(e);
            break;

        }
}}}
