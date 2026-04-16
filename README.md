# BlooperMessage Backend

Backend service for a real-time messaging platform built with Java and Spring Boot. Designed to evolve into a full-scale system supporting authentication, real-time communication, and multi-server messaging architecture.

---

## Tech Stack

* Java 17
* Spring Boot
* Spring Data JPA (Hibernate)
* PostgreSQL (Neon)
* Spring Security
* WebSockets (planned)

---

## Current Features

* RESTful API for user registration
* Persistent data storage using PostgreSQL (Neon)
* ORM-based entity modeling with Hibernate
* Automatic schema generation and mapping
* Repository pattern implementation for database abstraction

---

## API

### Register User

POST `/signup-user`

```json
{
  "username": "testuser",
  "password": "12345"
}
```

---

## Architecture

```
Client (Postman / Frontend)
        ↓
Controller Layer
        ↓
Repository Layer (Spring Data JPA)
        ↓
PostgreSQL (Neon)
```

---

## Roadmap (In Progress)

This project is actively being expanded into a full real-time messaging system:

Authentication & Security

* Password hashing with BCrypt
* Login endpoint
* JWT-based authentication
* Role-based authorization

Real-Time Messaging

* WebSocket-based messaging system
* Channel-based message broadcasting
* Online presence tracking
* Typing indicators

Platform Features

* Server (guild) creation and management
* Channel system (text-based rooms)
* Direct messaging (DMs)
* Message persistence and pagination

System Design Enhancements

* Caching (Redis or in-memory)
* Rate limiting
* Scalable service architecture
* Deployment to cloud infrastructure

---

## Highlights

* Built a functional backend capable of handling HTTP requests and persisting user data to a cloud-hosted PostgreSQL database
* Implemented repository pattern using Spring Data JPA to abstract database operations
* Integrated external database (Neon) and resolved real-world connection and configuration issues
* Structured application using scalable backend design patterns in preparation for real-time system expansion

---

## Purpose

This project demonstrates practical backend engineering skills and is being developed into a real-time messaging platform similar in architecture to modern communication systems.
