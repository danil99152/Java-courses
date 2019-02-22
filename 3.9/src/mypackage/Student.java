package mypackage;
import java.util.ArrayList;

public class Student {
    String name;
    private ArrayList<Integer> point;


    public Student(String name) {
        this.name=name;
        this.point=new ArrayList<Integer>();

    }

    public void addPoint(int point) {
        this.point.add(point);
    }

    public double averagePoint() {
        double num=0;
        for(int i=0;i<point.size();i++) {
            num=num+point.get(i);
        }
        num=num/point.size();
        return num;
    }
}