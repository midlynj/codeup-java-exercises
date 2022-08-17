package util;

import java.util.Scanner;

import static java.lang.Float.NaN;
import static java.lang.Float.isNaN;

public class Maintest {
    public static void main(String[] args) {
//        m();
//        numberToBinary();
        numberToHexadecimal();
    }

//    public static void inputMethod() {
//        Input input = new Input();
//        int practiceTest = input.getInt();
//        System.out.println(practiceTest);
//
//        if (practiceTest == NaN) {
//            inputMethod();
//        } else {
//            System.out.println("no");
//        }
//
//    }

    public static void m() {
        Input m = new Input();
        int n = m.getInt();
        System.out.println(n);
        if (!isNaN(n)) {
            System.out.println("it is a number");
        }
    }

//    public static String numberToBinary(int i) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int number = scanner.nextInt();
//
//    }

    public static void numberToBinary()  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        String scan = scanner.next();
        int binaryToInt = Integer.parseInt(scan,2);
        System.out.println("The binary you entered is " + scan + " . The decimal value is " + binaryToInt);
    }

    public static void numberToHexadecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        String scan = scanner.next();
        int regNumber = Integer.parseInt(scan,16);
        System.out.println("The hexidecimal you entered is " + scan + " . The decimal value is " + regNumber);
    }







}
