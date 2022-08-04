import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        mathAddition(1,1);
        mathMultiplication(2,2);
        mathModulus(2,2);
        getInteger(1,10);
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

    public static int factorial(int min, int max) {

    }
}


