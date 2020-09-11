import java.util.Scanner;

public class TestValidate {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int number = 0;

        System.out.print("Please enter an integer number: ");
        number = inputScanner.nextInt();

        if (number % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if( number % 5 == 0) {
            System.out.println("Fizz");
        } else if (number % 3 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }
}

