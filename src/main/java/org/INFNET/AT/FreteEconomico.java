package org.INFNET.AT;

public class FreteEconomico implements CalculadoraFrete {
    private static final double TARIFA_POR_KG = 1.1;
    private static final double DESCONTO_FIXO = 5;

    @Override
    public double calcularFrete(Entrega entrega) {
        double valor = entrega.getPeso() * TARIFA_POR_KG - DESCONTO_FIXO;
        boolean aplicarFreteGratis = valor < 0;
        return aplicarFreteGratis ? 0 : valor;
    }
}

