package Collections.Set;

import java.util.*;

public class ExemploSet {
  public static void main(String[] args) {
    // Dada uma lista com 7 notas de alunos [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
 
    // 1 - Crie uma lista e adicione as sete notas
    System.out.println("1 - Crie uma lista e adicione as sete notas");

    Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
    System.out.println(notas);

    System.out.println(" ");

    // 2 - Confira se a nota 5.0 está na lista
    System.out.println("2 - Confira se a nota 5.0 está na lista");

    System.out.println(notas.contains(5d));

    System.out.println(" ");
    // 3 - Exiba a menor nota
    System.out.println("3 - Exiba a menor nota");

    System.out.println(Collections.min(notas));

    System.out.println(" ");
    // 4 - Exiba a maior nota
    System.out.println("4 - Exiba a maior nota");

    System.out.println(Collections.max(notas));

    System.out.println(" ");
    // 5 - Exiba a soma das notas
    System.out.println("5 - Exiba a soma das notas");

    Iterator<Double> iterator = notas.iterator();
    Double soma = 0d;
    while(iterator.hasNext()) {
      Double next = iterator.next();
      soma += next;
    }
    System.out.println(soma);

    System.out.println(" ");
    // 6 - Exiba a média das notas
    System.out.println("6 - Exiba a média das notas");

    System.out.println(soma / notas.size());

    System.out.println(" ");
    // 7 - Remova a nota 0
    System.out.println("7 - Remova a nota 0");

    notas.remove(0d);
    System.out.println(notas);

    System.out.println(" ");
    // 8 - Remova as notas menores que 7 e exiba a lista
    System.out.println("8 - Remova as notas menores que 7 e exiba a lista");

    Iterator<Double> iterator2 = notas.iterator();
    while(iterator2.hasNext()) {
      Double next = iterator2.next();
      if (next < 7d) iterator2.remove();
    }
    System.out.println(notas);

    System.out.println(" ");
    // 9 - Exiba todas as notas na ordem em que foram informadas
    System.out.println("9 - Exiba todas as notas na ordem em que foram informadas");

    Set<Double> notas2 = new LinkedHashSet<>();
    notas2.add(7d);
    notas2.add(8.5);
    notas2.add(9.3);
    notas2.add(5d);
    notas2.add(7d); // Remove o duplicado
    notas2.add(0d);
    notas2.add(3.6d);
    System.out.println(notas2);

    System.out.println(" ");
    // 10 - Exiba todas as notas na ordem crescente
    System.out.println("10 - Exiba todas as notas na ordem crescente");

    Set<Double> notas3 = new TreeSet<>(notas2);
    System.out.println(notas3);

    System.out.println(" ");
    // 11 - Apague toda a lista
    System.out.println("11 - Apague toda a lista");

    notas.clear();
    System.out.println(notas);

    System.out.println(" ");
    // 12 - Confira se a lista está vazia
    System.out.println("12 - Confira se a lista está vazia");

    System.out.println(notas.isEmpty());

    System.out.println(" ");
  }
}
