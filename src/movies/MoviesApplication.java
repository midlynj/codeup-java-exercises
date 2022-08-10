package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    public static final int INVALID_CHOICE = -1;
    public static final int EXIT_CHOICE = 0;

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("View all movies or by category? [y/n]");
//        String viewMovieBy = scanner.next();
        Input input = new Input();
        allMovies();

        int choice = INVALID_CHOICE;
        while(choice != EXIT_CHOICE) {
            printMenu();

            choice = input.getInt(0, 5);

            doChoice(choice);

        }


    }

    private static void printMenu() {
        System.out.print("""
                What would you like to do?
                                
                0 - exit
                1 - view all movies
                2 - view movies in the musical category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the scifi category
                            
                Enter your choice: """);
    }

    private static void doChoice(int choice) {
        // TODO: call your functions based on whatever the user's choice is
        switch(choice) {
            case 1:
                // TODO: view all movies
//               return MoviesArray.findAll();
                break;
            case 2:
                // TODO: view movies in the musical category
                break;
            case 3:
                // TODO: view movies in the drama category
                break;
            case 4:
                // TODO: view movies in the horror category
                break;
            case 5:
                // TODO: view movies in the scifi category
                break;
        }
    }
        public static void allMovies() {
            MoviesArray.findAll();
            for (Movie mn : MoviesArray.findAll()) {
//                System.out.println(Arrays.toString(MoviesArray.findAll()));
                System.out.println(mn);
            }
//            System.out.println(Arrays.toString(MoviesArray.findAll()));
        }

//        public  static void toString(String[]people) {
//            Arrays.toString(people);
//        }
}
