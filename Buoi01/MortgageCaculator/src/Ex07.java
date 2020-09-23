import java.awt.*;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        int[] Nums = {0,2,4,7,11,15,20,24,28,30};

        int result = binarySearch(Nums, 30);

        System.out.println(result);
    }

    public static int binarySearch(int[] Nums, int target) {
        int result = -2;
        int index = Nums.length / 2;

        if (Nums[index] > target) {
            while (Nums[index] > target) {
                result = index;
                index = index / 2;
            }
        } else {
            while (Nums[index] <= target) {
                result = index;
                index = (index + Nums.length) / 2;
            }
        }

        return result;
    }
}
