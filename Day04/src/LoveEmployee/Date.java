package LoveEmployee;

public class Date {
    private java.util.Date today;

    public Date(){
        today = new java.util.Date();
    }

//    @Override
//    public String toString() {
//        return "Today is " + today.
//    }

    public static void main(String[] args) {
        System.out.println(new Date().toString());
    }
}
