package Structural.Facade.notification;

public class NotificationService{
    public void notifyUser(boolean email, boolean sms) {
        if (email) System.out.println("Email has been sent");
        if (sms) System.out.println("SMS has been sent");
    }

}