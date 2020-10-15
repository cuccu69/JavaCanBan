import java.util.Comparator;

public class Course implements Comparable<Course> {
    private String name;
    private int price;
    private String type;

    public Course(String name, int price, String type, ListCourses courses) {
        this.name = name;
        this.price = price;
        this.type = type;
        courses.addCourse(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int compareTo(Course o) {
        return price - (o.price);
    }

    @Override
    public String toString() {
        return "\n" + "Name: " + getName() + "\n" +"Price: " + getPrice() + "\n" + "Type: " + getType()
                + "\n";
    }
}
