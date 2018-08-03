package com.malek.pilotage.taches.restControllers;

import com.malek.pilotage.taches.entities.Task;
import com.malek.pilotage.taches.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskControllers {

    final
   private TaskRepository taskRepository ;

    @Autowired
    public TaskControllers(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("api/tasks")
    public List<Task> getAllTasks(){
        return  taskRepository.findAll() ;

    }
}
