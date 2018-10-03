package com.design.patterns.um.state;

import com.design.patterns.um.state.service.Orcamento;

public class StateMain {

    public static void main(String[] args){
        Orcamento orcamento = new Orcamento(1000.00);
        orcamento.aplicaDesconto();
        System.out.println(orcamento.getValor());

        orcamento.aprovado();
        orcamento.aplicaDesconto();
        System.out.println(orcamento.getValor());

        orcamento.finalizado();
        System.out.println(orcamento.getValor());
    }
}
