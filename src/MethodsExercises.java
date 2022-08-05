import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        mathAddition(1,1);
//        mathMultiplication(2,2);
//        mathModulus(2,2);
//        getInteger(1,10);
        factorial(1,10);
    }
        public static void mathAddition ( int input1, int input2){
            System.out.println(input1 + input2);

        }

        public static void mathSubtraction ( int input1, int input2){
            System.out.println(input1 - input2);
        }

        public static void mathMultiplication ( int input1, int input2){
            System.out.println(input1 * input2);
        }

        public static void mathDivision ( int input1, int input2){
            System.out.println(input1 / input2);
        }

    public static void mathModulus ( int input1, int input2) {
        System.out.println(input1 % input2);

    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
//        boolean notANumber = true;
        int userInteger = scanner.nextInt();

        if (userInteger < min || userInteger > max) {
            System.out.println("Not within range, enter another number!");
            return getInteger(min, max);
        }
        else {
            System.out.print("Good job you did it \uD83D\uDE4C \uD83E\uDD29 ");
            return userInteger;
        }
//        boolean notANumber = true;
//        while (notANumber) {
//            if (scanner.hasNextInt()) {
//                int userNumber = scanner.nextInt();
//                notANumber = false;
//            } else if (scanner.hasNext()){
////                System.out.print("Try again: ");
//                String userNumber = scanner.nextLine();
//                notANumber = true;
//
//            }
//        }
//        System.out.print("Good job you did it \uD83D\uDE4C \uD83E\uDD29 ");



    }

    public static void factorial(int min, int max) {
        getInteger(1,10);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer from 1 to 10");
        int userInteger = scanner.nextInt();

//        for (int i = 1; i <= userInteger; i++) {
//            System.out.println(i  + " * " + i  + " = " + i * i);
//        }


//        String[] abcvd = {"1","2","3","4","5","6","7","8","9","10"};

        long fact = 1;
        for(int i = 1; i <= userInteger; i++)
        {
            fact = fact * i;
//            System.out.println(abcvd[i]);
            System.out.printf("%s x ", i);
        }
        System.out.println(" = " +fact);
//        System.out.println(abcvd[i]);
//        }
        System.out.println("Wanna play again? [y/n]");
        String playAgain = scanner.next();
        if (playAgain.equals("y")) {
            factorial(min,max);
        }
    }
    }
//}


