package HW;

import java.util.HashSet;
import java.util.Set;

public class HwTask_2 {
  //  Write a Java program to iterate through all elements in a hash list.
  public static void main(String[] args) {
      Set<Integer> setnumbers = new HashSet<>();
      setnumbers.add(1);
      setnumbers.add(4);
      setnumbers.add(6);
      setnumbers.add(8);
      for (Integer i : setnumbers) {
          System.out.println(i);
      }

  }
}
