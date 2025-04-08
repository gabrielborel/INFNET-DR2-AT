package org.INFNET.AT.exceptions;

public class DestinatarioInvalidoException extends RuntimeException {
    public DestinatarioInvalidoException() {
        super("Destinatario não pode ser vazio");
    }
}
