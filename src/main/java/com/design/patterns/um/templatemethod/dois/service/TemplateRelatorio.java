package com.design.patterns.um.templatemethod.dois.service;

import com.design.patterns.um.templatemethod.dois.model.Conta;

public abstract class TemplateRelatorio implements Relatorio {

    @Override
    public final void imprime(Conta conta) {
        System.out.println("---------------------------------Cabecalho---------------------------------");
        this.imprimeCabecalho(conta);
        System.out.println("-----------------------------------Corpo-----------------------------------");
        this.imprimeCorpo(conta);
        System.out.println("-----------------------------------Rodape----------------------------------");
        this.imprimeRodape(conta);
    }

    protected abstract void imprimeCabecalho(Conta conta);
    protected abstract void imprimeCorpo(Conta conta);
    protected abstract void imprimeRodape(Conta conta);
}
