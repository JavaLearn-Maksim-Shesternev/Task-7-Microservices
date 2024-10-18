package ru.itmentor.spring.boot_security.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.List;

public class UserCreateDTO {
    @NotBlank(message = "Имя пользователя не может быть пустым")
    @Size(min = 2, max = 30, message = "Имя пользователя должно быть от 2 до 30 символов")
    private String username;

    @NotBlank(message = "Email не может быть пустым")
    @Email(message = "Некорректный формат email")
    private String email;

    @NotBlank(message = "Пароль не может быть пустым")
    @Size(min = 4, message = "Пароль должен содержать минимум 4 символа")
    private String password;

    @NotEmpty(message = "Пользователь должен иметь хотя бы одну роль")
    private List<Long> roleIds;


    public UserCreateDTO() {
    }

    public UserCreateDTO(String username, String email, String password, List<Long> roleIds) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.roleIds = roleIds;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Long> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Long> roleIds) {
        this.roleIds = roleIds;
    }
}