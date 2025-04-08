package org.INFNET.AT.exceptions;

public class EnderecoInvalidoException extends RuntimeException {
    public EnderecoInvalidoException() {
        super("Endereço não pode ser vazio");
    }
}
