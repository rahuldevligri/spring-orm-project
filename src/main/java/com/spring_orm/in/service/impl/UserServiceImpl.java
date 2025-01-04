package com.spring_orm.in.service.impl;

import com.spring_orm.in.entity.User;
import com.spring_orm.in.repositories.UserRepository;
import com.spring_orm.in.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepository userRepository;

    /**
     * create user
     * @return savedUser
     */
    @Override
    public User saveUser(User user) {
        User saveUser = userRepository.save(user);
        logger.info("Saved user ID: {}",saveUser.getId());
        return saveUser;
    }

    /**
     * get single user with given id
     * @return user
     */
    @Override
    public User getUser(int userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        User user = userOptional.orElseThrow(() -> new RuntimeException("User with given id not found"));
        return user;
    }

    /**
     * get all users
     * @return list of users
     */
    @Override
    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }

    /**
     * update user by id
     * @return updatedUser
     */
    @Override
    public User updateUser(User user, int userId) {
        //1. user get from database
        User oldUser = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User with given id not found..."));
        oldUser.setName(user.getName());
        oldUser.setCity(user.getCity());
        oldUser.setAge(user.getAge());
        oldUser.setEmail(user.getEmail());

        //2. update user
        User updatedUser = userRepository.save(oldUser);

        return updatedUser;
    }

    /**
     * delete single user by id
     */
    @Override
    public void deleteUser(int userId) {
        //1. get user by id from database
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User with given id not found..."));

        //2. delete user
        userRepository.delete(user);
        logger.info("user Deleted...");

    }
}
