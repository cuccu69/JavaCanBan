package Ex01;

import java.util.Scanner;

public class Input {
    private Scanner inputScanner;
    private int number;

    public int setNumber() {
        System.out.print("Please input a number: ");
        inputScanner = new Scanner(System.in);
//        while (!inputScanner.hasNextInt()) {
//            System.out.print("Invalid, please enter again: ");
//            inputScanner.next();
//        }
//        number = inputScanner.nextInt();

        return number;
    }

    public static void main(String[] args) {
        Input input1 = new Input();

        input1.setNumber();
    }
}
