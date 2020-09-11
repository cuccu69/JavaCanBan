import java.awt.*;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Point point1 = new Point();

        point1.x = Ex01.inputIntegerNumber("Enter x position: ");
        point1.y = Ex01.inputIntegerNumber("Enter y position: ");

        System.out.println("Is point inside the rectangle: " + checkPointInOut(point1, 10, 5));
    }

    public static boolean checkPointInOut(Point checkPoint, float width, float height) {
        if (checkPoint.x >= -width / 2 && checkPoint.x <= width / 2 && checkPoint.y <= height / 2 && checkPoint.y >= -height / 2){
            return true;
        } else {
            return false;
        }
    }
}
