# Event-Driven User Activity Tracking System

A simple microservice that simulates tracking user activities (e.g., page visits, clicks) on a website. The activities are sent as messages to a Kafka topic, consumed by a Spring Boot service, processed, and stored in MongoDB. The stored activity data is then exposed via a REST API.

![Overview](https://github.com/marsRocha/event-driven-activity-tracking/blob/main/Overview.png)

## **Components of the Project**

1. **Kafka**: A message broker that handles real-time user activity events.
2. **MongoDB**: A NoSQL database used to store processed user activity data.
3. **Spring Boot**: A backend service responsible for:
    - Reading and processing events from Kafka.
    - Storing processed data in MongoDB.
    - Exposing an API to query the stored activity data.
4. **Angular Frontend**: A web application that:
    - Allows users to generate activities by navigating pages and clicking buttons.
    - Communicates with the Spring Boot backend to send activity data.
    - Displays the list of user activities retrieved from the backend.
5. **Docker**: Used to spin up Kafka and MongoDB instances for local development.

## **Getting Started**

### **Prerequisites**

- Docker installed on your machine.
- Node.js and npm installed for the frontend.

### **Running the Application**

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd <repository-directory>
   ```
2. **Start the backend and database services using Docker**:
   ```bash
    docker-compose up
   ```
3. **Navigate to the frontend directory and install dependencies**:

   ```bash
    cd frontend
    npm install
   
4. **Start the Angular application**:

   ```bash
    ng serve

## **Access the Application**

- Frontend: http://localhost:4200/
- Backend API: http://localhost:8080/api/v1/activity
- Mongo Express: http://localhost:8081/

## **Functionality**

- Frontend:
    - Users can trigger activities such as page visits and button clicks.
    - The frontend sends these events to the backend for processing.
    - The user activities can be viewed in a table format, fetched from the backend.
- Backend:
    - Listens to the Kafka topic for incoming activity messages.
    - Processes the messages and stores them in MongoDB.
    - Provides an API for the frontend to fetch stored user activities.

## **Contributions**

Feel free to fork the repository and submit pull requests for improvements or new features. :)
