package weather_station.observer;

import weather_station.observables.WeatherData;

public class CurrentConditionDisplay implements IObserver, IDisplayElement {
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        System.out.println("--- Current weather ---");
    }

    @Override
    public void update() {
        display();
        System.out.println("Temperature is " + this.weatherData.getTemperature());
        System.out.println("Pressure is " + this.weatherData.getPressure());
        System.out.println("Humidity is " + this.weatherData.getHumidity());
    }
}
