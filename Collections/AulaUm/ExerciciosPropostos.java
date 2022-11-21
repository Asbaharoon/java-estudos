package Collections.AulaUm;

import java.util.*;

public class ExerciciosPropostos {
  public static void main(String[] args) {
    investigation();
    averageTemperature();
  }

  public static void investigation() {
    Scanner scan = new Scanner(System.in);

    List<Boolean> answers = new ArrayList<>();

    System.out.println("Did you call the victim?");
    answers.add(scan.nextBoolean());

    System.out.println("Have you been to the crime scene?");
    answers.add(scan.nextBoolean());

    System.out.println("Do you leave near the victim");
    answers.add(scan.nextBoolean());

    System.out.println("Did you own money to the victim?");
    answers.add(scan.nextBoolean());

    System.out.println("Have you ever worked with the victim?");
    answers.add(scan.nextBoolean());

    Iterator<Boolean> iterator = answers.iterator();
    int yes = 0;
    while (iterator.hasNext()) {
      boolean next = iterator.next();
      if (next) yes += 1;
    }

    if (yes == 5) System.out.println("Assassin");
    else if (yes >= 3) System.out.println("Accomplice");
    else if (yes == 2) System.out.println("Suspect");
    else System.out.println("Innocent");

    scan.close();
  }

  public static void averageTemperature() {
    Random random = new Random();
    
    List<TemperatureMeasured> temperatures = new ArrayList<>();
    for (int i = 0; i <= 5; i += 1) {
      int randomTemp = random.nextInt(100);
      temperatures.add(new TemperatureMeasured(i, randomTemp));
    }

    int sum = 0;
    for (TemperatureMeasured temp : temperatures) {
      sum += temp.temperature;
    }

    int avg = sum / temperatures.size();

    for (TemperatureMeasured temp : temperatures) {
      String extMonth = extenseMonth(temp.month);
      if (temp.temperature >= avg) System.out.printf("O Mês de %s esteve acima da média de %d, tendo registrado a temperatura de %d.%n", extMonth, avg, temp.temperature);
    }

    System.out.printf("A soma das temperatures é %d.%n", sum);
    System.out.printf("A média das temperatures é %d.%n", avg);
  }

  public static String extenseMonth(int numericMonth) {
    switch (numericMonth) {
      case (0): return "Janeiro";
      case (1): return "Fevereiro";
      case (2): return "Março";
      case (3): return "Abril";
      case (4): return "Maio";
      case (5): return "Junho";
      default: return "Segundo Semestre";
    }

  }

  static class TemperatureMeasured {
    private int month;
    private int temperature;

    public TemperatureMeasured(int month, int temperature) {
      this.month = month;
      this.temperature = temperature;
    }

    public int getMonth() {
      return month;
    }

    public int getTemperature() {
      return temperature;
    }

    @Override
    public String toString() {
      return "{" +
      "month='" + month + '\'' +
      ", temperature='" + temperature + '\'' +
      "}";
    }
  }
}
