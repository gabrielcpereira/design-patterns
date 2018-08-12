package com.design.patterns.um.templatemethod.dois;

import com.design.patterns.um.templatemethod.dois.model.Banco;
import com.design.patterns.um.templatemethod.dois.model.Conta;
import com.design.patterns.um.templatemethod.dois.model.Pessoa;
import com.design.patterns.um.templatemethod.dois.service.Relatorio;
import com.design.patterns.um.templatemethod.dois.service.RelatorioComplexo;
import com.design.patterns.um.templatemethod.dois.service.RelatorioSimples;

public class TemplateMethodMainDois {

    public static void main(String[] args) {
        Banco banco = new Banco("Bradesco", 664);

        Pessoa pessoaUm = new Pessoa("Pessoal um", "Endereco um", "pessoaum@email.com",
                "019-98125-8334");
        Conta contaUm = new Conta(pessoaUm, banco, 12345, 1523.10);

        System.out.println("===========================Relatorio Complexo===========================");
        Relatorio relatorioComplexo = new RelatorioComplexo();
        relatorioComplexo.imprime(contaUm);
        System.out.println("========================================================================");

        System.out.println("===========================Relatorio Simples===========================");
        Relatorio relatorioSimples = new RelatorioSimples();
        relatorioSimples.imprime(contaUm);
        System.out.println("=======================================================================");
    }
}
