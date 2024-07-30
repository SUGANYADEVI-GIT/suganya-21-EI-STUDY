import java.util.ArrayList;
import java.util.List;


public class Phone implements Subject {
    private List<Observer> observers;

    public Phone() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void receiveMessage(String message) {
        System.out.println("Phone received a message: " + message);
        notifyObservers(message);
    }
}
