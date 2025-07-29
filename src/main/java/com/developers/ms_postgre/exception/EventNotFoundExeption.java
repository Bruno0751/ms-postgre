package com.developers.ms_postgre.exception;

public class EventNotFoundExeption extends RuntimeException {

    public EventNotFoundExeption() {
        super("EventNotFoundExeption");
    }

    public EventNotFoundExeption(String menssage) {
        super(menssage);
    }

}
