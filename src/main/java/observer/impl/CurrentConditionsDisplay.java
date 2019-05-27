package observer.impl;

import observer.DisplayElement;
import observer.Observer;
import observer.Subject;

/**
 * @author guoqing
 * @since ： 2018/5/24 22:01
 * description:
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);

    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " +
                humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
