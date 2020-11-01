import java.util.ArrayList;
import java.util.List;
public class Student {
    private String name;
    private double average_grade;
    private List<String> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage_grade() {
        return average_grade;
    }

    public void setAverage_grade(double average_grade) {
        this.average_grade = average_grade;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void addCourse(String name) {
        courses.add(name);
    }

    public int get_no_courses()//Method used to return number of courses of a student
    {
        return this.courses.size();
    }

    public Student(String name, double average_grade, ArrayList<String> courses) {
        super();
        this.name = name;
        this.average_grade = average_grade;
        this.courses = courses;
    }
}
