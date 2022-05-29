package weather_station.observables;

import weather_station.observer.IObserver;

public interface IObservable {
    void registerObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObservers();
}
