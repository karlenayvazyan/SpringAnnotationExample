package primary;

import am.ak.annotation.primary.MovieRecommenderPrimary;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by karlen on 4/26/17.
 */
public class PrimaryTest {

    @Test
    public void testPrimary() {
        final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("primary/primary.xml");
        MovieRecommenderPrimary movieRecommenderPrimary = applicationContext.getBean("movieRecommenderPrimary", MovieRecommenderPrimary.class);
        assertNotNull(movieRecommenderPrimary);
        String expected = "primary";
        assertEquals(expected, movieRecommenderPrimary.getMessage());
    }
}
