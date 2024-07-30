class Lights implements Observer {
    @Override
    public void update(String message) {
        if (message.contains("occupied")) {
            turnOn();
        } else {
            turnOff();
        }
    }

    private void turnOn() {
        System.out.println("Lights turned on.");
    }

    private void turnOff() {
        System.out.println("Lights turned off.");
    }
}
