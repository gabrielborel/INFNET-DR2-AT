package org.INFNET.AT;

public class Entrega {
    private final String endereco;
    private final double peso;
    private final String destinatario;

    public Entrega(String endereco, double peso, String destinatario) {
        if (endereco == null || endereco.isEmpty()) {
            throw new IllegalArgumentException("Endereço não pode ser vazio");
        }
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser maior que zero");
        }
        if (destinatario == null || destinatario.isEmpty()) {
            throw new IllegalArgumentException("Destinatário não pode ser vazio");
        }

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
