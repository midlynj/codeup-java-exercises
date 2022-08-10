import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] people = new String[3];
        people[0] = "Katara";
        people[1] = "Joeey";
        people[2] = "Hope";

        for (String person : people) {
            System.out.println(person);
        }
        System.out.println(addPerson(people,"Bob"));
    }

    public static String addPerson(String[]people, String person ) {
      people =  Arrays.copyOf(people, people.length +1);
//      person = people[0];
//      person = people[people.length-1];
      people[people.length-1] = person;
//       people = new String[people.length + 1];

      return Arrays.toString(people)  + person;
    }
}
