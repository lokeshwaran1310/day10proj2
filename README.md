# 🐞 Bug Analytics Dashboard - Spring Boot Project

This Spring Boot application provides RESTful APIs for analyzing bugs across projects by status, priority, and count. It's designed to assist software teams in visualizing issue distribution and identifying high-risk areas through simple and fast analytics endpoints.

---

## 📌 Features

- 🔍 **Bug analytics APIs** to:
  - Count bugs by project
  - Count bugs by status (`Open`, `Resolved`, etc.)
  - Count bugs by priority (`High`, `Medium`, `Low`, etc.)
  - Identify top 3 projects with the most bugs

- 📦 Clean architecture with:
  - DTO-based response models
  - JPA queries with custom projections
  - Controller-Service-Repository layered separation

- 📊 Suitable for frontend dashboards or internal tools

---

## 🛠️ Tech Stack

| Layer         | Tech                          |
|---------------|-------------------------------|
| Backend       | Java 21, Spring Boot 3.x      |
| Persistence   | Spring Data JPA, Hibernate    |
| Database      | PostgreSQL / MySQL (configurable) |
| Build Tool    | Maven                         |
| Format        | REST APIs                     |

---

## 📂 Project Structure

```
day10proj2/
├── controller/       # REST endpoints for analytics
├── service/          # Business logic
├── repository/       # JPA queries with projections
├── dto/              # Custom response DTOs
├── domain/           # Entity models (Bug, Project)
└── resources/
    ├── application.properties
```

---

## ⚙️ Setup Instructions

### 1. Clone and navigate
```bash
git clone https://github.com/your-username/bug-analytics-dashboard.git
cd bug-analytics-dashboard
```

### 2. Configure database (PostgreSQL/MySQL)

Update `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_db
spring.datasource.username=your_user
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

server.port=8085
```

> 📝 You can switch to MySQL by changing the dialect and JDBC URL accordingly.

---

### 3. Run the application

```bash
mvn clean install
mvn spring-boot:run
```

Access at: [http://localhost:8085](http://localhost:8085)

---

## 📡 API Endpoints

### 🔍 Analytics Controller

| Method | Endpoint                        | Description                              |
|--------|----------------------------------|------------------------------------------|
| GET    | `/api/analytics/bugs-by-project` | Bug count grouped by project name        |
| GET    | `/api/analytics/bugs-by-status`  | Bug count grouped by status              |
| GET    | `/api/analytics/bugs-by-priority`| Bug count grouped by priority            |
| GET    | `/api/analytics/top-projects`    | Top 3 projects with most bugs            |

---

### 📘 Sample JSON Response

#### `/api/analytics/bugs-by-status`
```json
[
  {
    "status": "Open",
    "count": 12
  },
  {
    "status": "Resolved",
    "count": 7
  }
]
```

#### `/api/analytics/top-projects`
```json
[
  {
    "projectName": "InventorySystem",
    "bugCount": 15
  },
  {
    "projectName": "CustomerPortal",
    "bugCount": 12
  },
  {
    "projectName": "PaymentGateway",
    "bugCount": 9
  }
]
```

---

## 🧱 Entity Overview

### `Project` Entity
- `id`, `name`
- `@OneToMany` relationship with `Bug`

### `Bug` Entity
- `bugid`, `title`, `description`, `status`, `priority`
- `@ManyToOne` with `Project`

---

## 👨‍💻 Author

**Lokeshwaran M**  

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).  
Feel free to use or contribute.

