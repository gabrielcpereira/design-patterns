package com.design.patterns.um.pattern.decorator.dois;

import com.design.patterns.um.pattern.decorator.dois.model.Conta;
import com.design.patterns.um.pattern.decorator.dois.service.Filtro;
import com.design.patterns.um.pattern.decorator.dois.service.FiltroDataAberturaMesCorrente;
import com.design.patterns.um.pattern.decorator.dois.service.FiltroSaldoMaiorQueQuinhentosMil;
import com.design.patterns.um.pattern.decorator.dois.service.FiltroSaldoMenorQueCem;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class TesteDecoratorDois {

    public static void main(String[] args){
        //TODO pode vir em dois filtros
        Conta contaUm = new Conta(1, "Teste 1", 99.0, LocalDateTime.now());

        //TODO pode vir em somente um filtro
        Conta contaDois = new Conta(2, "Teste 2", 99.0, LocalDateTime.now().minusMonths(1));

        //TODO pode vir em somente um filtro
        Conta contaTres = new Conta(3, "Teste 3", 500000.0, LocalDateTime.now().minusMonths(1));

        //TODO pode vir em dois filtros
        Conta contaQuatro = new Conta(4, "Teste 4", 500001.0, LocalDateTime.now());

        List<Conta> contas = Arrays.asList(contaUm, contaDois, contaTres, contaQuatro);

        System.out.println("filtro um");
        Filtro filtroUm = new FiltroDataAberturaMesCorrente(new FiltroSaldoMenorQueCem());
        filtroUm.filtrar(contas).forEach(conta -> {
            System.out.println(conta.getTitular());
        });

        System.out.println("filtro dois");
        Filtro filtroDois = new FiltroSaldoMenorQueCem(new FiltroSaldoMaiorQueQuinhentosMil());
        filtroDois.filtrar(contas).forEach(conta -> {
            System.out.println(conta.getTitular());
        });
    }
}
