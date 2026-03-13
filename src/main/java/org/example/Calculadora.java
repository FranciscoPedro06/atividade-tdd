package org.example;

public class Calculadora {

    // Método responsável por somar dois números
    public int somar(int a, int b) {
        return a + b;
    }

    // Método responsável por subtrair dois números
    public int subtrair(int a, int b) {
        return a - b;
    }

    // Método responsável por multiplicar dois números
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método responsável por dividir dois números
    // Caso o divisor seja zero, uma exceção é lançada
    public int dividir(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida");
        }

        return a / b;
    }
}