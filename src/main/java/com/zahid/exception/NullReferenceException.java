package com.zahid.exception;

public class NullReferenceException extends NullPointerException {
    public NullReferenceException() {
        //pass
    }

    public NullReferenceException(String message) {
        super(message);
    }
}
