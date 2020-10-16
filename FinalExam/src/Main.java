import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ListCourses allCourses = new ListCourses();
        Course testCourse1 = new Course("PHP Fullstack", 100_000, "Offline", allCourses);
        Course testCourse2 = new Course("Java Fullstack", 90_000, "Online", allCourses);
        var testCourse3 = new OfflineCourse("Front-end", 1_500_000, "Offline", allCourses, new Date(2020 - 1900, 9, 20));
        User user1 = new User(allCourses);
        User user2 = new User(allCourses);
        User user3 = new User(allCourses);

        //de tim khoa hoc thi lay ra Listcourses roi dung method findCourse
        user1.registration("cuong1", "cuong123");
        user2.registration("cuong2", "cuong123");
        user3.registration("cuong3", "cuong123");

//        user1.buyCourse(testCourse3);
//        user1.getAllCourses().sortByName();
//        System.out.println(allCourses);
//        System.out.println(user1.getAllCourses().findCourse("ull"));
//        System.out.println(user1.getAllCourses().findCourseByPrice(100_000, true));
//        allCourses.sortByName();
//        System.out.println(allCourses);
    }
}
