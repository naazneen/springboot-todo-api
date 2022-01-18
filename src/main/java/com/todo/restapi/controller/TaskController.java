package com.todo.restapi.controller;

import com.todo.restapi.entity.Task;
import com.todo.restapi.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/task")
    public Task saveTask(@RequestBody Task task) {

        return taskService.saveTask(task);

    }

    @GetMapping("/task")
    public List<Task> getTasks() {
        return taskService.getTasks();
    }

    @GetMapping("/task/{id}")
    public Task getTaskById(@PathVariable("id") Long taskId) {
        return taskService.getTaskById(taskId);
    }

    @DeleteMapping("/task/{id}")
    public String deleteTaskById(@PathVariable("id") Long taskId) {
        return taskService.deleteTaskById(taskId);
    }

    @PatchMapping("/task/{id}")
    public Task updateTaskById(@PathVariable("id") Long taskId, @RequestBody Task task) {
        return taskService.updateTaskById(taskId, task);
    }
}
