package com.todo.restapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long taskId;
    private String taskName;
    private String taskStatus;

    public Task(Long taskId, String taskName, String taskStatus) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskStatus = taskStatus;
    }

    public Task() {
    }

    @Override
    public String toString() {
        return "Task{"
                + "taskId:" + taskId
                + "taskName:" + taskName
                + "taskStatus:" + taskStatus
                + "}";
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

}
