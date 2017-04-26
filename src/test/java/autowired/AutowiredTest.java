package autowired;

import am.ak.annotation.autowired.MovieRecommender;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 * Created by karlen on 4/26/17.
 */
public class AutowiredTest {

    @Test
    public void testAutowiredAnnotation() {
        final ApplicationContext context = new ClassPathXmlApplicationContext("autowired/autowired.xml");
        final MovieRecommender movieRecommender = context.getBean("movieRecommender", MovieRecommender.class);
        assertNotNull(movieRecommender);
        assertNotNull(movieRecommender.getCustomerPreferenceDao());
        assertNotNull(movieRecommender.getCatalog());
    }
}
