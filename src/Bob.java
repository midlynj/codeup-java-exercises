import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("Robo Bobo a your service!");
        Scanner scanner = new Scanner(System.in);
        String userResponseToRoboBob = scanner.nextLine();
        System.out.println("Robo Bobo :" + userResponseToRoboBob.toUpperCase() + "?");
        if (userResponseToRoboBob.endsWith("?")) {
            System.out.println("Robo Bobo: Surrreeeeee");
        } else if (userResponseToRoboBob.endsWith("!")) {
            System.out.println("Robo Bobo: Whoa, chill out!");
            
        } else if (userResponseToRoboBob.isEmpty()) {
            System.out.println("Robo Bobo: Fine. Be that way!");

        } else {
            System.out.println("Robo Bobo: 'Whatever");
        }


    }
}
