package com.design.patterns.um.pattern.templatemethod.um.service;

import com.design.patterns.um.model.Orcamento;

import java.util.*;

public class ImpostoZ extends TemplateDeImpostoCondicional {

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return isExisteItemDuplicado(orcamento);
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getTotalOrcamento() * 0.13;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getTotalOrcamento() * 0.01;
    }

    private boolean isExisteItemDuplicado(Orcamento orcamento) {
        Set<String> tempSet = new HashSet();
        Set<String> duplicates = new HashSet();

        orcamento.getItens().forEach( item -> {
            if (!tempSet.add(item.getDescricao())) {
                duplicates.add(item.getDescricao());
            }
        });

        return (duplicates.size() > 0);
    }
}
