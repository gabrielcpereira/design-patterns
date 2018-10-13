package com.design.patterns.um.pattern.decorator.dois.service;

import com.design.patterns.um.pattern.decorator.dois.model.Conta;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroDataAberturaMesCorrente extends Filtro {

    public FiltroDataAberturaMesCorrente() {
        super();
    }

    public FiltroDataAberturaMesCorrente(Filtro ouOutroFiltro) {
        super(ouOutroFiltro);
    }

    @Override
    public List<Conta> filtrar(List<Conta> contas) {
        LocalDateTime dataAtual = LocalDateTime.now();
        int diaDoMes = dataAtual.getDayOfMonth();
        LocalDateTime dataPrimeiroDiaDoMes = dataAtual.minusDays(diaDoMes);
        LocalDateTime dataUltimoDiaDoMes = dataAtual.plusDays(LocalDate.now().lengthOfMonth() - diaDoMes);

        List<Conta> contasFiltradas = contas.stream()
                .filter(conta -> conta.getAbertura().toEpochSecond(ZoneOffset.UTC) > dataPrimeiroDiaDoMes.toEpochSecond(ZoneOffset.UTC))
                .filter(conta -> conta.getAbertura().toEpochSecond(ZoneOffset.UTC) < dataUltimoDiaDoMes.toEpochSecond(ZoneOffset.UTC))
                .collect(Collectors.toList());

        List<Conta> contasOutroFiltroAplicado = aplicarOutroFiltro(contas);

        return mergeContas(contasFiltradas, contasOutroFiltroAplicado);
    }
}
