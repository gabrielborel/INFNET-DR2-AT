package org.INFNET.AT.fretes;

import org.INFNET.AT.entregas.Entrega;

public class FreteExpresso implements CalculadoraFrete {
    private static final double TARIFA_POR_KG = 1.5;
    private static final double TAXA_FIXA = 10;

    @Override
    public double calcularFrete(Entrega entrega) {
        return entrega.getPeso() * TARIFA_POR_KG + TAXA_FIXA;
    }
}

