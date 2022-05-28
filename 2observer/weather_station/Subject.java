package weather_station;

public interface Subject {
    void registerObserver();
    void removeObserver();
    void notifyObserver();
}