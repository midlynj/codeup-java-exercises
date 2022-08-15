package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList <Integer> grades;

//    public static void main(String[] args) {
//
//        System.out.println("grades = " + grades);
//
//
//    }

    public Student(String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();

    }

    public String getStudentName() {
        return studentName;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
       double average = 0;
        for (int grade : grades) {
//           System.out.println( average += grade);
//           grades / grades.size();
            average += grade;
//            average / grades.size();
        }
        return average / grades.size();
    }

    public ArrayList<Integer> getGrade() {
       return grades;
    }
}
