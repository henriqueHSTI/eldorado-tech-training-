package com.eldorado.calculo.exceptions;

import java.io.Serial;

public class WrongAgeException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    public WrongAgeException(String message) {
        super(message);
    }
}
