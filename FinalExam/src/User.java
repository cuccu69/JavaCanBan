import java.util.ArrayList;
import java.util.Date;

public class User {
    private ListCourses allCourses;
    private ArrayList<Course> myCourses;
    private String id = null;
    private String password = null;
    private boolean isMember;
    private boolean isLoggin;
    private Date createAccDate;

    public User(ListCourses allCourses) {
        this.allCourses = allCourses;
        isMember = false;
        isLoggin = false;
        myCourses = new ArrayList<Course>();
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public boolean isMember() {
        return isMember;
    }

    public boolean isLoggin() {
        return isLoggin;
    }

    public ListCourses getAllCourses() {
        return allCourses;
    }

    public Date getCreateAccDate() {
        return createAccDate;
    }

    public void registration(String id, String password) {
        this.id = id;
        this.password = password;
        isMember = true;
        isLoggin = true;
        createAccDate = new Date();
        System.out.println("Sign Up Success!");
    }

    public void login(String id, String password) {
        if (isMember()) {
            if (getId().equals(id) && getPassword().equals(password)) {
                isLoggin = true;
                System.out.println("Wellcome to the Website");
            } else {
                System.out.println("Wrong id/password! Please try again.");
            }
        } else {
            System.out.println("Please registration first!");
        }
    }

    public void logout() {
        isLoggin = false;
    }

    public void buyCourse(Course course) {
        if (isLoggin) {
            checkAndBuyCourse(course);
        } else {
            System.out.println("Please loggin or create account to buy course!");
        }
    }

    private void checkAndBuyCourse(Course course){
        if (course instanceof OfflineCourse && ((OfflineCourse) course).isAvailable()) {
            myCourses.add(course);
            ((OfflineCourse) course).addStudent(this);
            System.out.println("Buy course success");
        } else if(!(course instanceof OfflineCourse)){
            myCourses.add(course);
            System.out.println("Buy course success");
        } else if (course instanceof OfflineCourse && !((OfflineCourse) course).isAvailable()){
            System.out.println("The course is full or already started!");
        }
    }

    public ArrayList<Course> viewMyCourses() {
        return myCourses;
    }

    @Override
    public String toString() {
        return (isMember() ? "ID: " + getId() + "\n" + "Created day: " + getCreateAccDate() + "\n"
//                + "\n" + "\n" + "Courses bought: " + "\n" + viewMyCourses()
                : "Wellcome to the website! Please registration to buy courses.");
    }
}
