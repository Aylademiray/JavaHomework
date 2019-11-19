package HW;

import java.util.Scanner;

public class HWJavaSwitch2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of the day");
        int dayofweek = scan.nextInt();
        switch (dayofweek ){

            case 1:
                System.out.println("Monday is weekday");
                break;
            case 2:
                System.out.println("Tuesday is weekday");
                break;
            case 3:
                System.out.println("Wednesday is weekday");
                break;
            case 4:
                System.out.println("Thursday is weekday");
                break;
            case 5:
                System.out.println("Friday is weekday");
                break;
            case 6:
                System.out.println("Saturday is weekend");
                break;
            case 7:
                System.out.println("Sunday is weekend");


        }
    }
}
