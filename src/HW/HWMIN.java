package HW;

public class HWMIN {
    public static void main(String[] args) {
       int a = 2;
        int b = 5;

        // here the question mark means if
        // : symbol means else
        int min = (a <= b) ? a : b;

        if (a <= b) {
            min = a;
        } else {
            min = b;
        }

        System.out.println(min);
    }
    }

