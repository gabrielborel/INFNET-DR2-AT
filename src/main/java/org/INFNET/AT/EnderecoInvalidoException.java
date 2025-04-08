package org.INFNET.AT;

public class EnderecoInvalidoException extends Exception {
    public EnderecoInvalidoException() {
        super("Endereço não pode ser vazio");
    }
}
