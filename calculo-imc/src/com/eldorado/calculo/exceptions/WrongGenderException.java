package com.eldorado.calculo.exceptions;

import java.io.Serial;

public class WrongGenderException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    public WrongGenderException(String message) {
        super(message);
    }
}
