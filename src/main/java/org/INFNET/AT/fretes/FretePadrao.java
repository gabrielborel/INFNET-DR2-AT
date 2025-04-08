package org.INFNET.AT.fretes;

import org.INFNET.AT.entregas.Entrega;

public class FretePadrao implements CalculadoraFrete {
    private static final double TARIFA_POR_KG = 1.2;

    @Override
    public double calcularFrete(Entrega entrega) {
        return entrega.getPeso() * TARIFA_POR_KG;
    }
}

