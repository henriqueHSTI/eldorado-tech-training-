package com.eldorado.calculo.exceptions;

import java.io.Serial;

public class WrongHeightException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    public WrongHeightException(String message) {
        super(message);
    }
}
