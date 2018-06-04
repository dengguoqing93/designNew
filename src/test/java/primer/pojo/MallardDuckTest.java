package primer.pojo;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * MallardDuck Tester.
 *
 * @author $author
 * @version 1.0
 * @since <pre>05/23/2018</pre>
 */
public class MallardDuckTest {

    private MallardDuck mallardDuck;
    @Before
    public void before() throws Exception {
        mallardDuck = new MallardDuck();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: display()
     */
    @Test
    public void testDisplay() throws Exception {
        mallardDuck.display();

    }

    @Test
    public void testPerformFly(){
        mallardDuck.performFly();

    }

    @Test
    public void testPerformQuack(){
        mallardDuck.performQuack();
    }
} 
