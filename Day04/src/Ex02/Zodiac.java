package Ex02;

public class Zodiac {
    private final String[] zodiac = {"Mouse", "Buffalo", "Tiger", "Cat", "Dragan", "Snake", "Horse", "Goat", "Monkey", "Chicken", "Dog", "Pick"};

    public void checkZodiac(int number) {
        System.out.printf("The zodiac is %s", zodiac[number]);
    }
}
