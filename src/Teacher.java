import java.time.Year;
import java.util.Date;

public class Teacher extends Person {
    private Date joiningDate;
    private double Salary;

    public Teacher() {
        this.joiningDate = null;
        this.Salary = 0.0;
    }

    public Teacher(int ID, String firstName, String lastName, Date joiningDate, double salary) {
        super(ID, firstName, lastName);
        this.joiningDate = joiningDate;
        this.Salary = salary;
    }

    public Teacher(Date joiningDate, double salary) {
        this.joiningDate = joiningDate;
        this.Salary = salary;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "joiningDate=" + joiningDate +
                ", Salary=" + Salary +
                '}';
    }

    @Override
    public String getInformation() {
        return "Teacher{" +
                "ID Number = " + getID() +
                ", First Name = " + getFirstName() +
                ", Last Name = " + getLastName() +
                ", joiningDate=" + joiningDate +
                ", Salary=" + Salary +
                '}';
    }

    public double CalculateBonus() {
        if (Year.now().getValue() - joiningDate.getYear() >= 3) {
            return getSalary() / 100 * 70;
        } else {
            return getSalary() / 100 * 40;
        }
    }
}
