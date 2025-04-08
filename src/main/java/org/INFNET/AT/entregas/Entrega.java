package org.INFNET.AT.entregas;

import org.INFNET.AT.exceptions.DestinatarioInvalidoException;
import org.INFNET.AT.exceptions.EnderecoInvalidoException;
import org.INFNET.AT.exceptions.PesoInvalidoException;

public class Entrega {
    private final String endereco;
    private final double peso;
    private final String destinatario;

    public Entrega(String endereco, double peso, String destinatario) {
        if (endereco == null || endereco.isEmpty()) throw new EnderecoInvalidoException();
        if (peso <= 0) throw new PesoInvalidoException();
        if (destinatario == null || destinatario.isEmpty()) throw new DestinatarioInvalidoException();

        this.endereco = endereco;
        this.peso = peso;
        this.destinatario = destinatario;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getPeso() {
        return peso;
    }

    public String getDestinatario() {
        return destinatario;
    }

    @Override
    public String toString() {
        return "Entrega{" +
                "endereco='" + endereco + '\'' +
                ", peso=" + peso +
                ", destinatario='" + destinatario + '\'' +
                '}';
    }
}
