package edu.guille.JavaBeans;

public class JavaBeans {
  // Umas das maiores dificuldades na programação é escrever algoritmos legíveis, a níveis que sejam compreendidos por todo seu time ou por você mesmo no futuro. Para isso, a linguagem Java sugere através de convenções, uma escrita universal, para nossas classes, atributos, métodos e pacotes.

  // Variáveis:
  // Clara, sem abreviações ou definição sem sentido
  // Sempre no sigular, exceto quando se referir a uma array ou coleção
  // Definir idioma único para as variáveis

  // Recomendado:
  double averageSalary = 1500.23;
  String email = "aluno@escola.com";
  String [] emails = {"aluno1@escola.com", "aluno@escola.com"};
  String myName = "Guilherme";

  // Métodos
  // Verbos, mistura de letras maiúsculas e minúsculas de camelCase
  // Método com finalidade única

  // Recomendado
  void sum (int n1, int n2) {}
  void finishiProcessing () {}
  void findById (int id) {}
  void print (String text) {}

  // Lembrando que o void é apenas para afirmar que não retorna valor


}
