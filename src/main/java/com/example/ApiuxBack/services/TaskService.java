package com.example.ApiuxBack.services;
import com.example.ApiuxBack.models.TaskModel;
import com.example.ApiuxBack.repositories.TaskRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;


    public ArrayList<TaskModel> getTasks() {
        return (ArrayList<TaskModel>) taskRepository.findAll();
    }
    
    public Optional<TaskModel> getTask(long id) {
        return this.taskRepository.findById(id);
    }

    public TaskModel postTask(TaskModel task) {
        return this.taskRepository.save(task);
    }

    public boolean removeTask(long id) {
        try{
            this.taskRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}