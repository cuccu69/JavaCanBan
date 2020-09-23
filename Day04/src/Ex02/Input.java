package Ex02;

import java.util.Scanner;

public class Input {
    private Scanner inputScanner;
    private int number;

    public int setNumber() {
        do {
            System.out.print("Please input a number in 0-11: ");
            inputScanner = new Scanner(System.in);
            while (!inputScanner.hasNextInt()) {
                System.out.print("Invalid, please enter again: ");
                inputScanner.next();
            }
            number = inputScanner.nextInt();
        }while (number < 0 || number > 11);

        return number;
    }
}
