package com.design.patterns.um.service;

import com.design.patterns.um.model.Orcamento;

public interface ImpostoService {

    double calculaImposto(Orcamento orcamento);

    String getNomeImposto();
}
