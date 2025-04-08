package org.INFNET.AT.exceptions;

public class PesoInvalidoException extends RuntimeException {
    public PesoInvalidoException() {
        super("Peso deve ser maior que zero");
    }
}
