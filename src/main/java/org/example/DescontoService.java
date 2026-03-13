package org.example;

public class DescontoService {

    // Aplica um desconto padrão de 10% sobre o valor informado
    public double calcularDesconto(double valor) {
        return valor * 0.9;
    }

    // Aplica um desconto especial para clientes VIP (20%)
    public double descontoVIP(double valor) {
        return valor * 0.8;
    }
}