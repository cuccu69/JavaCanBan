import java.util.Scanner;

public class TestValidate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int intNum = sc.nextInt();
        System.out.println("Please enter a vowel, lowercase!");
        while (!sc.hasNext("[aeiou]")) {
            System.out.println("That's not a vowel!");
            sc.next();
        }
        String vowel = sc.next();
        System.out.println("Thank you! Got " + vowel);
    }
}
