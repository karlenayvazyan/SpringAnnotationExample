package am.ak.annotation.primary;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by karlen on 4/26/17.
 */
public class MovieRecommenderPrimary {

    @Autowired
    private MovieCatalogPrimary movieCatalogPrimary;

    public String getMessage() {
        return movieCatalogPrimary.getMessage();
    }
}
