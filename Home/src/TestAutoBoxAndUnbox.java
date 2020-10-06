public class TestAutoBoxAndUnbox {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        System.out.println(intArray[0] + intArray[1] + intArray[2]);

        int num1 = 1 + intArray[2];
        Integer num2 = 11;

        System.out.println(num1);
        System.out.println(intArray[0].compareTo(intArray[2]));
    }
}
