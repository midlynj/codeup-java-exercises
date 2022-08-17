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

    public int getInt(int min, int max) {
        System.out.println("Pick a number between " + min + " and " + max);
        int userNumber = scanner.nextInt();
        if (userNumber < min || userNumber > max) {
            return getInt(min,max);
        }
        return userNumber;
    }

    public int getInt() {
        System.out.println("Enter a number");
        String s = getString();
        try {
            int i = Integer.parseInt(s);
            return i;

        } catch (Exception e) {
            System.out.println("Uh oh, something went wrong: " + e.getMessage());
        }
        return getInt();
    }

    private double getDouble(double min, double max) {
        System.out.println("Enter a number between " + min + " and " + max);
        String s = getString();
        int i = Integer.valueOf(s);
        if (i < min || i > max) {
            return getDouble(min, max);
        }
        return i;
    }

    private double getDouble() {
        System.out.println("Enter a number.");
        double userD = scanner.nextDouble();
        return userD;
    }





}
