package com.design.patterns.um;

import com.design.patterns.um.model.Orcamento;
import com.design.patterns.um.service.IcccService;
import com.design.patterns.um.service.IcmsService;
import com.design.patterns.um.service.ImpostoService;
import com.design.patterns.um.service.IssService;

public class Application {
    public static void main(String[] args){
        Orcamento orcamento = new Orcamento(3001);

        calculaImposto(new IcmsService(), orcamento);
        calculaImposto(new IssService(), orcamento);
        calculaImposto(new IcccService(), orcamento);
    }

    private static void calculaImposto(ImpostoService imposto, Orcamento orcamento){
        System.out.println(imposto.getNomeImposto() + " : " + imposto.calculaImposto(orcamento));
    }
}
