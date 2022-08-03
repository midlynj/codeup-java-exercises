import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }

        int j = 100;

        do {
            System.out.println( j);
            j-=5;
        }while(j >= -10);

        long l = 2;
        do {
            System.out.println( l);
            l*=l;
        }while(l < 1000000);

        for (int i = 1; i < 100 ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println( "FizzBuzz");
                continue;

            } else if (i % 5 == 0) {
                System.out.println( "Buzz");
                continue;
            } else if (i % 3 == 0) {
                System.out.println( "Fizz");
                continue;
            }
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer");
        int userInteger = scanner.nextInt();
        System.out.println("number| squared | cubed");
        System.out.println("-----" + " |" + "-----" + "    |" + "-----");
//

        for (int i = 1; i < userInteger + 1  ; i++) {
//
            System.out.print(i + "     |");
            System.out.print(i * i + "        |");
            System.out.print(i * i * i);
            System.out.println();

            if ( i < userInteger) {

                System.out.print("Continue? :[y/n] ");

                String userInput = scanner.next();
                    if (userInput.equals("n")) {
                        break;
                    }
            }


        }

        System.out.print("Enter number");
        int userNumericalGrade = scanner.nextInt();
        System.out.println(userNumericalGrade);
        System.out.println("Continue? :[y/n] ");
        String userContinue = scanner.next();
        if (userContinue.equals("n")) {
            System.out.println("wont display grade");

        }

        if (userNumericalGrade >= 88) {
            System.out.print("You received a A");
        } else if (userNumericalGrade >= 80 && userNumericalGrade < 88) {
            System.out.print("You received a B");
        } else if (userNumericalGrade >= 67 && userNumericalGrade < 80) {
            System.out.print("You received a C");
        } else if (userNumericalGrade >= 60 && userNumericalGrade < 67) {
            System.out.print("You received a D");
        } else {
            System.out.print("You received an F");

        }



    }

}
