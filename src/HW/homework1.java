package HW;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class homework1 {
    //16. you have list of numbers, determine if you have duplication there
    //ex: [1, 2, 3, 4, 4, 5, 6]  => has duplications
    //ex2: [1, 2, 3] => no duplications
    public static void main(String[] args) {

     ArrayList<Integer> mySet = new ArrayList<>();

     mySet.add(1);
     mySet.add(6);
     mySet.add(33);
     mySet.add(33);
     mySet.add(7);
     mySet.add(52);
     mySet.add(2);

     HashSet<Integer> myList=new HashSet<>();




     for(Integer i :mySet){

      if(myList.add(i)==false){
       System.out.println("my duplicating number "+i);
       System.out.println("my list with duplicate"+mySet);

      }

     }
     System.out.println("myList with out duplicate"+myList);


     }}














