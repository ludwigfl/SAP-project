# SAP-Inspired Material Management System

Simple SAP-inspired inventory management system built with Java Spring Boot.

## Features

- View all materials
- View one material by ID
- Add new material
- Increase stock
- Decrease stock
- REST API backend

---

# Tech Stack

- Java 21
- Spring Boot
- Maven
- REST API

---

# Run the Project

## 1. Clone project

```bash
git clone <your-repo-url>
cd SAP-project 
```

## 2. Start app

```bash
mvn spring-boot:run
```

## 3. Open browser

http://localhost:<PORT>


---

# API Endpoints

## Get all materials

```
GET /materials
```

Example:

```bash
curl http://localhost:8080/materials
```

---

## Get material by ID

```
GET /materials/{id}
```

Example:

```bash
curl http://localhost:8080/materials/1
```

---

## Add new material

```
POST /materials
```

Example:

```bash
curl -X POST http://localhost:8080/materials \
-H "Content-Type: application/json" \
-d '{"name":"Server","quantity":5}'
```

---

## Increase stock

```
POST /materials/{id}/in?qty=<QUANTITY>
```

Example:

```bash
curl -X POST "http://localhost:8080/materials/1/in?quantity=5"
```

---

## Decrease stock

```
POST /materials/{id}/out?qty=<QUANTITY>
```

Example:

```bash
curl -X POST "http://localhost:8080/materials/1/out?quantity=2"
```

---

# Example Materials

| ID | Name     | Quantity |
|----|----------|----------|
| 1  | Radio    | 10 |
| 2  | Laptop   | 5 |
| 3  | Antenna  | 8 |

---

# Project Structure

```text
src/main/java/com/example/demo
│
├── controller
│   └── MaterialController.java
│
├── model
│   └── Material.java
│
├── service
│   └── MaterialService.java
│
└── DemoApplication.java
```

---

# TODO / Future Work
- PostgreSQL database
- Authentication
- Frontend dashboard
- SAP-style UI
- Docker support
- Stock movement history

---

# Author 

Built as a learning project for SAP/system analyst roles and backend development practice.

