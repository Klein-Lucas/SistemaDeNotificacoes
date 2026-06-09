# Notification System

> A demonstration of the **Factory Method** design pattern in Java, applied to a multi-channel notification system.

## About

This project implements the Factory Method pattern to decouple notification creation from its usage. A single factory decides which concrete implementation to instantiate (Email, SMS, or Push) based on user input — no conditionals scattered throughout the codebase.

## Design Pattern

```
«interface»
Notification
    + send(message: String)
         ▲
         │
    ┌────┴────────────────────┐
    │            │            │
EmailNotification  SMSNotification  PushNotification

NotificationFactory
    + createNotification(type: String): Notification
```

The `NotificationFactory` is the single point of creation. Adding a new channel means implementing `Notification` and adding one branch to the factory — no other class changes.

## Tech Stack

- **Java** 17+
- **Maven**

## Running the Project

### Prerequisites

- JDK 17+
- Maven 3.8+

### Build and run

```bash
mvn compile
mvn exec:java -Dexec.mainClass="org.example.Main"
```

### Example interaction

```
Choose notification type:
1: Email
2: SMS
3: Push Notification
Option: 1
Enter the message to send: Hello!
[Email] Sending: Hello!
```

## Project Structure

```
src/main/java/org/example/
├── Main.java                 # Entry point — reads user input and triggers the factory
├── Notification.java         # Interface defining the send contract
├── NotificationFactory.java  # Factory — creates the right Notification based on type
├── EmailNotification.java    # Email channel implementation
├── SMSNotification.java      # SMS channel implementation
└── PushNotification.java     # Push notification implementation
```

## License

MIT