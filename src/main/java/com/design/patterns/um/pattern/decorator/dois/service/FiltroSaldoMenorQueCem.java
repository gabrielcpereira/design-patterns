package com.design.patterns.um.pattern.decorator.dois.service;

import com.design.patterns.um.pattern.decorator.dois.model.Conta;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroSaldoMenorQueCem extends Filtro {

    public FiltroSaldoMenorQueCem() {
        super();
    }

    public FiltroSaldoMenorQueCem(Filtro ouOutroFiltro) {
        super(ouOutroFiltro);
    }

    @Override
    public List<Conta> filtrar(List<Conta> contas) {
        List<Conta> contasFiltradas = contas.stream()
                .filter(conta -> conta.getSaldo() < 100.0)
                .collect(Collectors.toList());

        List<Conta> contasOutroFiltroAplicado = aplicarOutroFiltro(contas);

        return mergeContas(contasFiltradas, contasOutroFiltroAplicado);
    }
}
