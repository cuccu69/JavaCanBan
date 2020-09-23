public class Ex06 {
    public static void main(String[] args) {
        System.out.printf("You just picked %s %s", pickCardValue(), pickCardType());//đây là 1 kiểu in ra màn hình khác.
    }

//    hàm chọn random giá trị của quân bài
    public static String pickCardValue(){
        String result = "";
        int number = Ex03.randomNumber(1, 13);//bộ bài có 13 giá trị nên chọn random 1 giá trị từ 1 -> 13

        if (number % 13 == 0){
            result = "King";//number = 13 -> quân K
        } else if (number % 13 == 1){
            result = "Ace";// number = 1 -> quân Át
        }else if (number % 13 == 2){
            result = "2";
        }else if (number % 13 == 3){
            result = "3";
        }else if (number % 13 == 4){
            result = "4";
        }else if (number % 13 == 5){
            result = "5";
        }else if (number % 13 == 6){
            result = "6";
        }else if (number % 13 == 7){
            result = "7";
        }else if (number % 13 == 8){
            result = "8";
        }else if (number % 13 == 9){
            result = "9";
        }else if (number % 13 == 10){
            result = "10";
        }else if (number % 13 == 11){
            result = "Jack";
        }else if (number % 13 == 12){
            result = "Queen";
        }

        return result;
    }

    public static String pickCardType(){
        String result = "";
        int number = Ex03.randomNumber(1, 4);//bộ bài có 4 chất, chọn random ra 1 chất

        if(number % 4 == 0){
            result = "spades";//number = 4 là bích
        } else if (number % 4 == 1){
            result = "heart";//number = 1 là cơ
        } else if (number % 4 == 2){
            result = "diamond";//number = 2 là rô
        } else {
            result = "club";//number = 3 là nhép
        }

        return result;
    }
}
