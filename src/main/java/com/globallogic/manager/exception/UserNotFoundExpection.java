package com.globallogic.manager.exception;

public class UserNotFoundExpection extends RuntimeException {
    public UserNotFoundExpection(String exception) {
        super(exception);
    }
}