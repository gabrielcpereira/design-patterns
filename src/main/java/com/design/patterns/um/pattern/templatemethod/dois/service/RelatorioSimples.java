package com.design.patterns.um.pattern.templatemethod.dois.service;

import com.design.patterns.um.pattern.templatemethod.dois.model.Conta;

public class RelatorioSimples extends TemplateRelatorio {
    @Override
    protected void imprimeCabecalho(Conta conta) {
        System.out.println(conta.getBanco().getNomeBanco());
    }

    @Override
    protected void imprimeCorpo(Conta conta) {
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getSaldo());
    }

    @Override
    protected void imprimeRodape(Conta conta) {
        System.out.println(conta.getTitular().getTelefone());
    }
}
