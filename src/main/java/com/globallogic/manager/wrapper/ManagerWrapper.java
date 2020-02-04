package com.globallogic.manager.wrapper;

import com.globallogic.manager.model.User;
import com.globallogic.manager.model.UserResponse;
import com.globallogic.manager.repository.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ManagerWrapper {
    private static final Logger LOGGER = LoggerFactory.getLogger(ManagerWrapper.class);

    public static UserEntity convertUserToUserEntity(User user){
        LOGGER.info("Init convertUserToUserEntity ::::::");
        UserEntity userEntity = null;
        if(user != null){
            userEntity = new UserEntity();
            userEntity.setName(user.getName());
            userEntity.setEmail(user.getEmail());
            userEntity.setPassword(user.getPassword());
        }
        LOGGER.info("End convertUserToUserEntity ::::::");
        return userEntity;
    }

    public static UserResponse convertUserEntityToUser(UserEntity userEntity) {
        LOGGER.info("Init convertUserEntityToUser ::::::");
        UserResponse userResponse = new UserResponse();
        userResponse.setName(userEntity.getName());
        userResponse.setEmail(userEntity.getEmail());
        userResponse.setPassword(userEntity.getPassword());
        userResponse.setIdUser(userEntity.getIdUser().toString());
        userResponse.setCreated(userEntity.getCreated());
        userResponse.setModified(userEntity.getModified());
        userResponse.setLastLogin(userEntity.getLastLogin());
        userResponse.setToken(userEntity.getToken());
        userResponse.setActive(userEntity.getActive());
        LOGGER.info("End convertUserEntityToUser ::::::");
        return userResponse;
    }
}
