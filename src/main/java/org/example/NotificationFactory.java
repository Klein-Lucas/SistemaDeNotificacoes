package org.example;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type.equalsIgnoreCase("1") || type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("2") || type.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        } else if (type.equalsIgnoreCase("3") || type.equalsIgnoreCase("push")) {
            return new PushNotification();
        }
        return null;
    }
}