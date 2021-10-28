package br.edu.unifil.lpoo.universidade.modelo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsaArray {

    private final Scanner teclado;

    public UsaArray() {
        teclado = new Scanner(System.in);
    }

    public void carregaArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Digite o numero: ");
            try {
                arr[i] = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Numero Inteiro");
                teclado.nextLine();
            }
        }
    }

    public String mostraArray(int[] arr) {
        String saida = "";
        for (int i = 0; i < arr.length; i++) {
            saida = saida + arr[i] + '\n';
        }
        return saida;
    }

    public int[] geraArrayDivisao(int[] arrA, int[] arrB) {
        int[] aux = new int[arrA.length];
        try {
            for (int i = 0; i < arrA.length; i++) {
                aux[i] = arrA[i] / arrB[i];
            }
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero");
            teclado.nextLine();
        }
        return aux;
    }

    public void atualizaArray(int[] arr, int posicao, int novoValor) throws ArrayIndexOutOfBoundsException {
        if (posicao > arr.length || posicao < 0) {
            throw new ArrayIndexOutOfBoundsException("Sem alcance");
        } else {
            arr[posicao] = novoValor;
        }
    }

}