public class Students {
    private String studentID;
    private String studentName;
    private String address;
    private Course[] courseList = new Course[20];
    private int courseNumber = 0;


    public Students(String studentID, String studentName, String[] courseList, String address) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.address = address;
    }


    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public Course[] getCourseList() {
        for (int i = 0; i <courseNumber; i++){
            System.out.println(courseList[i].getCourseName());
        }
        return courseList;
    }

    public void setCourseList(Course[] courseList) {
        this.courseList = courseList;
    }

    public void addCourse (Course courses) {
        for (int i = 0; i < courseNumber; i++) {
            courseList[courseNumber] = courses;
            courseNumber++;
        }
    }

    public void dropCourse (Course courses){
        courseList[courseNumber] = courses;
        courseNumber--;
    }
}

