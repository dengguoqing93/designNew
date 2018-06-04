package primer.pojo;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import primer.impl.FlyRocketPowered;

/**
 * ModelDuck Tester.
 *
 * @author $author
 * @version 1.0
 * @since <pre>05/23/2018</pre>
 */
public class ModelDuckTest {
    private Duck duck;

    @Before
    public void before() throws Exception {
        duck = new ModelDuck();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: display()
     */
    @Test
    public void testDisplay() throws Exception {
        duck.display();
    }

    @Test
    public void testPerformQuack(){
        duck.performQuack();
        duck.performQuack();
    }

    @Test
    public void testPerformFly(){
        duck.performFly();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
    }

} 
