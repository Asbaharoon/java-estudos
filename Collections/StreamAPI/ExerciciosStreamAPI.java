package Collections.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
  // Lembrando, há dois tipos de oprações na Stream:
  //
  // - Intermediária:   onde retorna uma stream - podem haver várias encadeadas.
  // - Terminais:       usada ao fim, retorna um objeto/valor.
  public static void main(String[] args) {
    List<String> randomNum = Arrays.asList("1", "0", "2", "4", "9", "9", "5", "2", "6");

    System.out.println("1 - Imprima todos os elementos dessa Lista de String");
    // Forma Normal
    // randomNum.stream().forEach(new Consumer<String>() {
    //   @Override
    //   public void accept(String s) {
    //     System.out.println(s);
    //   }
    // });

    // Com Lambda
    // randomNum.forEach(string -> System.out.println(string));

    // Com Reference Method
    randomNum.forEach(System.out::println);
    System.out.println(" ");

    System.out.println("2 - Pegue os cinco primeiros números da array e coloque dentro de um Set");
    randomNum.stream()
      .limit(5)
      .collect(Collectors.toSet())
      .forEach(System.out::println);
    System.out.println(" ");
      
    System.out.println("3 - Transforme esta lista de String em uma lista de números inteiros");
    // Forma normal
    // randomNum.stream()
    //   .map(new Function<String, Integer>() {
    //     @Override
    //     public Integer apply(String s) {
    //       return Integer.parseInt(s);
    //     }
    //   });

    // Lambda
    // randomNum.stream()
    //   .map(s -> Integer.parseInt(s));

    // Reference Method
    List<Integer> numsAsIntegers = randomNum.stream()
                                          .map(Integer::parseInt)
                                          .collect(Collectors.toList());
    System.out.println(numsAsIntegers);
    System.out.println(" ");

    System.out.println("4 - Pegue os números pares maiores que dois e coloque em uma lista");
    // Normal
    // List<Integer> evenNumbers = randomNum.stream().map(Integer::parseInt)
    //   .filter(new Predicate<Integer>() {
    //     @Override
    //     public boolean test(Integer integer) {
    //       if (integer % 2 == 0 && integer > 2) return true;
    //       return false;
    //     }
    //   })
    //   .collect(Collectors.toList());
    
    // Com lambda
    List<Integer> evenNumbersBiggerThanTwo = randomNum.stream().map(Integer::parseInt)
      .filter(integer -> integer % 2 == 0 && integer > 2)
      .collect(Collectors.toList());
    System.out.println(evenNumbersBiggerThanTwo);

    System.out.println("5 - Mostre a média dos números");
    randomNum.stream()
      .mapToInt(Integer::parseInt)
      .average()
      .ifPresent(System.out::println);
    System.out.println(" ");

    System.out.println("6 - Remova os valores ímpares");
    // Normal
    // numsAsIntegers.removeIf(new Predicate<Integer>() {
    //   @Override
    //   public boolean test(Integer integer) {
    //     if (integer % 2 != 0) return true;
    //     return false;
    //   }
    // });

    // Com Filter
    // List<Integer> evenNums = randomNum.stream()
    //                                     .map(Integer::parseInt)
    //                                     .filter(integer -> integer % 2 == 0)
    //                                     .collect(Collectors.toList());

    // Com removeIf
    // List<Integer> numsAsIntegers = randomNum.stream()
    //                                       .map(Integer::parseInt)
    //                                       .collect(Collectors.toList());
    numsAsIntegers.removeIf(integer -> integer % 2 != 0);
    System.out.println(numsAsIntegers);
    System.out.println(" ");

    System.out.println("7 - Ignore os 3 primeiros elementos da lista e imprima o restante");
    List<Integer> ignoredFirstThree = randomNum.stream().skip(3).map(Integer::parseInt).collect(Collectors.toList());
    System.out.println(ignoredFirstThree);
    System.out.println(" ");

    System.out.println("8 - Retirando os números repetidos da lista, quantos números ficam?");
    Integer ignoreRepeatedCount = randomNum.stream().map(Integer::parseInt).collect(Collectors.toSet()).size();
    System.out.println(ignoreRepeatedCount);
    System.out.println(" ");
    
    System.out.println("9 - Mostre o menor valor da lista");
    // Comparator.comparing(cont -> cont.getValue().getNumber())
    Integer minNumber = randomNum.stream().mapToInt(Integer::parseInt).min().orElseThrow(NoSuchElementException::new);
    System.out.println(minNumber);
    System.out.println(" ");

    System.out.println("10 - Mostre o maior valor da lista");
    Integer maxNumber = randomNum.stream().mapToInt(Integer::parseInt).max().orElseThrow(NoSuchElementException::new);
    System.out.println(maxNumber);
    System.out.println(" ");

    System.out.println("11 - Pegue apenas os números ímpares e some");
    int sum = randomNum.stream().map(Integer::parseInt).filter(i -> i % 2 != 0).reduce(0, Integer::sum);
    System.out.println(sum);
    System.out.println(" ");

    System.out.println("12 - Moostre a lista na ordem númerica");
    // List<Integer> orderedList = randomNum.stream().map(Integer::parseInt).sorted(Comparator.comparing(cont -> cont)).collect(Collectors.toList()); - lembrar dessa formatação quando for usar classes
    List<Integer> orderedList = randomNum.stream().map(Integer::parseInt).sorted().collect(Collectors.toList());
    System.out.println(orderedList);
    System.out.println(" ");

    System.out.println("13 - Agrupe os valores ímpares múltiplos de 3 e de 5");
    // dica: collect(Collectors.groupingBy(new Function()));
    Map<Object, List<Integer>> groupedList = randomNum.stream().map(Integer::parseInt).sorted().collect(Collectors.groupingBy(i -> i % 3 == 0 || i % 5 == 0));
    System.out.println(groupedList);
    System.out.println(" ");
  }
}
