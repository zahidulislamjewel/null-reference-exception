package com.zahid;

import static org.junit.jupiter.api.Assertions.assertThrows;

import com.zahid.exception.NullReferenceException;
import com.zahid.exception.ThrowException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ThrowExceptionTest {

    public static ThrowException th;
    
    @BeforeEach
    void init() {
        th = new ThrowException();
    }

    @Test
    void testThrowException() throws NullReferenceException {
        String username = null;

        assertThrows(NullReferenceException.class, () -> th.throwException(username));
    }
}
