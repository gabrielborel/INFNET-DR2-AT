package org.INFNET.AT;

import org.INFNET.AT.entregas.Entrega;
import org.INFNET.AT.etiquetas.EtiquetaService;
import org.INFNET.AT.etiquetas.EtiquetaSimplesFormatter;
import org.INFNET.AT.fretes.*;

public class Main {
    public static void main(String[] args) {
        /*
            Utilização da classe FreteFactory para registro dos tipos de fretes
            Para adicionar uma nova classe, nenhum código deverá ser modificado e sim apenas adicionado
            Código referente a regra de negócio do novo tipo de frete
         */
        FreteFactory factory = new FreteFactory();
        factory.registrarEstrategia("EXP", FreteExpresso::new);
        factory.registrarEstrategia("PAD", FretePadrao::new);
        factory.registrarEstrategia("ECO", FreteEconomico::new);

        /*
            Utilização de uma promoção fictícia, alterando o funcionamento do cálculo do valor de frete
            Uma nova promoção pode ser criada e adicionada
        */
        CalculadoraFrete freteBase = factory.criar("EXP");
        CalculadoraFrete freteComPromocao = new PromocaoFrete(freteBase);
        CalculadoraFrete fretePad = factory.criar("PAD");
        CalculadoraFrete freteEco = factory.criar("ECO");

        /*
            Utilização do formatador de etiquetas na criação do service de geração de etiquetas
            Um outro formatador pode ser criado e aplicado no service, modificando a formatação etiqueta
        */
        EtiquetaService freteComPromocaoService = new EtiquetaService(
                freteComPromocao,
                new EtiquetaSimplesFormatter()
        );
        EtiquetaService fretePadService = new EtiquetaService(
                fretePad,
                new EtiquetaSimplesFormatter()
        );
        EtiquetaService freteEcoService = new EtiquetaService(
                freteEco,
                new EtiquetaSimplesFormatter()
        );

        Entrega entrega = new Entrega("Rua Exemplo, 123", 15.0, "João");
        System.out.println("Frete base com promoção: " + freteComPromocaoService.gerarEtiqueta(entrega));
        System.out.println("\nFrete PAD: " + fretePadService.gerarEtiqueta(entrega));
        System.out.println("\nFrete ECO: " + freteEcoService.gerarEtiqueta(entrega));
    }
}
