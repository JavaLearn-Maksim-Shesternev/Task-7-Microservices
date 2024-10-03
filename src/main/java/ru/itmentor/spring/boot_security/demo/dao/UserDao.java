package ru.itmentor.spring.boot_security.demo.dao;

import crudapplication.Crud2Boot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getUserById(Long id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);
}
