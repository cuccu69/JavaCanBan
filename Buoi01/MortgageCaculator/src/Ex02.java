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
        if (number % 12 == 0){//phép chia lấy phần dư, nếu chi cho 12 có phần dư là 0 -> Tý
            System.out.println("Tý");
        } else if (number % 12 == 1){
            System.out.println("Sửu");
        } else if (number % 12 == 2){
            System.out.println("Dần");
        } else if (number % 12 == 3){
            System.out.println("Mão");
        } else if (number % 12 == 4){
            System.out.println("Thìn");
        } else if (number % 12 == 5){
            System.out.println("Tỵ");
        } else if (number % 12 == 6){
            System.out.println("Ngọ");
        } else if (number % 12 == 7){
            System.out.println("Mùi");
        } else if (number % 12 == 8){
            System.out.println("Thân");
        } else if (number % 12 == 9){
            System.out.println("Dậu");
        } else if (number % 12 == 10){
            System.out.println("Tuất");
        } else {
            System.out.println("Hợi");
        }
    }
}
