package com.design.patterns.um.dois.service;

import com.design.patterns.um.dois.model.ContaBancaria;

import java.util.Random;

public class ConservadorService implements InvestimentoService {

    private final double retornoUm = 0.008;

    @Override
    public double calcularRendimento(ContaBancaria contaBancaria) {
        return retornoUm * contaBancaria.getSaldo();
    }
}
