package com.design.patterns.um.decorator.um.service;

import com.design.patterns.um.model.Orcamento;

public abstract class Imposto {

    protected Imposto outroImposto;

    public Imposto() {
    }

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public abstract double calcula(Orcamento orcamento);

    public final double calculaOutroImposto(Orcamento orcamento){
        return this.outroImposto == null ? 0.0 : this.outroImposto.calcula(orcamento);
    }
}
