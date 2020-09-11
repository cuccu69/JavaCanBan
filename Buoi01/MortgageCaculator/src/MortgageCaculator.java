import java.text.Format;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class MortgageCaculator {

    public static void main(String[] args) {
//        Khai báo biến cần sử dụng. Khi khai báo cần khởi tạo luôn giá trị ban đầu. Về sau sẽ gán lại trong quá trình làm
        Scanner inputScanner = new Scanner(System.in);//khai báo biến tên inputScanner có kiểu là Scanner. Biến inputScanner sẽ được nhập vào từ bàn phím (System.in)
        int loanAmount = 0;
        int loanPeriodByYear = 0;
        double interestRateByYear = 0;
        double interestRateByMonth = 0;
        double mortgage = 0;
        double periodByMonth = 0;


//      Gán lại dữ liệu bằng cách nhập dữ liệu qua console
        System.out.print("Enter loan amount: ");
        do {
            System.out.println("Please enter a number in range 1.000 - 1.000.000");
            while (!inputScanner.hasNextInt()) {
                System.out.println("This is not a number");
                inputScanner.next();
            }
            loanAmount = inputScanner.nextInt();//biến inputScanner nhập giá trị vào từ màn hình, ở đây nhập kiểu Int
        } while (loanAmount < 1_000 || loanAmount > 1_000_000);

        System.out.print("Enter loan period by year: ");
        do {
            System.out.println("Please enter a number in range 1 - 30");
            while (!inputScanner.hasNextInt()) {
                System.out.println("This is not a number");
                inputScanner.next();
            }
            loanPeriodByYear = inputScanner.nextInt();//biến inputScanner nhập giá trị vào từ màn hình, ở đây nhập kiểu Int
        } while (loanPeriodByYear <= 0 || loanPeriodByYear > 30);

        System.out.print("Enter loan interest rate by year: ");
        do {
            System.out.println("Please enter a number in range 1 - 30");
            while (!inputScanner.hasNextDouble()) {
                System.out.println("This is not a number");
                inputScanner.next();
            }
            interestRateByYear = inputScanner.nextFloat();//biến inputScanner nhập giá trị vào từ màn hình, ở đây nhập kiểu Float
        } while (interestRateByYear <= 0 || interestRateByYear > 30);


//        Tính toán và gán lại các dữ liệu cần có
        periodByMonth = loanPeriodByYear * 12;
        interestRateByMonth = interestRateByYear / 12;

//        tính toán ra số tiền phải trả theo tháng và in ra màn hình
        mortgage = loanAmount * ((interestRateByMonth * Math.pow(1 + interestRateByMonth, periodByMonth)) / ((Math.pow(1 + interestRateByMonth, periodByMonth)) - 1));
        System.out.print("Payment amount by monthly: " + mortgage);
    }
}
