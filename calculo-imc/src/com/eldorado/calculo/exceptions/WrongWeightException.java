package com.eldorado.calculo.exceptions;

import java.io.Serial;

public class WrongWeightException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    public WrongWeightException(String message) {
        super(message);
    }
}
