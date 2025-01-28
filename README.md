# Task Manager API (CRUD Practice Project)

This is a practice project built with **Spring Boot** to implement a simple **CRUD API** for managing tasks. The API allows users to Create, Read, Update, and Delete tasks.

## What is CRUD?

**CRUD** stands for:  
- **C**reate: Add new resources (e.g., tasks).  
- **R**ead: Retrieve existing resources.  
- **U**pdate: Modify existing resources.  
- **D**elete: Remove resources.  

This project demonstrates the implementation of these operations through a RESTful API.

## Features

- Create new tasks with a title, description, and status (`PENDING` or `COMPLETED`).  
- Retrieve a list of all tasks.  
- Retrieve a specific task by its ID.  
- Update the title, description, or status of a task.  
- Delete a task by its ID.  
- Built using **Spring Boot**, **Spring Data JPA**, and an **H2 in-memory database**.

## Technologies Used

- **Java 17**  
- **Spring Boot 3.x**  
- **Spring Data JPA**  
- **H2 Database** (in-memory)  
- **Postman** (for testing)  

## How to Run the Project

1. Clone the repository:  
   ```bash
   git clone https://github.com/YOUR_USERNAME/TASK-MANAGER-API.git  
   cd TASK-MANAGER-API
2. Build and run the project using Maven:
   ```bash
   mvn spring-boot:run
3. The application will be available at:</br>
   http://localhost:8080

## API Endpoints
### Create a Task
  - URL: POST /tasks</br>
  - Description: Create a new task.</br>
  - Request Body:</br>
  {
      "title": "Learn CRUD",</br>
      "description": "Understand the basics of Create, Read, Update, and Delete operations",</br>
      "status": "PENDING"
  }</br>
- Response: </br>
{
    "id": 1,</br>
    "title": "Learn CRUD",</br>
    "description": "Understand the basics of Create, Read, Update, and Delete operations",</br>
    "status": "PENDING"
}</br>
### Get All Tasks
- URL: GET /tasks</br>
- Description: Retrieve a list of all tasks.</br>
- Response:</br>
\[
    {
        "id": 1,</br>
        "title": "Learn CRUD",</br>
        "description": "Understand the basics of Create, Read, Update, and Delete operations",</br>
        "status": "PENDING"
    }
]</br>

### Get a Task by ID
- URL: GET /tasks/{id}</br>
- Description: Retrieve a specific task by its ID.</br>
- Response:</br>
{
    "id": 1,</br>
    "title": "Learn CRUD",</br>
    "description": "Understand the basics of Create, Read, Update, and Delete operations",</br>
    "status": "PENDING"
}</br>

### Update a Task
- URL: PUT /tasks/{id}</br>
- Description: Update a task's details.</br>
- Request Body:</br>
{
    "title": "Learn CRUD (Updated)",</br>
    "description": "Master the CRUD operations",</br>
    "status": "COMPLETED"
}</br>

- Response:</br>
{
    "id": 1,</br>
    "title": "Learn CRUD (Updated)",</br>
    "description": "Master the CRUD operations",</br>
    "status": "COMPLETED"
}

### Delete a Task
- URL: DELETE /tasks/{id}</br>
- Description: Delete a task by its ID.</br>
- Response: 204 No Content</br>



This project is a practice exercise to understand the fundamentals of building a RESTful API using Spring Boot. It is intended for educational purposes and is not designed for production use.




