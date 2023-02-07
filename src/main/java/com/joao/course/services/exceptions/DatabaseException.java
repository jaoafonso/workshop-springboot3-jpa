package com.joao.course.services.exceptions;

import java.io.Serial;

public class DatabaseException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -4674057629628237938L;

    public DatabaseException(String msg) {
        super(msg);
    }
}
