import java.util.ArrayList;

public class Course {
    private String courseName;
    private String students;
    private int numStudents;
    private ArrayList <Students> Students = new ArrayList<Students>();

    public Course(String courseName, String students, int numStudents) {
        this.courseName = courseName;
        this.students = students;
        this.numStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    public void setStudents(ArrayList<Students> students) {
        Students = students;
    }

    public void addStudents(String students){
        numStudents++;
        Students.add(students);
    }

    public void dropStudents(String students){
        int i = 0;
        if Students = students.getClass().getName();
        for (int i = 0; i < Students.size();i++){
            Students.remove(students);
        }

    }





}

