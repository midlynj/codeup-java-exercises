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
//        allMovies();
//            musicalCategory();
//        dramaCategory();
//        musicalCategory();


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
//                allMovies();
                movieCategory(1);
                break;
            case 2:
                // TODO: view movies in the musical category
                movieCategory(2);
                break;
            case 3:
                // TODO: view movies in the drama category
                movieCategory(3);
//                dramaCategory();
                break;
            case 4:
                // TODO: view movies in the horror category
//                horrorCategory();
                movieCategory(4);
                break;
            case 5:
                // TODO: view movies in the scifi category
//                scifiCategory();
                movieCategory(5);
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

        public static void musicalCategory() {
            MoviesArray.findAll();
            for (Movie mn : MoviesArray.findAll()) {
                if (mn.getCategory().equals("musical")) {
                    System.out.println(mn.getName());
                }
            }
        }

    public static void dramaCategory() {
        MoviesArray.findAll();
        for (Movie mn : MoviesArray.findAll()) {
            if (mn.getCategory().equals("drama")) {
                System.out.println(mn.getName());
            }
        }
    }

    public static void horrorCategory() {
        MoviesArray.findAll();
        for (Movie mn : MoviesArray.findAll()) {
            if (mn.getCategory().equals("horror")) {
                System.out.println(mn.getName());
            }
        }
    }

    public static void scifiCategory() {
        MoviesArray.findAll();
        for (Movie mn : MoviesArray.findAll()) {
            if (mn.getCategory().equals("scifi")) {
                System.out.println(mn.getName());
            }
        }
    }

    public static void movieCategory(int input) {
        MoviesArray.findAll();
        for (Movie mn : MoviesArray.findAll()) {
            if (input == 2 && mn.getCategory().equals("musical")) {
                System.out.println(mn.getName());
            } else if (input == 3 &&   mn.getCategory().equals("drama")) {
//                mn.getCategory().equals("drama");
                System.out.println(mn.getName());
            } else if (input == 4 &&   mn.getCategory().equals("horror")) {
//                mn.getCategory().equals("horror");
                System.out.println(mn.getName());
            } else if (input == 5 &&   mn.getCategory().equals("scifi")) {
//                mn.getCategory().equals("scifi");
                System.out.println(mn.getName());
            } else if (input == 1) {
                System.out.println(mn.getName());
            }
        }
    }

//        public  static void toString(String[]people) {
//            Arrays.toString(people);
//        }
}
