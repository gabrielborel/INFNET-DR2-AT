package org.INFNET.AT;

public class TipoFreteInvalidoException extends NullPointerException {
    public TipoFreteInvalidoException() {
        super("Tipo de frete não pode ser nulo");
    }
}
