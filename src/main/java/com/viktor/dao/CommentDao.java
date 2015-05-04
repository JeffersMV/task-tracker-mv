package com.viktor.dao;

import com.viktor.model.Comment;

/**
 * Created by jeff on 20.04.15.
 */
public interface CommentDao {
    public void addComment(Comment comment);

    public void deleteComment(Comment comment);

    public void editComment(Comment comment);
}
