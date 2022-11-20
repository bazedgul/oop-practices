public class Student extends Person {
    private int Semester;
    private double CGPA;

    public Student(int ID, String firstName, String lastName, int semester, double CGPA) {
        super(ID, firstName, lastName);
        Semester = semester;
        this.CGPA = CGPA;
    }

    public Student() {
        this.Semester = 0;
        this.CGPA = 0.0;
    }

    public Student(int semester, double CGPA) {
        this.Semester = semester;
        this.CGPA = CGPA;
    }

    public int getSemester() {
        return Semester;
    }


    public void setSemester(int semester) {
        Semester = semester;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Semester=" + Semester +
                ", CGPA=" + CGPA +
                '}';
    }

    @Override
    public String getInformation() {
        return "Student{" +
                "ID Number = " + getID() +
                ", First Name = " + getFirstName() +
                ", Last Name = " + getLastName() +
                ", Semester = " + getSemester() +
                ", CGPA = " + getCGPA() +
                '}';
    }
}
