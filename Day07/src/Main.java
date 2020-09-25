import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner inputScanner = new Scanner(System.in);
        double result = 0;
        int num1 = 0;
        int num2 = 0;

        do {
            System.out.print("Enter two integer numbers: ");
            num1 = inputScanner.nextInt();
            num2 = inputScanner.nextInt();
            try {
                DiviceTwoNumber.diviceNumber(num1, num2);
            } catch (ArithmeticException ex) {
                System.out.println(ex);
            }
        }while(num2 == 0);

        result = DiviceTwoNumber.diviceNumber(num1, num2);
        System.out.println("The divice is: " + result);
    }
}
