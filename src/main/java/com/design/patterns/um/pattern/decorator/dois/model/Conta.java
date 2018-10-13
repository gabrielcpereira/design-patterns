package com.design.patterns.um.pattern.decorator.dois.model;

import java.time.LocalDateTime;

public class Conta {

    private int numero;
    private String titular;
    private double saldo;
    private LocalDateTime abertura;

    public Conta() {
    }

    public Conta(int numero, String titular, double saldo, LocalDateTime abertura) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.abertura = abertura;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDateTime getAbertura() {
        return abertura;
    }

    public void setAbertura(LocalDateTime abertura) {
        this.abertura = abertura;
    }
}
