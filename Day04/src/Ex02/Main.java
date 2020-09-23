package Ex02;

public class Main {
    public static void main(String[] args) {
        Input number = new Input();
        Zodiac zodiacName = new Zodiac();

        zodiacName.checkZodiac(number.setNumber());
    }
}
