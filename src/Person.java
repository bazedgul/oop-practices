import java.util.Date;

public abstract class Person {
    private int ID;
    private String firstName;
    private String lastName;
    private int Age;
    private Date DOB;
    private String Address;
    private Campus campusName;
    private Departments departmentName;

    public Person() {
        this.ID = 0;
        this.firstName = null;
        this.lastName = null;
        Age = 0;
        this.DOB = null;
        Address = null;
        this.campusName = null;
        this.departmentName = null;
    }

    public Person(int ID, String firstName, String lastName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(int ID, String firstName, String lastName, int age, Date DOB, String address, Campus campusName, Departments departmentName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        Age = age;
        this.DOB = DOB;
        Address = address;
        this.campusName = campusName;
        this.departmentName = departmentName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Campus getCampusName() {
        return campusName;
    }

    public void setCampusName(Campus campusName) {
        this.campusName = campusName;
    }

    public Departments getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(Departments departmentName) {
        this.departmentName = departmentName;
    }

    public abstract String getInformation();

    @Override
    public String toString() {
        return "Person{" + "ID=" + ID + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", Age=" + Age + ", DOB=" + DOB + ", Address='" + Address + '\'' + ", campusName=" + campusName + ", departmentName=" + departmentName + '}';
    }
}
