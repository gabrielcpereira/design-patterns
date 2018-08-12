package com.design.patterns.um.decorator.dois.service;

import com.design.patterns.um.decorator.dois.model.Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class Filtro {

    protected Filtro ouProximoFiltro;

    public Filtro(){

    }

    public Filtro(Filtro ouOutroFiltro) {
        this.ouProximoFiltro = ouOutroFiltro;
    }

    public abstract List<Conta> filtrar(List<Conta> contas);

    protected final List<Conta> aplicarOutroFiltro(List<Conta> contas){
        if (Optional.ofNullable(this.ouProximoFiltro).isPresent())
            return this.ouProximoFiltro.filtrar(contas);
        else
            return new ArrayList<>();
    }

    protected final List<Conta> mergeContas(List<Conta> contas, List<Conta> contasOutroFiltro){
        contas.removeAll(contasOutroFiltro);
        contas.addAll(contasOutroFiltro);
        return contas;
    }
}
