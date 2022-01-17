package com.example.ApiuxBack.repositories;

import com.example.ApiuxBack.models.TaskModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<TaskModel, Long> {
    
}
