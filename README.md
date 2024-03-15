# EmployeeCrud
This repository contains a simple Spring Boot application for performing CRUD (Create, Read, Update, Delete) operations on an Employee entity. The application utilizes Spring Data JPA for data access and H2 Database for persistence. It exposes RESTful endpoints to interact with the Employee entity.

API Endpoints
The following REST endpoints are available:

GET /employees: Retrieve all employees.
GET /employees/{id}: Retrieve an employee by ID.
POST /employees: Create a new employee.
PUT /employees/{id}: Update an existing employee.
DELETE /employees/{id}: Delete an employee by ID.
