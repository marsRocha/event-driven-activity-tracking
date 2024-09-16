# event-driven-activity-tracking
Event-Driven User Activity Tracking System

A simple microservice that simulates tracking user activities (e.g., page visits, clicks, etc.) on a website. The activities will be sent as messages to a Kafka topic, consumed by a Spring Boot service, processed, and stored in MongoDB. The stored activity data will then be exposed via a REST API.

## **Components of the Project:**

1. **Kafka** – Message broker to handle user activity events in real-time.
2. **MongoDB** – NoSQL database to store the processed user activity data.
3. **Spring Boot** – Backend service to:
    - Read and process events from Kafka.
    - Store the processed data in MongoDB.
    - Expose an API for querying the stored activity data.
4. **Docker** – To spin up MongoDB instance for local development.