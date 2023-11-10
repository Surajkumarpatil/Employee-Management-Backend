package com.infy.employee.Exception;

public class AlreadyExistsException extends RuntimeException {
    private String message;

    public AlreadyExistsException(String message) {
        super(message);
        this.message=message;
    }
}
