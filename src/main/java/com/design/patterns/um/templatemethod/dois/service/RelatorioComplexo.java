package com.design.patterns.um.templatemethod.dois.service;

import com.design.patterns.um.templatemethod.dois.model.Conta;

import java.time.LocalDateTime;

public class RelatorioComplexo extends TemplateRelatorio {

    @Override
    protected void imprimeCabecalho(Conta conta) {
        System.out.println(conta.getBanco().getNomeBanco());
        System.out.println(conta.getTitular().getEndereco());
        System.out.println(conta.getTitular().getTelefone());
    }

    @Override
    protected void imprimeCorpo(Conta conta) {
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getBanco().getNumeroAgencia());
        System.out.println(conta.getNumeroConta());
        System.out.println(conta.getSaldo());
    }

    @Override
    protected void imprimeRodape(Conta conta) {
        System.out.println(conta.getTitular().getEmail());
        System.out.println(LocalDateTime.now());
    }
}
