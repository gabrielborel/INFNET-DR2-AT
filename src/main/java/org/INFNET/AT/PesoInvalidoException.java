package org.INFNET.AT;

public class PesoInvalidoException extends Exception {
    public PesoInvalidoException() {
        super("Peso deve ser maior que zero");
    }
}
