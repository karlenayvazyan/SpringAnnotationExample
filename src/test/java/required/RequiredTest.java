package required;

import am.ak.annotation.required.SimpleMovieLister;
import org.junit.Test;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 * Created by karlen on 4/26/17.
 */
public class RequiredTest {

    @Test(expected = BeanCreationException.class)
    public void testRequiredAnnotationExeption() {
        final ApplicationContext context = new ClassPathXmlApplicationContext("required/required-exception.xml");
        context.getBean("simpleMovieListerException", SimpleMovieLister.class);
    }

    @Test()
    public void testRequiredAnnotation() {
        final ApplicationContext context = new ClassPathXmlApplicationContext("required/required.xml");
        final SimpleMovieLister simpleMovieLister = context.getBean("simpleMovieLister", SimpleMovieLister.class);
        assertNotNull(simpleMovieLister);
        assertNotNull(simpleMovieLister.getMovieFinder());
    }
}
