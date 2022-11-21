package Collections.AulaUm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
  
  // Dada a seguinte informação sobre gatos, crie uma lista e ordene-a, exibindo: nome - idade - cor

  // Gato 1: Jon, 18, preto
  // Gato 2: Simba, 6, tigrado
  // Gato 3: Jon, 12, amarelo

  public static void main(String[] args) {
    List<Gato> gatos = new ArrayList<>(){{
      add(new Gato("Jon", 12, "preto"));
      add(new Gato("Simba", 6, "tigrado"));
      add(new Gato("Jon", 18, "amarelo"));
    }};

    // 1 - Ordem de Inserção
    System.out.println("1 - Ordem de Inserção");
    System.out.println(gatos);
    
    System.out.println(" ");

    // 2 - Ordem Aleatória
    System.out.println("2 - Ordem Aleatória");
    Collections.shuffle(gatos);
    System.out.println(gatos);
    
    System.out.println(" ");

    // 3 - Ordem Natural (nome)
    System.out.println("3 - Ordem Natural (nome)");
    Collections.sort(gatos);
    System.out.println(gatos);
    
    System.out.println(" ");

    // 4 - Ordem Idade
    System.out.println("4 - Ordem Idade");
    // Collections.sort(gatos, new ComparatorIdade());
    gatos.sort(new ComparatorIdade());
    System.out.println(gatos);
    
    System.out.println(" ");

    // 5 - Ordem Cor
    System.out.println("5 - Ordem Cor");
    gatos.sort(new ComparatorCor());
    System.out.println(gatos);
    
    System.out.println(" ");

    // 6 - Ordem Nome/Cor/Idade
    System.out.println("6 - Ordem Nome/Cor/Idade");
    gatos.sort(new ComparatorNomeCorIdade());
    System.out.println(gatos);
    
    System.out.println(" ");
  }

  static class Gato implements Comparable<Gato> {
    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
      this.nome = nome;
      this.idade = idade;
      this.cor = cor;
    }

    public String getNome() {
      return nome;
    }

    public int getIdade() {
      return idade;
    }

    public String getCor() {
      return cor;
    }

    @Override
    public String toString() {
      return "{" +
                  "nome='" + nome + '\'' +
                  ", idade='" + idade + '\'' +
                  ", cor='" + cor + '\'' +
                  "}";
    }

    @Override
    public int compareTo(Gato gato) {
      return this.getNome().compareToIgnoreCase(gato.getNome());
    }
  }

  static class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
      return Integer.compare(g1.getIdade(), g2.getIdade());
    }
  }

  static class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
      return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
  }

  static class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
      int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
      if (nome != 0) return nome;

      int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
      if (cor != 0) return cor;

      return Integer.compare(g1.getIdade(), g2.getIdade());
    }
  }
}
