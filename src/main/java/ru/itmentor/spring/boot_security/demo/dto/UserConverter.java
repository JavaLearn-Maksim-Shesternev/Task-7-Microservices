package ru.itmentor.spring.boot_security.demo.dto;

import ru.itmentor.spring.boot_security.demo.model.Role;
import ru.itmentor.spring.boot_security.demo.model.User;

import java.util.Set;
import java.util.stream.Collectors;

public class UserConverter {

    public static UserDTO toDTO(User user) {
        Set<String> roles = user.getRoles()
                .stream()
                .map(Role::getName)
                .collect(Collectors.toSet());
        return new UserDTO(user.getId(), user.getUsername(), user.getEmail(), roles);
    }

    public static User toEntity(UserCreateDTO userDTO, Set<Role> roles) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setRoles(roles);
        return user;
    }
}