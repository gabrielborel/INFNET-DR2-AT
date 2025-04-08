package org.INFNET.AT.fretes;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FreteFactory {
    private final Map<String, Supplier<CalculadoraFrete>> estrategias = new HashMap<>();

    public void registrarEstrategia(String tipo, Supplier<CalculadoraFrete> supplier) {
        estrategias.put(tipo, supplier);
    }

    public CalculadoraFrete criar(String tipo) {
        if (!estrategias.containsKey(tipo)) {
            throw new IllegalArgumentException("Tipo de frete não suportado: " + tipo);
        }
        return estrategias.get(tipo).get();
    }
}
