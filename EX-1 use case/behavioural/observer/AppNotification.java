public class AppNotification implements Observer {
    @Override
    public void update(String message) {
        System.out.println("App Notification: " + message);
    }
}
