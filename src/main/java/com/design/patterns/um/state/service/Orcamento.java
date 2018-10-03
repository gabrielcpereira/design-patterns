package com.design.patterns.um.state.service;

public class Orcamento {

    protected double valor;
    protected EstadoOrcamento estadoOrcamento;

    public Orcamento(double valor) {
        this.valor = valor;
        this.estadoOrcamento = new EmAprovacao();
    }

    public double getValor() {
        return valor;
    }

    public void reprovado(){
        this.estadoOrcamento.reprovado(this);
    }

    public void aprovado(){
        this.estadoOrcamento.aprovado(this);
    }

    public void finalizado(){
        this.estadoOrcamento.finalizado(this);
    }

    public void aplicaDesconto(){
        this.estadoOrcamento.aplicaDesconto(this);
    }
}
