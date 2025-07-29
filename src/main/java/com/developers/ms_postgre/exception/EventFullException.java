package com.developers.ms_postgre.exception;

public class EventFullException extends RuntimeException {

    public EventFullException() {
        super("EventFullException");
    }

    public EventFullException(String menssage) {
        super(menssage);
    }

}
