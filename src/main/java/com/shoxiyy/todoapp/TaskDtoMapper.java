package com.shoxiyy.todoapp;

import org.springframework.stereotype.Service;

@Service
public class TaskDtoMapper {
    TaskDto map (Task task) {
        TaskDto taskDto = new TaskDto();
        taskDto.setId(task.getId());
        taskDto.setName(task.getName());
        return taskDto;
    }

    Task map (TaskDto taskDto) {
        Task task = new Task();
        task.setId(taskDto.getId());
        task.setName(taskDto.getName());
        return task;
    }
}
