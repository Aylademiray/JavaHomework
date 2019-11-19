package HW;

import java.util.Scanner;

public class javaday10Hw {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
System.out.println("please type in your quiz score");
    int quiz = scan.nextInt();
System.out.println("please type in your mmidterm score");
    int midterm = scan.nextInt();
System.out.println("please type in your finals");
    int finals = scan.nextInt();

    int average = ((quiz + midterm + finals) / 3);
System.out.println("your average score is:" + average);
if (average > +90) {
        System.out.println("your grade is A");
    }
else if(average >=70){
        System.out.println("your grade is B");
}}}
