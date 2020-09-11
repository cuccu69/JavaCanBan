public class Ex02 {
    public static void main(String[] args) {
        int number;

//        yêu cầu nhập số cho đến khi đúng kiểu int và sẽ dừng lại khi đúng kiểu int và số trong khoảng 0 - 11. Hàm này được lấy từ bài 1 (do hàm static - hàm gloabal, nên class nào cũng gọi được)
        do {
        number = Ex01.inputIntegerNumber("Please enter a number from 0 - 11: ");
        }while (number < 0 || number > 11);

        checkZodiacName(number);
    }

//    hàm kiểm tra tên con giáp. có thể dùng switch case hoặc if-else
    public static void checkZodiacName(int number){
        if (number % 11 == 0){//phép chia lấy phần dư, nếu chi cho 11 có phần dư là 0 -> Tý
            System.out.println("Tý");
        } else if (number % 11 == 1){
            System.out.println("Sửu");
        } else if (number % 11 == 2){
            System.out.println("Dần");
        } else if (number % 11 == 3){
            System.out.println("Mão");
        } else if (number % 11 == 4){
            System.out.println("Thìn");
        } else if (number % 11 == 5){
            System.out.println("Tỵ");
        } else if (number % 11 == 6){
            System.out.println("Ngọ");
        } else if (number % 11 == 7){
            System.out.println("Mùi");
        } else if (number % 11 == 8){
            System.out.println("Thân");
        } else if (number % 11 == 9){
            System.out.println("Dậu");
        } else if (number % 11 == 10){
            System.out.println("Tuất");
        } else {
            System.out.println("Hợi");
        }
    }
}
