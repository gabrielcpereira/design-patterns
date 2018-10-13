package com.design.patterns.um.pattern.decorator.um;

import com.design.patterns.um.pattern.decorator.um.service.Icms;
import com.design.patterns.um.pattern.decorator.um.service.Imposto;
import com.design.patterns.um.pattern.decorator.um.service.Iss;
import com.design.patterns.um.pattern.decorator.um.service.TaxaAlfandega;
import com.design.patterns.um.model.Item;
import com.design.patterns.um.model.Orcamento;

public class TesteDecorator {

    public static void main(String[] args){
        Orcamento orcamento = new Orcamento();
        orcamento.adicionaItem(new Item("Papel", 1.0));
        orcamento.adicionaItem(new Item("Caderno", 15.0));
        orcamento.adicionaItem(new Item("Borracha", 20.0));

        System.out.println("Total orcamento: " + orcamento.getTotalOrcamento());

        Imposto iss = new Iss();
        System.out.println("Calculo do Iss: " + iss.calcula(orcamento));

        Imposto issDecorado = new Iss(new Icms());
        System.out.println("Calculo do Iss: " + issDecorado.calcula(orcamento));

        Imposto taxaAlfandegaComposto = new TaxaAlfandega(new Iss());
        System.out.println("Calculo da Tx Alfandega: " + taxaAlfandegaComposto.calcula(orcamento));
    }
}
