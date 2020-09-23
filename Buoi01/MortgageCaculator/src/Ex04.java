public class Ex04 {
    public static void main(String[] args) {
        int edge1 = 0;
        int edge2 = 0;
        int edge3 = 0;

        do {
            edge1 = Ex01.inputIntegerNumber("Plese enter the largest edge: ");
        } while (edge1 <= 0);
        do {
            edge2 = Ex01.inputIntegerNumber("Please enter second edge: ");
        } while (edge2 > edge1 || edge2 <= 0);

        do {
            edge3 = Ex01.inputIntegerNumber("Please enter third edge: ");
        } while (edge3 > edge1 || edge3 <= 0);

        if (checkConditionCreateTriangle(edge1, edge2, edge3)) {
            System.out.println("Triangle perimeter: " + countTrianglePerimeter(edge1, edge2, edge3));
        } else {
            System.out.println("Cannot create a triangle with these 3 edges");
        }
    }

    public static int countTrianglePerimeter(int edge1, int edge2, int edge3) {
        int result;

        return result = edge1 + edge2 + edge3;
    }

    public static boolean checkConditionCreateTriangle(int longgestEdge, int edge2, int edge3) {
        return (edge2 + edge3) > longgestEdge;
    }

    public static int findBiggestNumberAmongThree(int num1, int num2, int num3){
        if (num1 > num2){
            if (num1 > num3){
                return num1;
            }else {
                return num3;
            }
        }else {
            if (num2 > num3){
                return num2;
            }else {
                return num3;
            }
        }
    }
}
