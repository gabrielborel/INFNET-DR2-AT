package org.INFNET.AT.etiquetas;

import org.INFNET.AT.entregas.Entrega;

public class EtiquetaSimplesFormatter implements EtiquetaFormatter {
    @Override
    public String formatarEtiqueta(Entrega entrega, double frete) {
        return String.format(
                "Destinatário: %s\nEndereço: %s\nValor do Frete: R$%.2f",
                entrega.getDestinatario(),
                entrega.getEndereco(),
                frete
        );
    }

    @Override
    public String formatarResumo(Entrega entrega, double frete) {
        return String.format("Pedido para %s (Frete: R$%.2f)", entrega.getDestinatario(), frete);
    }
}