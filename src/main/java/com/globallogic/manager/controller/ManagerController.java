package com.globallogic.manager.controller;

import com.globallogic.manager.exception.UserNotFoundExpection;
import com.globallogic.manager.model.User;
import com.globallogic.manager.model.UserResponse;
import com.globallogic.manager.service.ManagerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/users")
public class ManagerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ManagerController.class);

    private final ManagerService service;

    public ManagerController(ManagerService service) {
        this.service = service;
    }


    @RequestMapping(value = "/create/", method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@Valid @RequestBody User user)
            throws URISyntaxException {
        LOGGER.info("Consuming service createUser::::" + user.toString());
        UserResponse savedUser = service.saveUser(user);

        return ResponseEntity
                .created(new URI(savedUser.toString()))
                .body(savedUser);
    }


    @RequestMapping(value = "/get-user/{id}", method = RequestMethod.GET)
    public UserResponse retriveUser(@PathVariable("id") String userId) {
        LOGGER.info("Consuming service retriveUser:::: User [" + userId + "]");
        UserResponse userResponse = service.getUserById(userId);

        Optional<UserResponse> optionalUser = Optional.ofNullable(userResponse);

        optionalUser.orElseThrow(() -> new UserNotFoundExpection(userId));

        return userResponse;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<UserResponse> retriveAllUsers() {
        LOGGER.info("Consuming service retriveAllUsers::::");

        return new ArrayList<>(service.getAllUsers());
    }

}
