package HW;

import java.util.Scanner;

public class hwdays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your day");
        String day = scan.nextLine();



        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println(day + " is weekday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println(day + " is weekend");
                break;
            default:
                System.out.println("invalid");
                break;
        }}
    }
