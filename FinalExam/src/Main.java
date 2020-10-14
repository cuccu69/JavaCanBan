import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ListCourses allCourses = new ListCourses();
        Course testCourse1 = new Course("Java Fullstack", 100_000, "Offline", allCourses);
        Course testCourse2 = new Course("PHP Fullstack", 90_000, "Online", allCourses);
        var testCourse3 = new OfflineCourse("Front-end", 1_500_000, "Offline", allCourses, new Date(2020 - 1900, 9, 20));
        User user1 = new User(allCourses);
        User user2 = new User(allCourses);
        User user3 = new User(allCourses);

        user1.registration("cuong1", "cuong123");
        user2.registration("cuong2", "cuong123");
        user3.registration("cuong3", "cuong123");

        user1.buyCourse(testCourse3);
//        user2.buyCourse(testCourse3);
//        user2.buyCourse(testCourse3);

//        System.out.println(user1);

//        System.out.println(testCourse3);
//        System.out.println(testCourse3.getStudents());
//        System.out.println(testCourse3);

        System.out.println(user1.viewMyCourses());
    }
}
