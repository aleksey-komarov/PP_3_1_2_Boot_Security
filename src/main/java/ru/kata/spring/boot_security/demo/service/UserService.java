package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {

    User findByUsername(String username);

    User getUser(long id);

    void addUser(User user);

    void updateUser(User user, long id);

    void deleteUser(long id);

    List<User> getAllUsers();

    boolean uniqueUsername(String username);


}
