package Collections.Map;

import java.util.*;

public class Desafio {
  public static void main(String[] args) {
    Random random = new Random();
    Integer one = 0;
    Integer two = 0;
    Integer three = 0;
    Integer four = 0;
    Integer five = 0;
    Integer six = 0;
    
    Map<Integer, Integer> dices = new LinkedHashMap<>();
    for (int i = 1; i <= 100; i += 1) {
      dices.put(i, (random.nextInt(6) + 1));
    }
    for (Map.Entry<Integer, Integer> dice : dices.entrySet()) {
      if (dice.getValue().equals(1)) one += 1;
      else if (dice.getValue().equals(2)) two += 1;
      else if (dice.getValue().equals(3)) three += 1;
      else if (dice.getValue().equals(4)) four += 1;
      else if (dice.getValue().equals(5)) five += 1;
      else if (dice.getValue().equals(6)) six += 1;
    }

    Map<String, Integer> results = new LinkedHashMap<>();
    results.put("1", one);
    results.put("2", two);
    results.put("3", three);
    results.put("4", four);
    results.put("5", five);
    results.put("6", six);

    Set<Map.Entry<String, Integer>> orderedResults = new TreeSet<>(new ComparatorResults());
    orderedResults.addAll(results.entrySet());

    for (Map.Entry<String,Integer> result : orderedResults) {
      System.out.println(result.getKey() + " - " + result.getValue());
    }
  }

  static class ComparatorResults implements Comparator<Map.Entry<String, Integer>> {

    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
      if (o2.getValue().compareTo(o1.getValue()) != 0) return o2.getValue().compareTo(o1.getValue());
      return o2.getKey().compareToIgnoreCase(o1.getKey());
    }
  }
}
