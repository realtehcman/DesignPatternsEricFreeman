package weather_station;

import weather_station.observables.WeatherData;
import weather_station.observer.CurrentConditionDisplay;
import weather_station.observer.ForecastDisplay;
import weather_station.observer.IObserver;

public class WeatherStationProgram {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements(23, 34, 44); //current weather condition

        IObserver observer1 = new CurrentConditionDisplay(weatherData);
        IObserver observer2 = new ForecastDisplay(weatherData);

        weatherData.registerObserver(observer1);
        weatherData.registerObserver(observer2);

        //day1
        System.out.println("new data");
        weatherData.setMeasurements(15, 2, 21); //current weather condition
        //day2
        System.out.println("new data");
        weatherData.setMeasurements(45, 4, 29); //current weather condition
        //day3
        weatherData.removeObserver(observer2);
        System.out.println("new data");
        weatherData.setMeasurements(35, 6, 23); //current weather condition
    }
}
