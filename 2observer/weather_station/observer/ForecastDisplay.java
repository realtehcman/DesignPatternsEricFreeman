package weather_station.observer;

import weather_station.observables.WeatherData;

public class ForecastDisplay implements IObserver, IDisplayElement {
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        System.out.println("--- Weather for tomorrow ---");
    }

    @Override
    public void update() {
        display();
        System.out.println("Temperature is " + (this.weatherData.getTemperature() + 5));
        System.out.println("Humidity is " + (this.weatherData.getHumidity() - 3));
        System.out.println("Pressure is " + (this.weatherData.getPressure() + 1));
    }

}
