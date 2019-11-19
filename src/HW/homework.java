package HW;

public class homework {

    //Task 1. write a for loop that finds an maximum for the array
    //Task 2. write a for loop that finds an minimum for the array
    //Task 3. write a for loop that finds an average for the array
    // int[] myArray = {34,5,6,2,3,78,1}
    //OUTPUT: average: (34+5+6+2+3+78+1)/7

    public static void main(String[] args) {
//        int[] myArray = {34,5,6,2,3,78,1};
        int[] myArray = {34, 5, 6, 3};

        int max = 3;// maximmum numarayi bulmak icin minunum numarayi vermen lazimki ordan baslasun .MIN_VALUE da kullanilabilir
        int min = 34;// minumumu bulmak iicinde maximumdan baslayip loopa domnucek .MAX_VALUE da kullanilabilinir

        for (int i = 0; i < myArray.length; i++) {
            int currentNumber = myArray[i];

            if (currentNumber > max) {
                max = currentNumber;
            }
            if (currentNumber < min) {
                min = currentNumber;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        int i, sum;
        double average;
        sum = 0;

        for (i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }



        for (int currentNumber : myArray) {
            sum += currentNumber;
        }
        double average1 = (double) sum / myArray.length;
        System.out.println("Average:  " + average1);
    }
}
