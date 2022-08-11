package movies;

public class Movie {
    private String name;
    private String category;

    @Override
    public String toString() {
        return this.name + "--" + this.category;
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }


    public static void main(String[] args) {
        Movie movie = new Movie("Deadpool","Action");
        System.out.println(movie.getName());
        System.out.println(movie.setName("Rush Hour"));
        System.out.println(movie.getCategory());
    }

    public String getName() {

        return name;
    }

    public String setName(String name) {
       return this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
