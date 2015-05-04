package com.viktor.model;

import com.viktor.model.common.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "project")
public class Project extends Model implements Serializable {


    private static final long serialVersionUID = 9028188696432849386L;
    @OneToMany(mappedBy = "project")
    private List<Task> taskList;

    @Column(name = "project")
    private String project;


    public Project() {
    }

    public Project(long id) {
        super(id);
    }

    public Project(long id, List<Task> taskList, String project) {
        super(id);
        this.taskList = taskList;
        this.project = project;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
