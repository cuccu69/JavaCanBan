public class Ex03 {
    public static void main(String[] args) {
        int month = -1;

        month = randomNumber(1, 12);
        System.out.print(month + " - ");
        printNameOfMonth(month);
    }

    public static int randomNumber(int min, int max) {
        int result;
        return result = (int) (Math.floor(Math.random() * (max - min + 1) + min));
    }

    public static void printNameOfMonth(int month){
        if (month % 12 == 0){//phép chia lấy phần dư, nếu chi cho 12 có phần dư là 0 -> Tháng 12
            System.out.println("Tháng mười hai");
        } else if (month % 11 == 1){
            System.out.println("Tháng một");
        } else if (month % 11 == 2){
            System.out.println("Tháng hai");
        } else if (month % 11 == 3){
            System.out.println("Tháng ba");
        } else if (month % 11 == 4){
            System.out.println("Tháng tư");
        } else if (month % 11 == 5){
            System.out.println("Tháng năm");
        } else if (month % 11 == 6){
            System.out.println("Tháng sáu");
        } else if (month % 11 == 7){
            System.out.println("Tháng bảy");
        } else if (month % 11 == 8){
            System.out.println("Tháng tám");
        } else if (month % 11 == 9){
            System.out.println("Tháng chín");
        } else if (month % 11 == 10){
            System.out.println("Tháng mười");
        } else {
            System.out.println("Tháng mười một");
        }
    }
}
