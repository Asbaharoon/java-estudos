package Collections.List;

import java.util.*;

public class ExercicioLinkedList {
  
  public static void main(String[] args) {
    
    // 1 - Crie uma lista chamada notas e coloque todos os elementos da lista ArrayList nessa nova lista.
    System.out.println("1 - Crie uma lista chamada notas e coloque todos os elementos da lista ArrayList nessa nova lista");

    List<Double> notasArrayList = new ArrayList<>();
    notasArrayList.add(7d);
    notasArrayList.add(8.5d);
    notasArrayList.add(9.3d);
    notasArrayList.add(5d);
    notasArrayList.add(7d);
    notasArrayList.add(0d);
    notasArrayList.add(3.6d);

    LinkedList<Double> notas = new LinkedList<>();
    notas.addAll(notasArrayList);

    System.out.println(notas);
    System.out.println(" ");

    // 2 - Mostre a primeira nota da nova lista sem removê-lo
    System.out.println("2 - Mostre a primeira nota da nova lista sem removê-lo");

    System.out.println(notas.getFirst());
    System.out.println(notas);

    System.out.println(" ");
    // 3 - Mostre a primeira nota da nova lista removendo-o
    System.out.println("3 - Mostre a primeira nota da nova lista removendo-o");

    System.out.println(notas.removeFirst());
    System.out.println(notas);

    System.out.println(" ");
  }
}
