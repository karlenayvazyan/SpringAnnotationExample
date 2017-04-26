package am.ak.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by karlen on 4/26/17.
 */
public class MovieRecommender {

    private final CustomerPreferenceDao customerPreferenceDao;

    private final MovieCatalog catalog;

    @Autowired
    public MovieRecommender(CustomerPreferenceDao customerPreferenceDao, MovieCatalog catalog) {
        this.customerPreferenceDao = customerPreferenceDao;
        this.catalog = catalog;
    }

    public CustomerPreferenceDao getCustomerPreferenceDao() {
        return customerPreferenceDao;
    }

    public MovieCatalog getCatalog() {
        return catalog;
    }
}
