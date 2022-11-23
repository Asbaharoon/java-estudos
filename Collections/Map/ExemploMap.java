package Collections.Map;

import java.util.*;
import java.util.Map.Entry;

public class ExemploMap {
  // Dado os modelos dos carros e seus respectivos consumos na estrada, faça o que se pede.
  // modelo - consumo
  // gol, 14,4km/l
  // uno, 15,6km/l
  // mobi, 16,1km/l
  // hb20, 14,5km/l
  // kwid, 15,6km/l

  public static void main(String[] args) {
    // 1 - Crie o Map
    System.out.println("1 - Crie o Map");

    Map<String, Double> carsConsumption = new HashMap<>(){{
      put("gol", 14.4);
      put("uno", 15.6);
      put("mobi", 16.1);
      put("hb20", 14.5);
      put("kwid", 15.6);
    }};
    System.out.println(carsConsumption.toString());

    System.out.println(" ");

    // 2 - Substituir o consumo do gol por 15.2km/l
    System.out.println("2 - Substituir o consumo do gol por 15.2km/l");
    
    carsConsumption.put("gol", 15.2);
    System.out.println(carsConsumption.toString());

    System.out.println(" ");

    // 3 - Conferir se o modelo Tucson está no Map
    System.out.println("3 - Conferir se o modelo Tucson está no Map");

    System.out.println(carsConsumption.containsKey("tucson"));
    
    System.out.println(" ");

    // 4 - Exiba o consumo do uno
    System.out.println("4 - Exiba o consumo do uno");
    
    System.out.println(carsConsumption.get("uno"));

    System.out.println(" ");

    // Exibir o terceiro modelo adicionado
    // Como no Set, não há método para mostrar o 3º.

    // 5 - Exibir os modelos dos carros
    System.out.println("5 - Exibir os modelos dos carros");

    Set<String> keySet = carsConsumption.keySet();
    System.out.println(keySet);

    System.out.println(" ");

    // 6 - Exibir o consumo dos carros
    System.out.println("6 - Exibir o consumo dos carros");

    Collection<Double> values = carsConsumption.values();
    System.out.println(values);

    System.out.println(" ");

    // 7 - Exiba o modelo mais econômico e seu consumo
    System.out.println("7 - Exiba o modelo mais econômico e seu consumo");

    Double max = Collections.max(carsConsumption.values());
    Set<Entry<String, Double>> entrySet = carsConsumption.entrySet();
    String efficientModel = "";
    for (Entry<String,Double> entry : entrySet) {
      if (entry.getValue() == max) efficientModel = entry.getKey();
    }
    System.out.printf("The least efficient model is %s, with a consumption of %f per liter.%n", efficientModel, max);

    System.out.println(" ");

    // 8 - Exibir o modelo menos econômico e seu consumo
    System.out.println("8 - Exibir o modelo menos econômico e seu consumo");

    String nonEfficientModel = ""; 
    Double min = Collections.min(carsConsumption.values());
    for (Entry<String,Double> entry : entrySet) {
      if (entry.getValue().equals(min)) nonEfficientModel = entry.getKey();
    }
    System.out.printf("The least efficient model is %s, with a consumption of %f per liter.%n", nonEfficientModel, min);

    System.out.println(" ");

    // 9 - Exiba a soma dos consumos
    System.out.println("9 - Exiba a soma dos consumos");

    Double sum = 0d;
    for (Entry<String,Double> entry : entrySet) {
      sum += entry.getValue();
    }
    // Iterator<Double> iterator = carsConsumption.values().iterator();
    // while(iterator.hasNext()) {
    //  sum += iterator.next();
    // }

    System.out.println(sum);

    System.out.println(" ");

    // 10 - Exiba a média dos consumos deste dicionário de carros
    System.out.println("10 - Exiba a média dos consumos deste dicionário de carros");

    System.out.println(sum / entrySet.size());

    System.out.println(" ");

    // 11 - Remova os modelos com o consumo igual a 15,6km/l
    System.out.println("11 - Remova os modelos com o consumo igual a 15,6km/l");

    Iterator<Double> iterator = carsConsumption.values().iterator();
    while(iterator.hasNext()) {
     if (iterator.next().equals(15.6)) iterator.remove();
    }
    System.out.println(carsConsumption);

    System.out.println(" ");

    // 12 - Exibir o dicionário ordenado pelo modelo
    System.out.println("12 - Exibir o dicionário ordenado pelo modelo");

    Map<String, Double> carsConsumptionOrder = new LinkedHashMap<>(){{
      put("gol", 14.4);
      put("uno", 15.6);
      put("mobi", 16.1);
      put("hb20", 14.5);
      put("kwid", 15.6);
    }};
    System.out.println(carsConsumptionOrder.toString());

    System.out.println(" ");

    // 13 - Exibir o dicionário pela ordem de modelo
    System.out.println("13 - Exibir o dicionário pela ordem de modelo");

    Map<String, Double> carsConsumptionModelOrder = new TreeMap<>(carsConsumptionOrder);
    System.out.println(carsConsumptionModelOrder.toString());

    System.out.println(" ");

    // 14 - Apagar o conjunto de carros
    System.out.println("14 - Apagar o conjunto de carros");

    carsConsumption.clear();
    System.out.println(carsConsumption);

    System.out.println(" ");

    // 15 - Verificar se a lista está vazia
    System.out.println("15 - Verificar se a lista está vazia");

    System.out.println(carsConsumption.isEmpty());

    System.out.println(" ");
  }
  

  
}