package util;
import java.util.Scanner;


public class Input {
    private Scanner scanner = new Scanner(System.in);
//    String userInfo = scanner.next();


    public Input() {

    }

    public static void main(String[] args) {
        Input input = new Input();
//        System.out.printf(input.getString());
//        System.out.println(input.yesNo());
//        System.out.println(input.yesNo());
//        System.out.println(input.getInt(1,2));
        System.out.println(input.getDouble(1,2));

    }

    private String getString() {
        System.out.printf("Enter something");
        String userInput = scanner.nextLine();
        return userInput;
    }

    private boolean yesNo() {
        System.out.println("[y/n]?");
        String yesOrNo = scanner.nextLine();
       if (yesOrNo.equals("y")|| yesOrNo.equals("yes")) {
           return true;
       } else {
           return false;
       }


    }

    private int getInt(int min, int max) {
        System.out.println("Pick a number between " + min + " and " + max);
        int userNumber = scanner.nextInt();
        if (userNumber < min || userNumber > max) {
            return getInt(min,max);
        }
        return userNumber;
    }

    private int getInt() {
        System.out.println("Enter a number");
        int userFavNum = scanner.nextInt();
        return userFavNum;
    }

    private double getDouble(double min, double max) {
        System.out.println("Enter a number between " + min + " and " + max);
        double userDouble = scanner.nextDouble();
        if (userDouble < min || userDouble > max) {
            return getDouble(min, max);
        }
        return userDouble;
    }

    private double getDouble() {
        System.out.println("Enter a number.");
        double userD = scanner.nextDouble();
        return userD;
    }





}
