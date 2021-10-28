package br.edu.unifil.lpoo.universidade.modelo;

public class Conta {
    private final int numero;
    private double saldo;

    public Conta(double saldo, int numero) {
        this.saldo = saldo;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) throws IllegalArgumentException {
        if (numero < 0 || numero > 1000) {
            throw new IllegalArgumentException("Valor negativo ou acima de 1000");
        } else {
            numero = this.numero;
        }
    }

    public void deposito(double valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor negativo");
        } else {
            this.saldo += valor;
        }
    }

    public void saca(double valor) throws IllegalArgumentException {
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente!");
        } else {
            this.saldo -= valor;
        }
    }


}
