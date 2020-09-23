package Ex01;

public class Year {
    private int year;

    public int setYear(int number){
        return year = number;
    }

    public void checkLeapYear(){
        if (year % 400 == 0) {
            System.out.println("Đây là năm nhuận");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Đây là năm nhuận");
        } else {
            System.out.println("Đây không phải năm nhuận");
        }
    }
}
