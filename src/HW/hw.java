package HW;

import java.util.Scanner;

public class hw {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("please provide a number");
        int number = scan.nextInt();
        for( int i = 0; i<= 10; i++){
            System.out.println(number*i);
                }
    }
}
