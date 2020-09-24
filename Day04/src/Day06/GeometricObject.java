package Day06;

import java.util.Date;

public class GeometricObject implements Comparable<GeometricObject> {
    private String color;
    private boolean filled;
    private Date dateCreate;

    public GeometricObject(){

    }

    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreate(){
        return dateCreate;
    }

    public boolean isBigger(GeometricObject shape){
        return false;
    }

    @Override
    public String toString() {
        return "This is a " + getClass();
    }

    @Override
    public int compareTo(GeometricObject o) {
        return 0;
    }
}
