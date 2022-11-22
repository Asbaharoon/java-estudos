package Collections.List;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExemploList {
    public static void main(String[] args) {
      // Dada uma lista com 7 notas de alunos [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
      // 1 - Crie uma lista e adicione as sete notas
      System.out.println("1 - Crie uma lista e adicione as sete notas");
      // List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); // 
      // List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // Limitada, não adiciona novos elementos ou retira
      // List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // Também cria uma lista imutável
      
      List<Double> notas = new ArrayList<>(); // Forma com diamond operator - indicada
      notas.add(7d); // Forma mais convencional
      notas.add(8.5d);
      notas.add(9.3d);
      notas.add(5d);
      notas.add(7d);
      notas.add(0d);
      notas.add(3.6d);

      System.out.println(notas);
      System.out.println(notas.toString());

      // 2 - Exiba a posição da nota 5.0
      System.out.println(" ");
      System.out.println("2 - Exiba a posição da nota 5.0");

      System.out.printf("Posição da nota: %d", notas.indexOf(5d));
      System.out.println(" ");

      // 3 - Adicione na lista a nota 8.0 na posição 4
      System.out.println(" ");
      System.out.println("3 - Adicione na lista a nota 8.0 na posição 4");

      notas.add(4, 8d);
      System.out.println(notas);

      // 4 - Substitua a nota 5.0 pela nota 6.0
      System.out.println(" ");
      System.out.println("4 - Substitua a nota 5.0 pela nota 6.0");

      notas.set(notas.indexOf(5d), 6d);
      System.out.println(notas);

      // 5 - Confira se a nota 5.0 está na lista
      System.out.println(" ");
      System.out.println("5 - Confira se a nota 5.0 está na lista");

      System.out.println(notas.contains(5d));

      // 6 - Exiba todas as notas na ordem em que foram informadas
      System.out.println(" ");
      System.out.println("6 - Exiba todas as notas na ordem em que foram informadas");

      for (Double nota : notas) System.out.printf("%s, ", nota);
      System.out.println(" ");

      // 7 - Exiba a terceira nota adicionada
      System.out.println(" ");
      System.out.println("7 - Exiba a terceira nota adicionada");

      System.out.printf("A terceira nota é a %f%n", notas.get(2));

      // 8 - Exiba a menor nota
      System.out.println(" ");
      System.out.println("8 - Exiba a menor nota");

      System.out.println(Collections.min(notas));

      // 9 - Exiba a maior nota
      System.out.println(" ");
      System.out.println("9 - Exiba a maior nota");

      System.out.println(Collections.max(notas));

      // 10 - Exiba a soma das notas
      System.out.println(" ");
      System.out.println("10 - Exiba a soma das notas");

      Iterator<Double> iterator = notas.iterator();
      double soma = 0d;
      while(iterator.hasNext()) {
        Double next = iterator.next();
        soma += next;
      }

      System.out.println(soma);

      // 11 - Exiba a média das notas
      System.out.println(" ");
      System.out.println("11 - Exiba a média das notas");

      System.out.println(soma / notas.size());

      // 12 - Remova a nota 0
      System.out.println(" ");
      System.out.println("12 - Remova a nota 0");

      notas.remove(0d);
      System.out.println(notas);

      // 13 - Remova a nota na posição 0
      System.out.println(" ");
      System.out.println("13 - Remova a nota 0");

      notas.remove(0);
      System.out.println(notas);

      // 14 - Remova as notas menores que 7 e exiba a lista
      System.out.println(" ");
      System.out.println("14 - Remova as notas menores que 7 e exiba a lista");

      Iterator<Double> iterator2 = notas.iterator();
      while(iterator2.hasNext()) {
        Double next = iterator2.next();
        if (next < 7) iterator2.remove();
      }

      System.out.println(notas);

      // 15 - Apague toda a lista
      System.out.println(" ");
      System.out.println("15 - Apague toda a lista");

      notas.clear();

      // 16 - Confira se a lista está vazia
      System.out.println(" ");
      System.out.println("16 - Confira se a lista está vazia");

      System.out.println(notas);

      System.out.println(" ");
    }
}
