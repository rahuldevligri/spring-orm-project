package com.spring_orm.in.service;

import com.spring_orm.in.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User getUser(int userId);
    List<User> getAllUsers();
    User updateUser(User user,int userId);
    void deleteUser(int userId);
}

