package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de notificação:");
        System.out.println("1: Email");
        System.out.println("2: SMS");
        System.out.println("3: Push Notification");
        System.out.print("Opção: ");

        String option = scanner.nextLine();

        System.out.print("Digite a mensagem a ser enviada: ");
        String message = scanner.nextLine();

        Notification notification = NotificationFactory.createNotification(option);
        if (notification != null) {
            notification.send(message);
        } else {
            System.out.println("Opção inválida de notificação.");
        }

        scanner.close();
    }
}
