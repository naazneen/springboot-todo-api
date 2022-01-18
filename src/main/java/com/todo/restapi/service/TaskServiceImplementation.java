package com.todo.restapi.service;

import java.util.List;
import java.util.Objects;

import com.todo.restapi.entity.Task;
import com.todo.restapi.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImplementation implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long taskId) {
        return taskRepository.findById(taskId).get();
    }

    @Override
    public String deleteTaskById(Long taskId) {
        taskRepository.deleteById(taskId);
        return "Task ID: " + taskId + " Deleted Successfully";
    }

    @Override
    public Task updateTaskById(Long taskId, Task task) {
        Task this_task = taskRepository.findById(taskId).get();
        if (task.getTaskName() != "" && Objects.nonNull(task.getTaskName())) {
            this_task.setTaskName(task.getTaskName());
        }
        if (task.getTaskStatus() != "" && Objects.nonNull(task.getTaskStatus())) {
            this_task.setTaskStatus(task.getTaskStatus());
        }
        return taskRepository.save(this_task);
    }

}
