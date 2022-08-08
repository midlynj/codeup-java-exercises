import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
//        guessingGame();
      guessingGame();

    }
   public static void guessingGame() {
       int randomNumberGenerated = (int)(Math.random() * 100) + 1;
       System.out.println(randomNumberGenerated);
       Scanner scanner = new Scanner(System.in);
       System.out.println("Lets play a game");
       System.out.println("Guess the number");
       int userGuess = scanner.nextInt();
        if (userGuess > randomNumberGenerated) {
            System.out.println("Woah that's way too High");
            System.out.println("How did we end up on the moon?");
            tryAgain();
        } else if (userGuess < randomNumberGenerated) {
            System.out.println("Woah that's way too Low");
            System.out.println("Trying to bury me 6ft under?");
            tryAgain();
        } else {
            System.out.println("Woah you actually got it!!");
            System.out.println("GOOD GUESS!My MAN!!! ");
        }

   }



   public static void tryAgain() {
//       int randomNumberGenerated = (int)(Math.random() * 100);
//       System.out.println(randomNumberGenerated);
//       Scanner scanner = new Scanner(System.in);
//       System.out.println("Lets play a game");
//       System.out.println("Guess the number");
//       int userGuess = scanner.nextInt();
//      while(true) {
//          if (userGuess > randomNumberGenerated) {
//              System.out.println("Woah that's way too High");
//              System.out.println("How did we end up on the moon?");
//
//
//          } else if (userGuess < randomNumberGenerated) {
//              System.out.println("Woah that's way too Low");
//              System.out.println("Trying to bury me 6ft under?");
//
//          } else {
//              System.out.println("Woah you actually got it!!");
//              System.out.println("GOOD GUESS!My MAN!!! ");
//              break;
//          }
//      }
  System.out.println("Try again");
       Scanner scanner = new Scanner(System.in);
//       System.out.print("Enter a number between 1 and 10: ");
//
       int userInteger = scanner.nextInt();
   }
}
