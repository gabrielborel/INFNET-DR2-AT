package org.INFNET.AT;

public class EtiquetaService {
    private final CalculadoraFrete calculadoraFrete;

    public EtiquetaService(CalculadoraFrete calculadoraFrete) {
        if (calculadoraFrete == null) {
            throw new NullPointerException("Calculadora de frete não pode ser nula");
        }
        this.calculadoraFrete = calculadoraFrete;
    }

    public String gerarEtiqueta(Entrega entrega) {
        double valorFrete = calculadoraFrete.calcularFrete(entrega);
        return "Destinatário: " + entrega.getDestinatario() + "\nEndereço: " + entrega.getEndereco() + "\nValor do Frete: R$" + valorFrete;
    }

    public String gerarResumo(Entrega entrega) {
        double valorFrete = calculadoraFrete.calcularFrete(entrega);
        return "Pedido para " + entrega.getDestinatario() + " com frete no valor de R$" + valorFrete;
    }
}
