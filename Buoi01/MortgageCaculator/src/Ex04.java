public class Ex04 {
    public static void main(String[] args) {
        int edge1 = 0;
        int edge2 = 0;
        int edge3 = 0;

        edge1 = Ex01.inputIntegerNumber("Plese enter the largest edge: ");
        do {
            edge2 = Ex01.inputIntegerNumber("Please enter second edge: ");
        } while (edge2 > edge1);

        do {
            edge3 = Ex01.inputIntegerNumber("Please enter third edge: ");
        } while (edge3 > edge1);

        System.out.println("Triangle perimeter: " + countTrianglePerimeter(edge1, edge2, edge3));
    }

    public static int countTrianglePerimeter(int edge1, int edge2, int edge3) {
        int result;

        return result = edge1 + edge2 + edge3;
    }
}
