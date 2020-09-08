import java.util.Arrays;
import java.util.Scanner;

public class MortgageCaculator {
    public static void main(String[] args) {
//        Khai báo biến cần sử dụng. Khi khai báo cần khởi tạo luôn giá trị ban đầu. Về sau sẽ gán lại trong quá trình làm
        Scanner inputScanner = new Scanner(System.in);
        int loanAmount = 0;
        int loanPeriodByYear = 0;
        float interestRateByYear = 0f;
        float interestRateByMonth = 0f;
        double mortgage = 0;
        double periodByMonth = 0;


//      Gán lại dữ liệu bằng cách nhập dữ liệu qua console
        System.out.print("Enter loan amount: ");
        loanAmount = inputScanner.nextInt();
        System.out.print("Enter loan period: ");
        loanPeriodByYear = inputScanner.nextInt();
        System.out.print("Enter loan interest rate: ");
        interestRateByYear = inputScanner.nextFloat();

//        Tính toán và gán lại các dữ liệu cần có
        periodByMonth = loanPeriodByYear * 12;
        interestRateByMonth = interestRateByYear / 12;
        mortgage = loanAmount * ((interestRateByMonth * Math.pow(1 + interestRateByMonth, periodByMonth)) / ((Math.pow(1 + interestRateByMonth, periodByMonth)) - 1));
        System.out.print("Payment amount by monthly: " + mortgage);
    }
}
