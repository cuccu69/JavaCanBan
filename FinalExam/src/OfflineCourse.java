import java.util.ArrayList;
import java.util.Date;

public class OfflineCourse extends Course {
    private final int NUM_OF_STUDENTS = 15;
    private boolean isAvailable;
    private int studenCounting;
    private java.util.Date startDay;
    private ArrayList<User> students;

    public OfflineCourse(String name, int price, String type, ListCourses courses, java.util.Date startDay) {
        super(name, price, type, courses);
        this.startDay = startDay;
        studenCounting = 0;
        isAvailable = true;
        students = new ArrayList<>();
    }

    public int getStudenCounting() {
        return studenCounting;
    }

    public ArrayList<User> getStudents() {
        return students;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public int getNUM_OF_STUDENTS() {
        return NUM_OF_STUDENTS;
    }

    public boolean isAvailable() {
        if (getStudenCounting() < getNUM_OF_STUDENTS() && getStartDay().before(new Date())){
            return true;
        } else {
            return false;
        }
    }

    public void addStudent(User user) {
            this.studenCounting++;
            students.add(user);
    }

    @Override
    public String toString() {
        return "\n" + "Name: " + getName() + "\n" +"Price: " + getPrice() + "\n" + "Type: " + getType()
                + "\n" + "Available: " + isAvailable() + "\n" + "Students: " + getStudenCounting() + "/" + getNUM_OF_STUDENTS()
                + "\n" + "Start date: " + getStartDay() + "\n";
    }
}
