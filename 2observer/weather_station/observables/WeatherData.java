package weather_station.observables;

import weather_station.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements IObservable {
    private List<IObserver> observerList;

    private int temperature;
    private int pressure;
    private int humidity;

    public WeatherData() {
        this.observerList = new ArrayList<>();

    }

    @Override
    public void registerObserver(IObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.observerList.remove(observer);
    }

    public void setMeasurements(int temperature, int pressure, int humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        notifyObservers(); //measurementsChanged
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(IObserver::update);
    }

    public int getPressure() {
        return this.pressure;
    }

    public int getHumidity() {
        return this.humidity;
    }

    public int getTemperature() {
        return this.temperature;
    }
}
