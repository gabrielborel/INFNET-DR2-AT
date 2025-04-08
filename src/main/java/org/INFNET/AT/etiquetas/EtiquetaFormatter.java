package org.INFNET.AT.etiquetas;

import org.INFNET.AT.entregas.Entrega;

public interface EtiquetaFormatter {
    String formatarEtiqueta(Entrega entrega, double frete);
    String formatarResumo(Entrega entrega, double frete);
}