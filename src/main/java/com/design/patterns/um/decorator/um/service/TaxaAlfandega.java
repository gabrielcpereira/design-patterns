package com.design.patterns.um.decorator.um.service;

import com.design.patterns.um.model.Orcamento;

public class TaxaAlfandega extends Imposto {

    public TaxaAlfandega() {
    }

    public TaxaAlfandega(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return (orcamento.getTotalOrcamento() * 0.20) + calculaOutroImposto(orcamento);
    }
}
