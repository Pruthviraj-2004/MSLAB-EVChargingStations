Here’s a comprehensive README file for your **MSLAB-EVChargingStations** project:

---

# MSLAB-EVChargingStations

MSLAB-EVChargingStations is a Spring Boot-based microservices application designed to manage electric vehicle (EV) charging stations efficiently. The project includes five distinct microservices, all running on separate ports and unified through an API Gateway. This architecture ensures scalability, modularity, and ease of management.

## 🚀 Features
- **Station Registration Service**: Manage the registration of EV charging stations.
- **Customer Service**: Handle customer-related operations, including adding, viewing, and deleting customer records.
- **Charging Session Management Service**: Manage EV charging sessions for customers and stations.
- **Eureka Discovery Server**: A central registry for managing microservices and enabling service discovery.
- **API Gateway**: Unify all microservices under a single endpoint for streamlined communication and routing.

## 📂 Project Structure
```
.
├── Station Registration Service
├── Customer Service
├── Charging Session Management Service
├── Eureka Discovery Server
├── API Gateway
├── resources
│   ├── static        # Contains CSS, JS, and other static files
│   └── templates     # Contains HTML files for frontend views
└── README.md
```

## ⚙️ Technologies Used
- **Java 17**
- **Spring Boot 3.0**
- **Spring Cloud Eureka** for service discovery
- **Spring Cloud Gateway** for routing and load balancing
- **MySQL** for database storage
- **HTML, CSS, and JavaScript** for the frontend
- **Postman** for API testing
- **Maven** for project dependency management

## 📦 Microservices and Port Configuration
| Microservice                  | Port   |
|-------------------------------|--------|
| **Eureka Discovery Server**   | 3001   |
| **Station Registration Service** | 3002 |
| **Customer Service**          | 3004   |
| **Charging Session Management Service** | 3008 |
| **API Gateway**               | 8080   |

## 🔗 API Endpoints
Here’s a summary of the endpoints exposed through the API Gateway (running on `http://localhost:8080`):

1. **Station Service**  
   - `GET /station/all`: Get all registered stations.
   - `POST /station/add`: Register a new charging station.

2. **Customer Service**  
   - `GET /customer/all`: Get all customers.
   - `GET /customer/{id}`: Get details of a specific customer.
   - `DELETE /customer/{id}`: Delete a customer by ID.

3. **Charging Session Service**  
   - `GET /charging-session/all`: Get all charging sessions.
   - `POST /charging-session/start`: Start a new charging session.

## 🖥️ How to Run the Project
1. Clone the repository:  
   ```bash
   git clone https://github.com/your-username/MSLAB-EVChargingStations.git
   cd MSLAB-EVChargingStations
   ```
2. Set up a **MySQL** database and update the `application.properties` file for each microservice with the correct database credentials.
3. Run the **Eureka Discovery Server**:
   ```bash
   mvn spring-boot:run -pl eureka-server
   ```
4. Start each microservice one by one:
   ```bash
   mvn spring-boot:run -pl station-service
   mvn spring-boot:run -pl customer-service
   mvn spring-boot:run -pl charging-session-service
   mvn spring-boot:run -pl gateway-service
   ```
5. Access the services through the Gateway at `http://localhost:3013`.

## 🎥 Demonstration Video
Watch the video walkthrough of the project:  
[![Drive Video](https://img.shields.io/badge/Watch%20Video-Google%20Drive-green?style=flat-square&logo=google-drive)](https://drive.google.com/file/d/1a1pCDasI5Tj2YPA24-kb44AWwQUX-gHV/view?usp=sharing)

## ✨ Future Enhancements
- Implement authentication and authorization using **Spring Security**.
- Add Docker support for containerization.
- Introduce advanced monitoring tools like **Spring Boot Actuator** and **Prometheus**.

---

Feel free to customize this further based on your specific project details!
