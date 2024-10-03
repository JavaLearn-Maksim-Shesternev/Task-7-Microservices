package ru.itmentor.spring.boot_security.demo.service;

import crudapplication.Crud2Boot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    void saveUser(User user);

    void updateUser(Long id, User user);

    void deleteUser(Long id);
}
