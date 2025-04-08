package org.INFNET.AT.fretes;

import org.INFNET.AT.entregas.Entrega;

public class PromocaoFrete extends PromocaoFreteDecorator {
    public PromocaoFrete(CalculadoraFrete calculadoraBase) {
        super(calculadoraBase);
    }

    @Override
    public double calcularFrete(Entrega entrega) {
        double valorFrete = calculadoraBase.calcularFrete(entrega);
        if (valorFrete >= 100.0) valorFrete -= 10.0;
        return valorFrete;
    }
}
