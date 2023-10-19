package com.shoxiyy.todoapp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;
    private final TaskDtoMapper taskDtoMapper;

    TaskDto addTask(TaskDto taskdto) {
        Task task = taskDtoMapper.map(taskdto);
        Task savedTask = taskRepository.save(task);
        return taskDtoMapper.map(savedTask);
    }

    List<Task> findAllTasks() {
       return new ArrayList<>(taskRepository.findAll());
    }

    void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }


}
