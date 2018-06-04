package observe.impl;


import observe.Observer;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * CurrentConditionsDisplay Tester.
 *
 * @author $author
 * @version 1.0
 * @since <pre>05/24/2018</pre>
 */
public class CurrentConditionsDisplayTest {

    private WeatherData weatherData;
    private Observer observer;
    @Before
    public void before() throws Exception {
        weatherData = new WeatherData();
        observer = new CurrentConditionsDisplay(weatherData);
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: display()
     */
    @Test
    public void testDisplay() throws Exception {
        weatherData.setMeasurements(80,65,30.4f);
    }

    /**
     * Method: update(float temp, float humidity, float pressure)
     */
    @Test
    public void testUpdate() throws Exception {
//TODO: Test goes here... 
    }


} 
