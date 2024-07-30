
class CancellationCommand implements Command {
    private ConferenceRoom room;

    public CancellationCommand(ConferenceRoom room) {
        this.room = room;
    }

    @Override
    public void execute() {
        room.cancelBooking();
    }
}
