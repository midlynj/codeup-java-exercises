import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Katara");
        people[1] = new Person("Joeey");
        people[2] = new Person("Hope");

        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println(addPerson(people,new Person("Bob")));
        System.out.println(Arrays.toString(people));


    }

    public static String addPerson(Person[] people, Person person ) {
      people =  Arrays.copyOf(people, people.length +1);
//      person = people[0];
//      person = people[people.length-1];
      people[people.length-1] = person;
//       people = new String[people.length + 1];

      return Arrays.toString(people)  + person;
    }

}
