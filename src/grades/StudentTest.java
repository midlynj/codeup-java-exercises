package grades;

public class StudentTest {

    public static void main(String[] args) {

        Student joeey = new Student("joey");
        joeey.addGrade(20);
        joeey.addGrade(50);
        joeey.addGrade(60);

        System.out.println(joeey.getGrade());
        System.out.println(joeey.getGradeAverage());
    }
}
