package com.design.patterns.um.pattern.chainofresponsibility.dois.service;

import com.design.patterns.um.pattern.chainofresponsibility.dois.model.Conta;

public interface Resposta {

    String responde(RequisicaoService req, Conta conta);
}
