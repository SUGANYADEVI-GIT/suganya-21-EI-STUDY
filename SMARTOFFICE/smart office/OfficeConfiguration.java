import java.util.*;

class OfficeConfiguration {
    private static OfficeConfiguration instance;
    private Map<Integer, ConferenceRoom> rooms;

    private OfficeConfiguration() {
        rooms = new HashMap<>();
    }

    public static synchronized OfficeConfiguration getInstance() {
        if (instance == null) {
            instance = new OfficeConfiguration();
        }
        return instance;
    }

    public void configureOffice(int numRooms) {
        for (int i = 1; i <= numRooms; i++) {
            rooms.put(i, new ConferenceRoom(i));
        }
    }

    public ConferenceRoom getRoom(int roomId) {
        return rooms.get(roomId);
    }
}
