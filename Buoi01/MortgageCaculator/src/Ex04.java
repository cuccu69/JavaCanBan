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
}
