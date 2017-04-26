package am.ak.annotation.required;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by karlen on 4/26/17.
 */
public class SimpleMovieLister {

    private MovieFinder movieFinder;

    @Required
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public MovieFinder getMovieFinder() {
        return movieFinder;
    }
}
