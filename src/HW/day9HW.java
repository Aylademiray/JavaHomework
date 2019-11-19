package HW;

import java.util.Scanner;

public class day9HW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please provide a number");

        int number = scan .nextInt();

        System.out.println("your number is "+ number);
        System.out.println("please provide a second number");
        int number2 = scan .nextInt();
        System.out.println("your second number is "+ number2);
        System.out.println("the sum of your two number is");
        int sum = (number + number2);
        System.out.println(sum);
    }
}
