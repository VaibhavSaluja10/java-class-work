package polymorphism;

class Notification {
    public void send() {
        System.out.println("Sending notification");
    }
}

class EmailNotification extends Notification {
    public void send() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification extends Notification {
    public void send() {
        System.out.println("Sending SMS Notification");
    }
}

class PushNotification extends Notification {
    public void send() {
        System.out.println("Sending Push Notification");
    }
}
