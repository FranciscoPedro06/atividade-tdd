# Testes de Software com TDD em Java

> **Nota:** Este projeto é uma atividade prática desenvolvida para a disciplina de **Testes de Sistemas** do **SENAI**, ministrada pelo professor **Yanes Costa**.

Este projeto tem como objetivo praticar a metodologia **Test-Driven Development (TDD)** utilizando **Java**, com testes automatizados escritos com **JUnit** e gerenciamento do projeto com **Maven**.

A proposta da atividade é desenvolver primeiro os testes e, em seguida, implementar o código necessário para que esses testes passem. Dessa forma, os testes orientam o desenvolvimento e garantem que as funcionalidades estejam funcionando corretamente.

## Funcionalidades

O projeto contém testes para diferentes cenários organizados em quatro grupos principais:

* Operações matemáticas básicas: soma, subtração, multiplicação e divisão.
* Validação de login com diferentes cenários de entrada.
* Regras de negócio, como cálculo de média de alunos e verificação de aprovação.
* Simulação de um carrinho de compras com operações de adicionar, remover itens e calcular o total.

## Estrutura do Projeto

O código foi dividido em classes responsáveis pela lógica do sistema e classes responsáveis pelos testes.

* `Calculadora.java`: contém a lógica das operações matemáticas básicas.
* `AuthService.java`: responsável pela validação de login.
* `AlunoService.java`: realiza cálculo de média e verifica aprovação do aluno.
* `DescontoService.java`: calcula descontos aplicados a valores.
* `Carrinho.java`: representa um carrinho de compras simples.

Classes de testes:

* `CalculadoraTest.java`: testa as operações matemáticas.
* `AuthServiceTest.java`: testa diferentes cenários de login.
* `AlunoServiceTest.java`: testa cálculo de média e situação do aluno.
* `DescontoServiceTest.java`: testa regras de desconto.
* `CarrinhoTest.java`: testa operações do carrinho de compras.

## Como Executar

O projeto utiliza **Maven** para compilar o código e executar os testes automatizados.

Abra o terminal na pasta do projeto e execute o comando:

```bash
mvn test
```

Esse comando compila o projeto e executa todos os testes definidos nas classes de teste.

## Autor

Desenvolvido por **Francisco Pedro**.
