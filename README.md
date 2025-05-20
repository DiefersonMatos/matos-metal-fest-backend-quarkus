# Matos Metal Fest – Backend

This is the backend service for the **Matos Metal Fest** project. It is built using **Quarkus** and follows the **Boundary-Control-Entity (BCE)** architectural pattern. The project is structured as a multi-module Maven application.

## 📦 Project Modules

This repository is organized into several Maven modules:

- **`api-module`**: Defines REST API interfaces (Boundary layer).
- **`business-module`**: Implements the application's control logic (Control layer).
- **`persistence-module`**: Contains entities and persistence mechanisms (Entity layer).
- **`kafka-module`**: Handles asynchronous messaging and Kafka integration.
- **`uber-module`**: Assembles and runs the application as a Quarkus service.

## 🧱 Architecture Overview – BCE Pattern

The BCE architecture used in this project separates responsibilities across three layers:

| Layer    | Responsibility                                                                 |
|----------|---------------------------------------------------------------------------------|
| Boundary | Defines API contracts via interfaces, enabling external interaction.            |
| Control  | Contains the business logic and coordinates domain entities and services.       |
| Entity   | Models the domain with entities and persistence logic (usually JPA-based).      |

This separation helps in achieving better **testability**, **modularity**, and **scalability**.

## 🚀 Technology Stack

- **Java 17**
- **Quarkus 3.15.5**
- **Jakarta EE**
- **Maven (multi-module)**
- **PostgreSQL (via JDBC)**
- **Hibernate ORM**
- **Kafka (via kafka-module)**
- **Lombok** for boilerplate reduction

## 🛠️ Getting Started

### Prerequisites

- Java 17+
- Maven 3.8+
- Docker (optional, for DB/Kafka)

### Build the project

```bash
./mvnw clean install
```

### Run the project

```bash
./mvnw compile quarkus:dev
```

### TBD