# 🔢 NextNumber Spring Boot Application

This Spring Boot application provides a REST API to calculate the next number in a given sequence or based on custom logic defined in the controller.

---

## 🛠️ Features

- RESTful API with Spring Boot  
- Maven project setup  
- Lightweight response model  
- Easily extendable  

---

## 📁 Project Structure

<code>nextnumber/
├── src/
│ ├── main/
│ │ ├── java/com/example/nextnumber/
│ │ │ ├── NextnumberApplication.java
│ │ │ ├── controller/NextNumberController.java
│ │ │ └── model/NumberResponse.java
│ │ └── resources/
│ │ └── application.properties
│ └── test/
│ └── java/com/example/nextnumber/NextnumberApplicationTests.java
├── pom.xml
├── mvnw / mvnw.cmd
</code>


---

## 🚀 Getting Started

### ✅ Prerequisites

- Java 17+ (preferably JDK 21)  
- Maven (or use the Maven wrapper included)  
- IDE like IntelliJ or VS Code (optional but recommended)  

---

## 🧪 Run the Application

### 🖥️ Using Command Line:

```bash
# Navigate to the project directory
cd nextnumber

# Run using Maven wrapper (preferred)
./mvnw spring-boot:run

# Or with installed Maven
mvn spring-boot:run
```
---

## 🧪 Test it

Once the application is running, go to your browser or use Postman and access:  
👉 **GET** [http://localhost:8080/api/next?number=5](http://localhost:8080/api/next?number=5)

---

## ✅ Expected Output

```
{
  "nextNumber": 6
}
```

---
## 📦 API Endpoint

| Method | Endpoint     | Query Param | Description                     |
|--------|--------------|-------------|---------------------------------|
| GET    | /api/next  | number    | Returns next number (input + 1) |

---
## 🧑‍💻 Author
Developed by Vijay Vardhan
