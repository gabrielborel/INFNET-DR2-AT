package org.INFNET.AT;

public class FretePadrao implements CalculadoraFrete {
    private static final double TARIFA_POR_KG = 1.2;

    @Override
    public double calcularFrete(Entrega entrega) {
        return entrega.getPeso() * TARIFA_POR_KG;
    }
}

