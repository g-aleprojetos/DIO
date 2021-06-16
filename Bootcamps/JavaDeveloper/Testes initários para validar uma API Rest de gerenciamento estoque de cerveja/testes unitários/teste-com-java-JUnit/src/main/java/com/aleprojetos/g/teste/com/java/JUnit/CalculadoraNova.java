package com.aleprojetos.g.teste.com.java.JUnit;

public class CalculadoraNova {

    public int somar(int ...valores) {
        int soma = 0;
        for (int valor : valores) {
            soma += valor;
        }
        return soma;
    }
}
