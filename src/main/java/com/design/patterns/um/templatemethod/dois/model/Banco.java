package com.design.patterns.um.templatemethod.dois.model;

public class Banco {

    private String nomeBanco;
    private int numeroAgencia;

    public Banco(String nomeBanco, int numeroAgencia) {
        this.nomeBanco = nomeBanco;
        this.numeroAgencia = numeroAgencia;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
}
