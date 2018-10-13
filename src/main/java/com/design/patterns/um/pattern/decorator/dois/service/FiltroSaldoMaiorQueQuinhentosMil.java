package com.design.patterns.um.pattern.decorator.dois.service;

import com.design.patterns.um.pattern.decorator.dois.model.Conta;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroSaldoMaiorQueQuinhentosMil extends Filtro {

    public FiltroSaldoMaiorQueQuinhentosMil() {
        super();
    }

    public FiltroSaldoMaiorQueQuinhentosMil(Filtro ouOutroFiltro) {
        super(ouOutroFiltro);
    }

    @Override
    public List<Conta> filtrar(List<Conta> contas) {
        List<Conta> contasFiltradas = contas.stream()
                .filter(conta -> conta.getSaldo() > 500000.0)
                .collect(Collectors.toList());

        List<Conta> contasOutroFiltroAplicado = aplicarOutroFiltro(contas);

        return mergeContas(contasFiltradas, contasOutroFiltroAplicado);
    }
}
