import java.io.IOException;

public class DiviceTwoNumber {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public static double diviceNumber(int num1, int num2) throws ArithmeticException {
        if (num2 == 0){
            throw new ArithmeticException("Can not divice by zero");
        }
        return (num1 * 1f) / num2;
    }
}
