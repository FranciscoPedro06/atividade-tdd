package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    // Lista responsável por armazenar os valores dos itens adicionados ao carrinho
    private List<Double> itens = new ArrayList<>();

    // Adiciona um novo item ao carrinho
    public void adicionarItem(double valor) {
        itens.add(valor);
    }

    // Remove um item do carrinho
    public void removerItem(double valor) {
        itens.remove(valor);
    }

    // Retorna a quantidade de itens atualmente no carrinho
    public int quantidadeItens() {
        return itens.size();
    }

    // Calcula o valor total dos itens adicionados
    public double calcularTotal() {

        double total = 0;

        // Percorre todos os itens e soma seus valores
        for (double item : itens) {
            total += item;
        }

        return total;
    }
}