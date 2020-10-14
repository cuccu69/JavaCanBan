import java.util.ArrayList;
import java.util.List;

public class ListCourses {
    private ArrayList<Course> Courses = new ArrayList<>();

    public void addCourse(Course newCourse){
        Courses.add(newCourse);
    }

    public ArrayList<Course> findCourse(String name){
        ArrayList<Course> result = new ArrayList<>();
        for (Course items: Courses){
            if (items.getName().contains(name)){
                result.add(items);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return Courses.toString();
    }
}
