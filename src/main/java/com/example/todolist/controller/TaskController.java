package com.example.todolist.controller;

import com.example.todolist.model.Task;
import com.example.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController indica que esta clase manejará solicitudes HTTP.
@RestController

// @RequestMapping define el prefijo para todos los endpoints de esta clase.
@RequestMapping("/tasks")
public class TaskController {

    // @Autowired inyecta el servicio para que podamos usarlo.
    @Autowired
    private TaskService service;

    // GET /tasks: Obtiene la lista de todas las tareas.
    @GetMapping
    public List<Task> getAllTasks() {
        return service.getAllTasks();
    }

    // GET /tasks/{id}: Obtiene una tarea específica por su ID.
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return service.getTaskById(id);
    }

    // POST /tasks: Crea una nueva tarea.
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return service.createTask(task);
    }

    // PUT /tasks/{id}: Actualiza una tarea existente.
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return service.updateTask(id, task);
    }

    // DELETE /tasks/{id}: Elimina una tarea por su ID.
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
    }
}
