package Collections.Map;

import java.util.*;

public class ExerciciosPropostos {
  public static void main(String[] args) {
    System.out.println(" ");
    System.out.println("Crie o dicionário:");
    Map<String, Integer> states = new HashMap<>(){{
      put("PE", 9616621);
      put("AL", 3351543);
      put("CE", 9187103);
      put("RN", 3534265);
    }};
    System.out.println(states);
    System.out.println(" ");

    System.out.println("Substitua a população do estado do RN por 3.534.165:");
    states.put("RN", 3534165);
    System.out.println(states.get("RN"));
    System.out.println(" ");

    System.out.println("Confira se o estado da Paraíba está no dicionário:");
    System.out.println(states.containsKey("PB"));
    System.out.println(" ");

    System.out.println("Exiba a população de PE:");
    System.out.println(states.get("PE"));
    System.out.println(" ");

    System.out.println("Exiba todos os estados e suas populações na ordem em que foram informados:");
    Map<String, Integer> orderedStates = new LinkedHashMap<>(){{
      put("PE", 9616621);
      put("AL", 3351543);
      put("CE", 9187103);
      put("RN", 3534265);
    }};
    for (Map.Entry<String, Integer> state : orderedStates.entrySet()) {
      System.out.println(state.getKey() + " // " + state.getValue());
    }
    System.out.println(" ");

    System.out.println("Exiba os estados e suas populações em ordem alfábetica:");
    Map<String, Integer> orderedAlphabeticStates = new TreeMap<>(){{
      put("PE", 9616621);
      put("AL", 3351543);
      put("CE", 9187103);
      put("RN", 3534265);
    }};
    for (Map.Entry<String, Integer> state : orderedAlphabeticStates.entrySet()) {
      System.out.println(state.getKey() + " // " + state.getValue());
    }
    System.out.println(" ");

    System.out.println("Exiba o estado com a menor população e sua quantidade:");
    Integer min = Collections.min(orderedAlphabeticStates.values());
    for (Map.Entry<String, Integer> state : orderedAlphabeticStates.entrySet()) {
      if (state.getValue().equals(min)) System.out.println(state.getKey() + " // " + state.getValue());
    }
    System.out.println(" ");

    System.out.println("Exiba o estado com a maior população e sua quantidade:");
    Integer max = Collections.max(orderedAlphabeticStates.values());
    for (Map.Entry<String, Integer> state : orderedAlphabeticStates.entrySet()) {
      if (state.getValue().equals(max)) System.out.println(state.getKey() + " // " + state.getValue());
    }
    System.out.println(" ");

    System.out.println("Exiba a soma da população dos estados:");
    Integer sum = 0;
    for (Map.Entry<String, Integer> state : orderedAlphabeticStates.entrySet()) {
      sum += state.getValue();
    }
    System.out.println(sum);
    System.out.println(" ");

    System.out.println("Exiba a média da população dos estados:");
    System.out.println(sum / orderedAlphabeticStates.size());
    System.out.println(" ");

    System.out.println("Remova os estados com população menor qeu 4.000.000:");
    Iterator<Integer> iterator = orderedAlphabeticStates.values().iterator();
    while(iterator.hasNext()) {
      if (iterator.next() < 4000000) iterator.remove();
    }
    System.out.println(orderedAlphabeticStates);
    System.out.println(" ");

    System.out.println("Apague o dicionário de estados:");
    orderedAlphabeticStates.clear();
    System.out.println(orderedAlphabeticStates);
    System.out.println(" ");

    System.out.println("Confira se o dicionário está vazio:");
    System.out.println(orderedAlphabeticStates.isEmpty());
  }

}
