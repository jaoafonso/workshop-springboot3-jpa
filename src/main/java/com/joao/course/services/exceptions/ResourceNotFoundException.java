package com.joao.course.services.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -3821059086587488245L;

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}
