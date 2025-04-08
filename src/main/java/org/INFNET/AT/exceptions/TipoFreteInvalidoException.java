package org.INFNET.AT.exceptions;

public class TipoFreteInvalidoException extends RuntimeException {
    public TipoFreteInvalidoException() {
        super("Tipo de frete não pode ser nulo");
    }
}
