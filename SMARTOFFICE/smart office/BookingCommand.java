class BookingCommand implements Command {
    private ConferenceRoom room;

    public BookingCommand(ConferenceRoom room) {
        this.room = room;
    }

    @Override
    public void execute() {
        room.bookRoom();
    }
}
