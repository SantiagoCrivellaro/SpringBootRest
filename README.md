![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.4-brightgreen)
![Spring Web](https://img.shields.io/badge/Spring-Web-success)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-Hibernate-blue)
![MySQL](https://img.shields.io/badge/MySQL-Database-4479A1?logo=mysql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?logo=apachemaven&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-Reducing%20Boilerplate-pink)




# Spring Boot REST API — Product & Maker Management

A production-style REST API built with Spring Boot, Spring Data JPA, and MySQL for managing products and their manufacturers.

This project demonstrates a layered backend architecture, implementing clean separation between controllers, services, repositories, DTOs, and entities, following best practices used in modern backend development.

The API provides full CRUD operations for both Products and Makers, including entity relationships and DTO mapping.

# Features

• RESTful API design
• Layered architecture (Controller → Service → Repository)
• DTO pattern for API responses
• Entity relationship mapping with JPA
• MySQL database integration
• Lombok to reduce boilerplate code
• Maven project management
• Clean and maintainable structure

# Tech Stack

Technology	Purpose
Java 17	Core language
Spring Boot 3	Backend framework
Spring Web	REST API
Spring Data JPA	Data persistence
Hibernate	ORM
MySQL	Relational database
Lombok	Boilerplate reduction
Maven	Build tool


# Architecture

The application follows a layered architecture, promoting separation of concerns.

Controller Layer
      ↓
Service Layer
      ↓
Repository (DAO) Layer
      ↓
Database

## Controller

Handles HTTP requests and responses.

## Service

Contains the business logic and orchestrates repository operations.

## Repository

Handles database communication using Spring Data JPA.

## DTO

Used to expose clean API responses without exposing internal entities.

# Entity Relationship

The system models a Manufacturer → Products relationship.

Maker (Fabricante)
      |
      | 1
      |
      |------< Product (Producto)
              N
Maker

Represents a manufacturer.

Fields

id
name
productList
Product

Represents a product produced by a manufacturer.

Fields

id
name
price
maker

# API Endpoints

## Maker Endpoints

### Get maker by ID

GET /api/maker/find/{id}

Response

{
  "id": 1,
  "name": "Apple"
}

### Get all makers
GET /api/maker/findAll

### Create maker
POST /api/maker/save

Request body

{
  "name": "Samsung"
}

## Update maker
PUT /api/maker/update/{id}

### Delete maker
DELETE /api/maker/delete/{id}

#Product Endpoints

### Get product by ID
GET /api/product/find/{id}
Get all products
GET /api/product/findAll

### Create product
POST /api/product/save

Request body

{
  "name": "iPhone 15",
  "price": 1200,
  "maker": {
    "id": 1
  }
}

### Update product
PUT /api/product/update/{id}

### Delete product
DELETE /api/product/delete/{id}

# Project Structure
src/main/java/com/application/rest

controllers
 ├─ MakerController
 ├─ ProductController
 └─ dto
      ├─ MakerDTO
      └─ ProductDTO

entities
 ├─ Maker
 └─ Product

repositories
 └─ MakerRepository

service
 ├─ IMakerService
 ├─ IProductService
 └─ impl
      ├─ MakerServiceImpl
      └─ ProductServiceImpl
      

# Installation

## 1 Clone the repository
git clone https://github.com/SantiagoCrivellaro/SpringBootRest.git
## 2 Enter the project directory
cd SpringBootRest
## 3 Configure the database

Update your application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/database
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# 4 Run the project

Using Maven wrapper

./mvnw spring-boot:run

Or on Windows

mvnw.cmd spring-boot:run

# Example Database Schema

Tables created by Hibernate:

fabricante
 ├─ id
 └─ nombre

producto
 ├─ id
 ├─ nombre
 ├─ precio
 └─ id_fabricante

# Design Principles

This project applies several backend design practices:

• DTO Pattern — prevents exposing internal entities
• Dependency Injection — via Spring Framework
• Separation of Concerns
• Repository Pattern
• Clean architecture organization

# Future Improvements

Possible extensions to evolve this project into a production-ready system:

• Global Exception Handling
• Validation with @Valid
• Pagination and filtering
• OpenAPI / Swagger documentation
• Authentication with Spring Security + JWT
• Docker containerization
• Unit and integration tests

# Author

Santiago Crivellaro

Backend Developer focused on Java, Spring Boot, APIs and distributed systems.

Linkedin : https://www.linkedin.com/in/santiago-crivellaro-3372143b6/
