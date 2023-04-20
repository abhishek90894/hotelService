package com.hotelService.exception;

public class ResourceNotfoundException extends RuntimeException{

    public ResourceNotfoundException() {
        super("for this id no hotel is found");
    }

    public ResourceNotfoundException(String message) {
        super(message);
    }
}
