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
        float interestRateByYear = 0f;
        float interestRateByMonth = 0f;
        double mortgage = 0;
        double periodByMonth = 0;


//      Gán lại dữ liệu bằng cách nhập dữ liệu qua console
        System.out.print("Enter loan amount: ");
        loanAmount = inputScanner.nextInt();//biến inputScanner nhập giá trị vào từ màn hình, ở đây nhập kiểu Int
        System.out.print("Enter loan period by year: ");
        loanPeriodByYear = inputScanner.nextInt();//biến inputScanner nhập giá trị vào từ màn hình, ở đây nhập kiểu Int
        System.out.print("Enter loan interest rate by year: ");
        interestRateByYear = inputScanner.nextFloat();//biến inputScanner nhập giá trị vào từ màn hình, ở đây nhập kiểu Float


//        Tính toán và gán lại các dữ liệu cần có
        periodByMonth = loanPeriodByYear * 12;
        interestRateByMonth = interestRateByYear / 12;

//        tính toán ra số tiền phải trả theo tháng và in ra màn hình
        mortgage = loanAmount * ((interestRateByMonth * Math.pow(1 + interestRateByMonth, periodByMonth)) / ((Math.pow(1 + interestRateByMonth, periodByMonth)) - 1));
        System.out.print("Payment amount by monthly: " + mortgage);
    }
}
