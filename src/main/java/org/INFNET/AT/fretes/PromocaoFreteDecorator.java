package org.INFNET.AT.fretes;

public abstract class PromocaoFreteDecorator implements CalculadoraFrete {
    protected final CalculadoraFrete calculadoraBase;

    public PromocaoFreteDecorator(CalculadoraFrete calculadoraBase) {
        this.calculadoraBase = calculadoraBase;
    }
}