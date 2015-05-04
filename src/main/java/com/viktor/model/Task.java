package com.viktor.model;

import com.viktor.model.common.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "task")
public class Task extends Model implements Serializable {


    private static final long serialVersionUID = -8266846015125853498L;
    @OneToMany(mappedBy = "task")
    private List<Comment> commentList;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "do_id")
    private User userDo;

    @Column(name = "task")
    private String task;

    @Column(name = "status")
    private boolean status;

    public Task() {
    }

    public Task(long id) {
        super(id);
    }

    public Task(long id, List<Comment> commentList, Project project, User userDo, String task, boolean status) {
        super(id);
        this.commentList = commentList;
        this.project = project;
        this.userDo = userDo;
        this.task = task;
        this.status = status;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public User getUserDo() {
        return userDo;
    }

    public void setUserDo(User userDo) {
        this.userDo = userDo;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
