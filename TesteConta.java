package br.edu.unifil.lpoo.universidade.modelo;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta(0, 0);

        try {
            conta.saca(10);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        Conta conta2 = new Conta(15, 15);
        try {
            conta.setNumero(2000);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        Conta conta3 = new Conta(500, 200);
        try {
            conta3.deposito(-3);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}