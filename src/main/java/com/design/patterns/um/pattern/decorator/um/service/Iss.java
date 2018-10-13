package com.design.patterns.um.pattern.decorator.um.service;

import com.design.patterns.um.model.Orcamento;

public class Iss extends Imposto {

    public Iss() {
        super();
    }

    public Iss(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return (orcamento.getTotalOrcamento() * 0.05) + calculaOutroImposto(orcamento);
    }
}
