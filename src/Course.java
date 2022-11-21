public class Course extends Teacher {
    private String courseName;
    private String teacher;
    private int semester;

    public Course() {
        this.courseName = null;
        this.teacher = null;
        this.semester = 0;
    }
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", teacher='" + teacher + '\'' +
                ", semester=" + semester +
                '}';
    }

    public Course(String courseName, String teacher, int semester) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
