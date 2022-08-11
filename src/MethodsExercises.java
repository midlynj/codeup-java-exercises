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
//        rollDice();
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
//



    }

    public static void factorial(int min, int max) {
        getInteger(1,10);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer from 1 to 10");
        int userInteger = scanner.nextInt();

//
        long fact = 1;
        for(int i = 1; i <= userInteger; i++)
        {
            fact = fact * i;

            System.out.printf("%s x ", i);
        }
        System.out.println(" = " +fact);

        System.out.println("Wanna play again? [y/n]");
        String playAgain = scanner.next();
        if (playAgain.equals("y")) {
            factorial(min,max);
        }
    }

    public static void rollDice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides for a pair of dice");
        int userDiceFace = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Roll dice? [y/n]");
        String rollDice = scanner.next();
        if (rollDice.equals("y")) {
            System.out.println( userDiceFace + " sided Dice Rolled");
            int diceRolledOnce = (int)(Math.random() * userDiceFace);
            int diceRolledTwice = (int)(Math.random() * userDiceFace);
            System.out.println("You rolled a " + diceRolledOnce);
            System.out.println("You rolled a " + diceRolledTwice);
            System.out.print("Would you like to play again? [y/n]");
            String playAgain = scanner.next();
                if (playAgain.equals("y")) {
                    rollDice();
                } else {
                    System.out.print("Thanks for playing. Goodbye");
                }


        }
        System.out.println("BYE!!!");
    }
    }



