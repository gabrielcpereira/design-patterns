package com.design.patterns.um.state.service;

public interface EstadoOrcamento {

    void aplicaDesconto(Orcamento orcamento);
    void aprovado(Orcamento orcamento);
    void reprovado(Orcamento orcamento);
    void finalizado(Orcamento orcamento);
}
