# A To-Do API inspired by the Eisenhower Matrix

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.6-green?style=for-the-badge)
![Docker](https://img.shields.io/badge/Docker-Enabled-blue?style=for-the-badge)
![JWT](https://img.shields.io/badge/Jwt-Authentication-purple?style=for-the-badge)
![MySQL](https://img.shields.io/badge/MySQL-8.0-white?style=for-the-badge)
![Licence](https://img.shields.io/badge/Licence-MIT-pink?style=for-the-badge)

## About
This To-Do API was deeply inspired by the Eisenhower Matrix, a task management tool which focuses on organising and prioritising tasks by importance and urgency.

## Project Structure

```
todo-api/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/liviasilva/todo_api/
│   │   │       ├── Task
│   │   │       │   └── controller
│   │   │       │   └── model
│   │   │       │   └── repository
│   │   │       │   └── service
│   │   │       ├── User
│   │   │       │   └── controller
│   │   │       │   └── model
│   │   │       │   └── repository
│   │   │       │   └── service
│   │   │       ├── Auth
│   │   │       │   └── controller
│   │   │       │   └── UserService.java
│   │   │       └── ToDoApiApiApplication.java
│   │   │
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   │
│   └── test/
│       └── java/
│           └── com/example/myapi/
│               └── UserControllerTests.java
│
└── .env.example
└── docker-compose.yml
└── pom.xml
```

