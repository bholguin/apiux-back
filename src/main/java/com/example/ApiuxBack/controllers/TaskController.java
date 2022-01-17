package com.example.ApiuxBack.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ApiuxBack.models.TaskModel;
import com.example.ApiuxBack.services.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/task")
public class TaskController {
    @Autowired
    TaskService taskService;

    @GetMapping()
    public ArrayList<TaskModel> getTasks() {
        return taskService.getTasks();
    }

    @GetMapping(path = "/{id}")
    public Optional<TaskModel> getTask(@PathVariable("id") Long id) {
        return this.taskService.getTask(id);
    }
     
    @PostMapping()
    public TaskModel postTask(@RequestBody TaskModel task) {
        return this.taskService.postTask(task);
    }

    @DeleteMapping(path = "/{id}")
    public String  deleteTask(@PathVariable("id") Long id){
        boolean ok = this.taskService.removeTask(id);
        if(ok){
            return "remove " + id;
        } else {
            return "can't remove " + id;
        }
    }

}
