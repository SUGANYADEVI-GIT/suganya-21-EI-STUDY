class ConferenceRoom {
    private int roomId;
    private boolean occupied;
    private boolean booked;
    private Sensor sensor;
    private Lights lights;
    private AirConditioning ac;

    public ConferenceRoom(int roomId) {
        this.roomId = roomId;
        this.occupied = false;
        this.booked = false;
        this.sensor = new Sensor(this);
        this.lights = new Lights();
        this.ac = new AirConditioning();
        this.sensor.register(this.lights);
        this.sensor.register(this.ac);
    }

    public int getRoomId() {
        return roomId;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void bookRoom() {
        if (!booked) {
            booked = true;
            System.out.println("Room " + roomId + " has been booked.");
        } else {
            System.out.println("Room " + roomId + " is already booked.");
        }
    }

    public void cancelBooking() {
        if (booked) {
            booked = false;
            System.out.println("Room " + roomId + " booking has been canceled.");
        } else {
            System.out.println("Room " + roomId + " is not booked.");
        }
    }

    public void checkOccupancy() throws InterruptedException {
        if (booked && !occupied) {
            Thread.sleep(5 * 60 * 1000); // Wait for 5 minutes
            if (!occupied) {
                cancelBooking();
                System.out.println("Room " + roomId + " booking has been auto-released due to no occupancy.");
            }
        }
    }
}
