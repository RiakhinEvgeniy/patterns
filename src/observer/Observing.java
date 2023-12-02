package observer;

public interface Observing {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
