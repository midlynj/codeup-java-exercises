package grades;

import java.util.HashMap;

public class GradesApplication {




    public static void main(String[] args) {

       HashMap <String, Student > students = new HashMap<>();
       Student joey = new Student("Joey");
        joey.addGrade(60);
        joey.addGrade(20);
        joey.addGrade(30);
        System.out.println("joey.getGrade() = " + joey.getGrade());
       Student katara = new Student("Katara");
        katara.addGrade(20);
        katara.addGrade(40);
        katara.addGrade(30);
        System.out.println("katara.getGrade() = " + katara.getGrade());

       Student kairo = new Student("Kairo");


       Student levi = new Student("Levi");



        students.put("JoeyDaGOAT",joey);


//        students.put("Water Bending Girl", new Student("Katara"));
//        students.put("PrinceOF Egypt",new Student("Kairo"));
//        students.put("Humanity Strongest Soldier", new Student("Levi"));

//        System.out.println(students);
//        System.out.println("students.get(\"JoeyDaGoat\") = " + students.get("JoeyDaGoat"));
//        System.out.println("students.containsKey(\"Joey\") = " + students.containsKey("JoeyDaGOAT"));
//        System.out.println("students.containsValue(\"Joey\") = " + students.containsValue(joey));
//        System.out.println("students.containsKey(joey) = " + students.containsKey("JoeyDaGOAT"));
        students.put("Water Bending Girl",katara);



        students.put("PrinceOF Egypt",kairo);
        kairo.addGrade(10);
        kairo.addGrade(90);
        kairo.addGrade(80);
        System.out.println("kairo.getGrade() = " + kairo.getGrade());

        students.put("Humanity Strongest Soldier",levi);
        levi.addGrade(50);
        levi.addGrade(20);
        levi.addGrade(10);
        System.out.println("levi.getGrade() = " + levi.getGrade());

        for ( String key : students.keySet() ) {
            System.out.print(key + "  |  ");
        }



    }

//    public GradesApplication(String userName, int grade) {
//        userName = "JoeydaGoat";
//        grade = 12;
//
//    }

}
