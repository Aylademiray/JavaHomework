package HW;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number: ");
        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){ // prints as 1,2,3, up to your num
            System.out.println(i);
        }
    }
}
