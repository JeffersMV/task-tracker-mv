package com.viktor.dao;


import com.viktor.model.User;

import java.util.List;

public interface UserDao {

    public void addUser(User user);

    public List<User> userList();

    public void deleteUser(User user);

    public void editUser(User user);
}
