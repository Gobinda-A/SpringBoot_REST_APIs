# 📘 Project Repository: Spring Boot REST APIs

This repository contains two Spring Boot RESTful APIs:

- [📚 BookAPI](#-bookapi)
- [👨‍💼 EmployeeAPI](#-employeeapi)

---

# 📚 BookAPI

BookAPI is a simple RESTful web service developed using **Spring Boot**. It provides basic CRUD operations to manage a collection of books.

---

## ✅ Features

- Create a new book  
- Retrieve book details  
- Update existing book information  
- Delete a book by ID  

---

## 🔧 Technologies Used

- Java
- Spring Boot
- Spring Web
- Maven 
---

## 📡 HTTP Methods

| Method | Endpoint         | Description              |
|--------|------------------|--------------------------|
| GET    | `/api/books`     | Get all books            |
| GET    | `/api/books/{id}`| Get book by ID           |
| POST   | `/api/books`     | Add a new book           |
| PUT    | `/api/books/{id}`| Update existing book     |
| DELETE | `/api/books/{id}`| Delete book by ID        |

---
## 📸 Postman Snapshots

Below are the Postman screenshots demonstrating each feature of the API:

- **POST /api/books** – Create a new book  
  <img width="1442" height="761" alt="image" src="https://github.com/user-attachments/assets/b78d4f0f-839c-45ff-95f7-869315d17437"  style="border: 2px solid black"/>


- **GET /api/books** – Retrieve all books  
  <img width="1447" height="959" alt="image" src="https://github.com/user-attachments/assets/da71e999-9be6-4be3-8df6-3653f5e20651" />


- **GET /api/books/{id}** – Retrieve book by ID  
  <img width="1446" height="568" alt="image" src="https://github.com/user-attachments/assets/42abaee1-6c5b-4924-97d4-2f00c603a562" />


- **PUT /api/books/{id}** – Update book details  
 <img width="1449" height="727" alt="image" src="https://github.com/user-attachments/assets/ba13ceea-2d93-44a6-9e76-594c12d7bb88" />


- **DELETE /api/books/{id}** – Delete a book by ID  
 <img width="1446" height="535" alt="image" src="https://github.com/user-attachments/assets/b26a7a48-25f8-4571-aa06-2bbf0f7be75d" />

## 🛠 Setup & Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/BookAPI.git
   cd BookAPI

---
# 👨‍💼 EmployeeAPI

EmployeeAPI is a RESTful service developed using **Spring Boot** to manage employee data. It performs full CRUD operations and includes an additional feature to **retrieve sorted employee records by first name**. Unlike the BookAPI, it connects to an **actual PostgreSQL database** for data persistence.

---

## ✅ Features

- Add a new employee  
- Retrieve employee by ID  
- Retrieve all employees  
- Update existing employee information  
- Delete an employee by ID  
- Retrieve employees sorted by first name  

---

## 🔧 Technologies Used

- Java  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- PostgreSQL Driver  
- Maven  

---

## 🗃️ Database

The EmployeeAPI connects to a **PostgreSQL database** for storing and retrieving employee data using Spring Data JPA.

---

## 📡 HTTP Methods

| Method | Endpoint                | Description                           |
|--------|-------------------------|---------------------------------------|
| GET    | `/api/emp`              | Get all employees                     |
| GET    | `/api/emp/{id}`         | Get employee by ID                    |
| POST   | `/api/emp`              | Add a new employee                    |
| PUT    | `/api/emp/{id}`         | Update existing employee              |
| DELETE | `/api/emp/{id}`         | Delete employee by ID                 |
| GET    | `/api/emp/sorted`       | Get employees sorted by first name    |

---

## 📸 Postman Snapshots

Below are the screenshots demonstrating each feature of the API:

- **POST /api/emp** – Add a new employee  
  <img width="1385" height="608" alt="image" src="https://github.com/user-attachments/assets/47bb4f31-9d45-4a40-8d04-3844a6061a84" />


- **GET /api/emp** – Retrieve all employees  
 <img width="1386" height="847" alt="image" src="https://github.com/user-attachments/assets/ffd6a81c-c266-4b44-97f8-bd58e88300ca" />


- **GET /api/emp/{id}** – Retrieve employee by ID  
 <img width="1369" height="456" alt="image" src="https://github.com/user-attachments/assets/74c6cfea-9796-4128-8969-4163308a933b" />


- **PUT /api/emp/{id}** – Update employee details  
  <img width="1350" height="556" alt="image" src="https://github.com/user-attachments/assets/d1dd4dec-3ed3-4c77-98bc-6a79a2a75e78" />


- **DELETE /api/emp/{id}** – Delete an employee  
  <img width="1371" height="392" alt="image" src="https://github.com/user-attachments/assets/23eb3d78-6709-4b81-a487-6167a3261875" />


- **GET /api/emp/sorted** – Get sorted list of employees  
  <img width="1389" height="861" alt="image" src="https://github.com/user-attachments/assets/cc1f8983-4728-4462-ac30-8d25e2c110b5" />


---

## 🛠 Setup & Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/EmployeeAPI.git
   cd EmployeeAPI

