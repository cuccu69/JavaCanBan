import javax.naming.spi.NamingManager;
import java.util.*;

import static java.util.Collections.*;

public class ListCourses extends NameComparator implements Comparator<Course> {
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

    public void sortByPrice(){
        Collections.sort(Courses);
    }

    public void sortByName(){
        Collections.sort(Courses, new NameComparator());
    }

    @Override
    public String toString() {
        return Courses.toString();
    }

    @Override
    public int compare(Course o1, Course o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
