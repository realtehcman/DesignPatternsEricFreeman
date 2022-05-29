package weather_station;


import weather_station.display.CurrentConditionDisplay;

public class WeatherData extends CurrentConditionDisplay implements Subject{
    Observer observer;

    public float getTemparature(){
        return 0;
    }
    public float getPressure(){
        return 0;
    }
    public float getHumidity(){
        return 0;
    }

    public void measurementsChanged(){
        float temp = getTemparature();
        float pressure = getPressure();
        float humidity = getHumidity();


    }

    @Override
    public void registerObserver() {
        observer.update();
    }

    @Override
    public void removeObserver() {

    }

    @Override
    public void notifyObserver() {

    }
}
