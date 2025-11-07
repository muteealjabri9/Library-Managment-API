# 📚 Library Management API (Spring Boot)

A simple **Spring Boot** project that creates a **RESTful API** for managing a library using **Hard Coded Data** (no database).  
The project demonstrates how to build basic APIs for managing users, books, and borrow operations.

---

## 🧩 Project Overview

The project includes three main parts:

- 👤 **User Management** — Register, Login, and View All Users  
- 📘 **Book Management** — Add, Edit, Delete, and View All Books  
- 🔄 **Borrow Management** — Add, Remove, and View Borrow Records

---

## 🚀 Technologies Used

- **Java 17+**
- **Spring Boot 3+**
- **Spring Web**
- **Maven**

---
## 📡 API Endpoints
👤 **User Management**

| Operation      | Method | Endpoint        | Description              |
|----------------|--------|-----------------|--------------------------|
| Login          | POST   | /users/login    | Authenticate a user      |
| Register User  | POST   | /users/register | Register a new user      |
| View All Users | GET    | users/allUsers  | Get all registered users |

<small>📸 **Postman Screenshots:**</small>

<small>Located in /ScreenShots/Users/</small>

---

📘 **BooK Management**

| Operation      | Method | Endpoint         | Description           |
|----------------|--------|------------------|-----------------------|
| Add Book       | POST   | books/addbook    | Add a new book        |
| Edit Book      | PUT    | books/editbook   | Edit book information |
| Delete Book    | DELETE | books/deletebook | Delete a book         |
| View All Books | GET    | books/allbooks   | Get all books         |


<small>📸 **Postman Screenshots:**</small>

<small>Located in /ScreenShots/Books/</small>

---
**🔄 Borrow Management**

| Operation                   | Method | Endpoint             | Description                         |
|-----------------------------|--------|----------------------|-------------------------------------|
| Add Borrow                  | POST   | borrows/addBorrow    | Add a new borrow record             |
| Remove Borrow               | DELETE | borrows/removeBorrow | Remove a borrow record              |
| Load All Borrows            | GET    | borrows/loadborrows  | Get all borrow records              |
| Load All Borrows By User Id | GET    | /loadborrows/{userId}    | Get all borrows for a specific user |

📸 Postman Screenshots:

<small>Located in /ScreenShots/Borrows/</small>

---

**🧠 Notes**
* This project does not use a database — all data is hard coded inside the code.
* You can easily extend it later to connect with a real database (e.g., MySQL, PostgreSQL).
* All API endpoints were tested using Postman.
* You can Import API JSON EndPoints to PostMan (the File included in project files)

---

## 👨‍💻 Author
* Name: Motea Ghalib Ali Aljaberi
* Email: muteealjabri@gmail.com
* Created: November 2025
## ⚙️ How to Run

1. Make sure you have installed:
   - Java 17 or higher  
   - Maven

2. Run the project using your IDE (IntelliJ / VS Code)  
   or from the command line:

   ```bash
   mvn spring-boot:run
