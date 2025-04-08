package org.INFNET.AT.etiquetas;

import org.INFNET.AT.entregas.Entrega;
import org.INFNET.AT.fretes.CalculadoraFrete;

import java.util.Objects;

public class EtiquetaService {
    private final CalculadoraFrete calculadora;
    private final EtiquetaFormatter formatter;

    public EtiquetaService(CalculadoraFrete calculadora, EtiquetaFormatter formatter) {
        this.calculadora = Objects.requireNonNull(calculadora, "Calculadora não pode ser nula");
        this.formatter = Objects.requireNonNull(formatter, "Formatter não pode ser nulo");
    }

    public String gerarEtiqueta(Entrega entrega) {
        validarEntrega(entrega);
        double frete = calculadora.calcularFrete(entrega);
        return formatter.formatarEtiqueta(entrega, frete);

    }

    public String gerarResumo(Entrega entrega) {
        validarEntrega(entrega);
        double frete = calculadora.calcularFrete(entrega);
        return formatter.formatarResumo(entrega, frete);

    }

    private void validarEntrega(Entrega entrega) {
        if (entrega == null) throw new IllegalArgumentException("Entrega inválida");
    }
}
