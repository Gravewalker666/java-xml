import java.util.*;

public class DVD {
    private List<Movie> movies = new ArrayList<>();

    public DVD() {
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public String toString() {
        StringBuilder movies = new StringBuilder();
        for (Movie movie : getMovies()) {
            movies.append(movie.getName()).append(", ");
            movies.append(movie.getReleased()).append("\n");
        }
        return movies.toString();
    }
}