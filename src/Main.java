import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person student = new Student(1,"Bazed","Gul",5,2.7);
        System.out.println(student.getInformation());
        Teacher teacher = new Teacher(2,"Umi","Hassan",new Date(2019,5,25),10000);
        System.out.println(teacher.getInformation());
        System.out.println(teacher.CalculateBonus());
        Teacher teacher1 = new Teacher(2,"Umi","Hassan",new Date(2021,5,25),10000);
        System.out.println(teacher1.getInformation());
        System.out.println(teacher1.CalculateBonus());
    }
}
