package Ex01;

public class Main {
    public static void main(String[] args) {
        Input number = new Input();
        Year yearCheck = new Year();
        int year;

        year = number.setNumber();
        yearCheck.setYear(year);
        yearCheck.checkLeapYear();
    }
}
