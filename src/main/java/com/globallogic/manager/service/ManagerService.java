package com.globallogic.manager.service;

import com.globallogic.manager.model.User;
import com.globallogic.manager.model.UserResponse;

import java.util.List;

public interface ManagerService {
    UserResponse saveUser(User user);

    UserResponse updateUser(String idUser, User user);

    UserResponse getUserByEmail(String email);

    UserResponse getUserById(String idUser);

    void removeUser(String idUser);

    List<UserResponse> getAllUsers();
}
