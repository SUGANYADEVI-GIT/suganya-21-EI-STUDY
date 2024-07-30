class StatusUpdateCommand implements Command {
    private Sensor sensor;
    private boolean status;

    public StatusUpdateCommand(Sensor sensor, boolean status) {
        this.sensor = sensor;
        this.status = status;
    }

    @Override
    public void execute() {
        sensor.detectOccupancy(status);
    }
}
