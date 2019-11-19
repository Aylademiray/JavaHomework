package HW;

import java.util.Scanner;

public class HWLoop {
    public static void main(String[] args) {

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number:");
        int number = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }

           */   for (int i = 0, j = 1, k = 2; i <= 10 && j <= 11 && k <= 12; i++, j = j + 2, k = j + 3) {
    System.out.println("i is: " + i);
      System.out.println("j is: " + j);
           System.out.println("k is: " + k); }
        for (int i = 1, j = 2; i <= 10 && j < 5 ; i++, j++) {
            // i = 1, j = 2
            // i = 2, j = 3
            // i = 3, j = 4
            // i = 4, j = 5
            System.out.println(i * j);
        }
        for(int i = Integer.MAX_VALUE;    ; i++){
          //  System.out.println(i);

//            if(i == 5){
//                break;
//            }
    }
}}