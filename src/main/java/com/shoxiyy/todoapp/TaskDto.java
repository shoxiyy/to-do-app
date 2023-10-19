package com.shoxiyy.todoapp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class TaskDto {
    private Long id;
    private String name;

    public TaskDto() {
    }

    public TaskDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
