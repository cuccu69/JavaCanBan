import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayCourses allCourses = new ArrayCourses();
        Course testCourse1 = new Course("Java Fullstack", 100_000, "Offline", allCourses);
        Course testCourse2 = new Course("PHP Fullstack", 90_000, "Online", allCourses);
        var testCourse3 = new OfflineCourse("Front-end", 1_500_000, "Offline", allCourses, new Date(2020 - 1900, 11, 20));
        User user1 = new User(allCourses);
        User user2 = new User(allCourses);

        user1.registration("cuong", "cuong123");
        user2.registration("cuong", "cuong123");

        user1.buyCourse(testCourse3);

//        System.out.println(user1);

        System.out.println(testCourse3);
//        System.out.println(testCourse3.getStudents());
    }
}
