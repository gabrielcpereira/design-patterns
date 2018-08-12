package com.design.patterns.um.templatemethod.dois.model;

public class Conta {

    private Pessoa titular;
    private Banco banco;
    private int numeroConta;
    private double saldo;

    public Conta(Pessoa titular, Banco banco, int numeroConta, double saldo) {
        this.titular = titular;
        this.banco = banco;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
