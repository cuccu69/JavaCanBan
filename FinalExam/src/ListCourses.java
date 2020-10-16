import javax.naming.spi.NamingManager;
import java.util.*;

import static java.util.Collections.*;

public class ListCourses extends NameComparator {
    private ArrayList<Course> Courses = new ArrayList<>();

    public void addCourse(Course Course){
        Courses.add(Course);
    }

    public ArrayList<Course> findCourseByName(String name){
        ArrayList<Course> result = new ArrayList<>();
        for (Course items: Courses){
            if (items.getName().contains(name)){
                result.add(items);
            }
        }
        return result;
    }

    public ArrayList<Course> findCourseByPrice(int price, boolean isHigher){
        ArrayList<Course> result = new ArrayList<>();
        for (Course items: Courses){
            if (isHigher){
                if (items.getPrice() > price){
                    result.add(items);
                }
            }else {
                if (items.getPrice() <= price){
                    result.add(items);
                }
            }
        }
        return result;
    }

    public void sortByPrice(){
        Courses.sort(Course::compareTo);
    }

    public void sortByName(){
        Courses.sort(new NameComparator());
    }

    @Override
    public String toString() {
        return Courses.toString();
    }
}
