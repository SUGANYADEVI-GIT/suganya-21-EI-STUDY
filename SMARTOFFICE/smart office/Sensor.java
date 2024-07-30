import java.util.*;

class Sensor {
    private ConferenceRoom room;
    private List<Observer> subscribers;

    public Sensor(ConferenceRoom room) {
        this.room = room;
        this.subscribers = new ArrayList<>();
    }

    public void register(Observer subscriber) {
        subscribers.add(subscriber);
    }

    public void unregister(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifyObservers(String message) {
        for (Observer subscriber : subscribers) {
            subscriber.update(message);
        }
    }

    public void detectOccupancy(boolean occupied) {
        String message = occupied ? "Room " + room.getRoomId() + " is now occupied." : "Room " + room.getRoomId() + " is now unoccupied.";
        notifyObservers(message);
        room.setOccupied(occupied);
    }
}
