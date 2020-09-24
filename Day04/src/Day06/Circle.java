package Day06;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.printf("This is a circle with radius is %.2f, area is %.2 and perimeter is %.2f", radius, getArea(), getPerimeter());
    }

    @Override
    public String toString() {
        return "This is a circle with radius is " + radius + " area is " + getArea() + " and perimeter is " + getPerimeter();
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (o instanceof Circle) {
            Circle newCircle = (Circle) o;
            if (getPerimeter() > newCircle.getPerimeter()) {
                return 1;
            } else if (getPerimeter() == newCircle.getPerimeter()) {
                return 0;
            } else {
                return -1;
            }
        }else {
            return -100;
        }
    }
}
