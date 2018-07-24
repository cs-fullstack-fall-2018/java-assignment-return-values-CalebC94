import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = 33;
        int number1 = 45;
        System.out.println(("The largest number is:" + largestNumber(number, number1)));
    }

    public static int largestNumber(int number, int number1) {
        if (number1 > number) {
            return number1;
        } else {
            return number;
        }
    }
}

