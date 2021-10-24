package com.zahid.exception;

public class ThrowException {
    public void throwException(String username) throws NullReferenceException {
        if(username == null) {
            throw new NullReferenceException("String reference is not initialized & it points to null.");
        }
    }
}
