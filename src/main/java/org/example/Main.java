package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose notification type:");
        System.out.println("1: Email");
        System.out.println("2: SMS");
        System.out.println("3: Push Notification");
        System.out.print("Option: ");

        String option = scanner.nextLine();

        System.out.print("Enter the message to send: ");
        String message = scanner.nextLine();

        Notification notification = NotificationFactory.createNotification(option);
        if (notification != null) {
            notification.send(message);
        } else {
            System.out.println("Invalid notification type.");
        }

        scanner.close();
    }
}