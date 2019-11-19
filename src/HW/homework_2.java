package HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class homework_2 {
    public static void main(String[] args) {

        ArrayList<Integer> myset = new ArrayList<>();

        myset.add(1);
        myset.add(6);

        myset.add(33);
        myset.add(33);
        myset.add(7);
        myset.add(52);
        myset.add(2);


        Collections.shuffle(myset);
        System.out.println("shuffled set");
        for(Integer num :myset){
            System.out.println(num);
        }


            }}
