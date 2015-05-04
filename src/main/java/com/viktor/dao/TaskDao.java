package com.viktor.dao;

import com.viktor.model.Task;

import java.util.List;

/**
 * Created by jeff on 20.04.15.
 */
public interface TaskDao {
    public List<Task> taskList();

    public void addTask(Task task);

    public void statusTask(Task task);

}
