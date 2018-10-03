package com.design.patterns.um.state.service;

public class EmAprovacao implements EstadoOrcamento {

    private final String errorMessage = "Operação não permitida!";

    private boolean descontoAplicado = false;

    @Override
    public void aplicaDesconto(Orcamento orcamento) {
        if (this.descontoAplicado){
            throw new RuntimeException(errorMessage);
        }

        orcamento.valor = orcamento.valor - (orcamento.valor * 0.05);
        this.descontoAplicado = true;
    }

    @Override
    public void aprovado(Orcamento orcamento) {
        orcamento.estadoOrcamento = new Aprovado();
    }

    @Override
    public void reprovado(Orcamento orcamento) {
        orcamento.estadoOrcamento = new Reprovado();
    }

    @Override
    public void finalizado(Orcamento orcamento) {
        throw new RuntimeException(errorMessage);
    }
}
