package com.shoxiyy.todoapp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@Controller
public class TaskController {
    private final TaskService taskService;

    @GetMapping("/")
    String home(Model model) {
        model.addAttribute("tasks", taskService.findAllTasks());
        model.addAttribute("task", new Task());
        return "index";
    }

    @PostMapping("/save")
    public String saveTask(TaskDto task) {
        taskService.addTask(task);
        return "redirect:/";
    }

    @PostMapping ("/delete/{id}")
    String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/";
    }

}
