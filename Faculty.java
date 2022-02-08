public class Faculty {
    private String facultyName;
    private String facultyID;
    private String address;

    public Faculty(String facultyName, String facultyID, String address) {
        this.facultyName = facultyName;
        this.facultyID = facultyID;
        this.address = address;
    }
    private Course [] courseList = new Course[20];
    private int courseNumber = 0;

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyID() {
        return facultyID;
    }

    public void setFacultyID(String facultyID) {
        this.facultyID = facultyID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourseList() {
        return courseList;
    }

    public void setCourseList(String courseList) {
        this.courseList = courseList;
    }

}

