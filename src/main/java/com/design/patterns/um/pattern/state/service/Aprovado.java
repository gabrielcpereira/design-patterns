package com.design.patterns.um.pattern.state.service;

public class Aprovado implements EstadoOrcamento {

    private final String errorMessage = "Operação não permitida!";

    private boolean descontoAplicado = false;

    @Override
    public void aplicaDesconto(Orcamento orcamento) {
        if (this.descontoAplicado){
            throw new RuntimeException(errorMessage);
        }

        orcamento.valor = orcamento.valor - (orcamento.valor * 0.02);
        this.descontoAplicado = true;
    }

    @Override
    public void aprovado(Orcamento orcamento) {
        throw new RuntimeException(errorMessage);
    }

    @Override
    public void reprovado(Orcamento orcamento) {
        throw new RuntimeException(errorMessage);
    }

    @Override
    public void finalizado(Orcamento orcamento) {
        orcamento.estadoOrcamento = new Finalizado();
    }
}
