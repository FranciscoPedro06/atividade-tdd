package org.example;

public class AlunoService {

    // Calcula a média entre duas notas
    public double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    // Verifica se o aluno está aprovado
    // Considera aprovado quando a média é maior ou igual a 7
    public boolean estaAprovado(double media) {
        return media >= 7;
    }
}