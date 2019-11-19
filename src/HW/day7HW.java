package HW;

import java.util.Scanner;

public class day7HW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number");
        String s1 = scan .nextLine();


        if (s1.equals("zero")) {
            System.out.println(0);
        }

            if (s1.equals("one")) {
                System.out.println(1);
            }
            if (s1.equals("two")) {
                System.out.println(2);
            }
            if (s1.equals("three")){
                System.out.println(3);
        }
    }
}
