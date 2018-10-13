package com.design.patterns.um.pattern.state.service;

public class Finalizado implements EstadoOrcamento {

    private final String errorMessage = "Operação não permitida!";

    @Override
    public void aplicaDesconto(Orcamento orcamento) {
        throw new RuntimeException(errorMessage);
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
        throw new RuntimeException("Estado atual");
    }
}
