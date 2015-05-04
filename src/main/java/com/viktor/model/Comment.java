package com.viktor.model;

import com.viktor.model.common.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "comment")
public class Comment extends Model implements Serializable {


    private static final long serialVersionUID = -8057444865557469469L;
    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    @Column(name = "comment", columnDefinition = "TEXT")
    private String comment;

    public Comment() {
    }

    public Comment(long id) {
        super(id);
    }

    public Comment(long id, Task task, String comment) {
        super(id);
        this.task = task;
        this.comment = comment;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
