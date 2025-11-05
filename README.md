# A To-Do API inspired by the Eisenhower Matrix

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.6-green?style=for-the-badge)
![Docker](https://img.shields.io/badge/Docker-Enabled-blue?style=for-the-badge)
![JWT](https://img.shields.io/badge/Jwt-Auth-purple?style=for-the-badge)
![MySQL](https://img.shields.io/badge/MySQL-8.0-white?style=for-the-badge)
![Licence](https://img.shields.io/badge/Licence-MIT-pink?style=for-the-badge)

## About ✨
This To-Do API was deeply inspired by the Eisenhower Matrix, a task management tool which focuses on organising and prioritising tasks by importance and urgency.

E.g.

<table>
  <tr><td></td><td>Important</td><td>Not Important</td></tr>
  <tr><td>Urgent</td><td>Do</td><td>Schedule</td></tr>
  <tr><td>Not Urgent</td><td>Delegate</td><td>Delete</td></tr>
</table>

<br>

## Installation 💻

1. **Clone the repository:**

   ```sh
   git clone https://github.com/liviadfsilva/ToDoAPI.git
   cd ToDoAPI
   ```

2. **Copy the .env.example file to .env and change the environment variables if necessary:**

   ```sh
   cp .env.example .env
   ```

3. **Start the database using Docker**

   ```bash
    docker-compose up -d
   ```

4. **Run the application**

   ```bash
    mvn spring-boot:run
    ```

#### The application will start at:
꩜ **http://localhost:8080**

#### Access the Swagger documentation:
📜 **http://localhost:8080/swagger-ui/index.html**

<br>

## Project Structure ⚙️

```
todo-api/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/liviasilva/todo_api/
│   │   │       ├── Auth
│   │   │       │   └── controller
│   │   │       │   └── UserService.java
│   │   │       ├── config
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
│   │   │       └── ToDoApiApiApplication.java
│   │   │
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   │
│   └── test/
│
└── .env.example
└── .gitignore
└── docker-compose.yml
└── LICENCE
└── pom.xml
```

<br>

## Licence 📋
This software is licenced under the MIT Licence.
