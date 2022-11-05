// Sintaxe de declaração de nova classe
public class Variaveis {
  // Código aqui
  // Se for executável, método main
  // Void significa não voltar nada
  public static void main (String [] args) {
    // Corpo do método, só existirão dentro desse corpo
    final String BR = "Brasil"; // Significa que é constante, pra garantir isso adicionamos um final na sintaxe
    int ano = 2021; // Esse ano pode ser alterado
    ano = 2022; // Alteração da variável

    double PI = 3.14;

    int ESTADOS_BRASILEIROS = 27; // Convenção UPPER_CASE, separando palavras por _

    // Variáveis podem ter caracteres, números e símbolos, mas sempre observar as regras de linguagem
    // letras [a-z, A-Z], números [0-9] e símbolos [_ ou $]
    // Sem espaços e não usar palavras-chaves da línguagem e o nome deve ser único dentro de um escopo

    // Estrutura de variáveis:
    // Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)

    // Exemplos:
    // int idade = 23;
    // double altura = 1.62; - float
    // Dog spike; - ainda sem valor

    String meuNome = "Guilherme";
    int anoDeFabricacao = 2022;
    boolean temaEscuro = true;

    // Reatribuição de variáveis:
    anoDeFabricacao = 2018;
    temaEscuro = false;
    meuNome = "Guilherme Pinho";

    System.out.print("olá, bem-vindo"); // Classe do sistema, out - fora, print - de printar, e a string como parâmetro
  }
};