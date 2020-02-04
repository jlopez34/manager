package com.globallogic.manager.service.impl;

import com.globallogic.manager.model.User;
import com.globallogic.manager.model.UserResponse;
import com.globallogic.manager.repository.ManagerRepository;
import com.globallogic.manager.repository.entity.UserEntity;
import com.globallogic.manager.service.ManagerService;
import com.globallogic.manager.wrapper.ManagerWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ManagerServiceImpl.class);

    @Autowired
    private ManagerRepository repository;

    @Override
    public UserResponse saveUser(User user) {
        LOGGER.info("Consuming saveUser:::ManagerServiceImpl");
        UserResponse userResponse = null;
        try {
            UserEntity userEntity = repository.findByEmail(user.getEmail());
            if(userEntity == null){
                 userEntity = ManagerWrapper.convertUserToUserEntity(user);
                 repository.save(userEntity);
                userResponse = ManagerWrapper.convertUserEntityToUser(userEntity);
            }else{
                LOGGER.info("Email inserted have been associated with some user previously");
            }
        }catch (Exception exp){

        }
        return userResponse;
    }

    @Override
    public UserResponse updateUser(String idUser, User user) {
        //TODO
        return null;
    }

    @Override
    public UserResponse getUserByEmail(String email) {
        UserResponse userResponse = null;
        try {
            UserEntity userEntity = repository.findByEmail(email);
            if (userEntity != null) {
                LOGGER.info("Email inserted have been associated with some user previously");
                userResponse = ManagerWrapper.convertUserEntityToUser(userEntity);
            }
        }catch (Exception exp){

        }
        return userResponse;
    }

    @Override
    public UserResponse getUserById(String idUser) {
        //TODO
        return null;
    }

    @Override
    public void removeUser(String idUser) {
        //TODO
    }

    @Override
    public List<UserResponse> getAllUsers() {
        //TODO
        return null;
    }
}
