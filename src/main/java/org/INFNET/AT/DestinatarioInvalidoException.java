package org.INFNET.AT;

public class DestinatarioInvalidoException extends Exception {
    public DestinatarioInvalidoException() {
        super("Destinatario não pode ser vazio");
    }
}
