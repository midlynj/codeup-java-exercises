import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s %n" ,pi);
        System.out.format("%.2f%n", pi);

//            Prompt 1

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = scanner.next();
        String secondInput = scanner.next();
        String lastInput = scanner.next();
//
        System.out.println("You entered: --> \"" + userInput + "\" <--");
        System.out.println(userInput);
        System.out.println(secondInput);
        System.out.println(lastInput);
        scanner.nextLine();
//
////        Prompt 2
//
        System.out.print("Enter a sentence: ");
        String userSentence = scanner.nextLine();
        System.out.println(userSentence);
        scanner.nextLine();

//        Prompt 3

        System.out.print("Enter length: ");
        int length = scanner.nextInt();
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        System.out.printf("Area is:%s %n",length*width);
        System.out.printf("Perimeter is:%s ",length*2 + width*2);








    }
}
