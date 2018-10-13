package com.design.patterns.um.pattern.decorator.um.service;

import com.design.patterns.um.model.Orcamento;

public class Icms extends Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        return (orcamento.getTotalOrcamento() * 0.06) + calculaOutroImposto(orcamento);
    }
}
