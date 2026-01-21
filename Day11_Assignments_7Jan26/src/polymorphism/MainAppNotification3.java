package polymorphism;

public class MainAppNotification3 {
    public static void main(String[] args) {

        Notification n1 = new EmailNotification();
        Notification n2 = new SMSNotification();
        Notification n3 = new PushNotification();

        n1.send();
        n2.send();
        n3.send();
    }
}
