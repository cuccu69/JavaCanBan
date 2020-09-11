import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int year;

        year = inputIntegerNumber("Please enter a number: ");
        checkLeapYear(year);
    }

//    Viết function kiểm tra năm đó có phải năm nhuận không. Năm nhuận là năm chia hết cho 4 nhưng ko chia hết cho 100. đặc biệt chia hết cho 400 là năm nhuận
    public static void checkLeapYear(int year){//kiểu trả về là void (thường là in ra console), tham số year kiểu int
        if (year % 400 == 0) {//xét trường hợp đặc biệt trước. vì trường hợp này bao hàm khả năng chia hết cho 4 và 100
            System.out.println("Đây là năm nhuận");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Đây là năm nhuận");
        } else {
            System.out.println("Đây không phải năm nhuận");
        }
    }

//    Viết function nhập 1 số nguyên từ màn hình có validate cho chuẩn kiểu dữ liệu. Số nhập vào là 1 số nguyên thì mới dừng yêu cầu nhập
    public static int inputIntegerNumber(String require){
        Scanner inputScanner = new Scanner(System.in);
        int number;

        System.out.print(require);
        while (!inputScanner.hasNextInt()) {
            System.out.print("Invalid, please enter again: ");
            inputScanner.next();
        }
        number = inputScanner.nextInt();

        return number;
    }
}
