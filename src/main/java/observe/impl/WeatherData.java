package observe.impl;

import observe.Observer;
import observe.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoqing
 * @since ： 2018/5/24 21:44
 * description:气象数据作为一个主题
 */
public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    /*
    * 初始化观察者列表
    * */
    public WeatherData() {
        observers = new ArrayList<Observer>();
    }



    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
