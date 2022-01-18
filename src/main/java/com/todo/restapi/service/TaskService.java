package com.todo.restapi.service;

import java.util.List;

import com.todo.restapi.entity.Task;

public interface TaskService {

    public Task saveTask(Task task);

    public List<Task> getTasks();

    public Task getTaskById(Long taskId);

    public String deleteTaskById(Long taskId);

    public Task updateTaskById(Long taskId, Task task);

}
