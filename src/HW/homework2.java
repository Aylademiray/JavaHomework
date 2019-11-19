package HW;

public class homework2 {
    public static void main(String[] args) {
        boolean haveone = false;
        for (int i = 0; i < 10; i++) {
            if (i == 1) {
                haveone = true;
            }
        }

        if(haveone) {
            System.out.println("you have 1 in array");
        }else{
            System.out.println("you dont have");
    }
}}
