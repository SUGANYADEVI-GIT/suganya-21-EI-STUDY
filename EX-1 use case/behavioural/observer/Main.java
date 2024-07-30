public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();

        Observer smsObserver = new SmsNotification();
        Observer emailObserver = new EmailNotification();
        Observer appObserver = new AppNotification();

        phone.registerObserver(smsObserver);
        phone.registerObserver(emailObserver);
        phone.registerObserver(appObserver);

        phone.receiveMessage("You have a new message!");

        phone.unregisterObserver(emailObserver);

        phone.receiveMessage("Another message!");
    }
}
