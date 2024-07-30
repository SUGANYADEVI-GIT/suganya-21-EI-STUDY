
public class Main {
    public static void main(String[] args) throws InterruptedException {
        OfficeConfiguration office = OfficeConfiguration.getInstance();
        office.configureOffice(5); // Configuring office with 5 conference rooms

        ConferenceRoom room1 = office.getRoom(1);
        ConferenceRoom room2 = office.getRoom(2);

        BookingCommand bookRoom1 = new BookingCommand(room1);
        CancellationCommand cancelRoom1 = new CancellationCommand(room1);
        StatusUpdateCommand occupyRoom1 = new StatusUpdateCommand(room1.getSensor(), true);
        StatusUpdateCommand vacateRoom1 = new StatusUpdateCommand(room1.getSensor(), false);

        bookRoom1.execute(); // Booking room 1
        occupyRoom1.execute(); // Occupying room 1
        vacateRoom1.execute(); // Vacating room 1
        cancelRoom1.execute(); // Canceling booking for room 1
    }
}
