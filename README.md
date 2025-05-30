## Projects Overview

### 1. Banking System

* Manages customer account creation with basic details and balance tracking.
* Allows adding and managing beneficiaries for fund transfers.
* Supports secure money transfers between customer and beneficiary accounts.
* Maintains a simple transaction history for each account.



**Packages:**

1. entities : Account, Customer, Transaction, Beneficiary
2. services : Interface and implementation of banking operations
3. application : Main class BankingSystemApp.java

### 2. Food Delivery System


* Displays a list of available food items with names, prices, and item codes for customers to view and choose from.
* Allows customers to add selected food items to their cart and place orders.
* Simulates the order delivery process, assigning delivery persons and updating the delivery status.

**Packages:**

1. entities : Customer, Restaurant, FoodItem, Order, Cart, DeliveryPerson
2. services : Business logic
3. application : Main class FoodDeliverySystem.java

### 3. Online Shopping System



* Users browse and choose products to add to their cart.
* Users manage their selected items by adjusting quantities or removing products.
* Users enter shipping details, select payment methods, and confirm the order.


**Packages:**

1. entities : Product, Customer, Order, Cart, Admin
2. services : Interface and logic classes
3. application : Main class OnlineShopping.java

### Steps to Run
1. Extract each project zip file.
2. Open in **Eclipse IDE** or any Java-supporting IDE.
3. Navigate to the application package.
4. Run the main class (*.java).

### Requirements

* Java JDK 8 or above
* Eclipse / IntelliJ IDEA / VS Code with Java extension

## Student CRUD Operation System

A full-stack application that allows users to perform CRUD (Create, Read, Update, Delete) operations on student data. The backend is developed using Spring Boot with PostgreSQL, and the frontend is built using React.js.

### Features

- Add new student with name, email, course, and age
- Automatically generates a unique ID for each student
- View all students
- Update existing student details
- Delete student by ID
- RESTful API design
- Professional UI using React with Bootstrap
- Tested using Postman

### Backend:
- **Java** with **Spring Boot**
- **PostgreSQL** as the database
- **Maven** for dependency management
- **Eclipse IDE**
- **Postman** for API testing

### Frontend:
- **React.js**
- **Bootstrap** for styling
- **Axios** for API calls





